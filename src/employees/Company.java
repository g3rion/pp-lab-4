package employees;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Walter White", 30000.00);
        employees[1] = new Worker("Jesse Pinkman", 17500.00, "CFO");
        employees[2] = new Employee("Gustavo Fring", 280000.00);
        employees[3] = new Employee("Saul Goodman", 80000.00);
        employees[4] = new Worker("Mike Ehrmantraut", 25000.00, "Senior Manager");
        employees[5] = new Manager("Skyler White", 32000.00);
        employees[6] = new Worker("Hank Schrader", 22000.00, "Security Chief");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
        }

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager)employee).setNumberOfSubordinates(nonManagerCount);
                employee.setSalary(7500.00);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
