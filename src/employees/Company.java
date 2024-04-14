package employees;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Walter White", 30000.00);  // Manager
        employees[1] = new Worker("Jesse Pinkman", 17500.00, "CFO");
        employees[2] = new Employee("Gustavo Fring", 280000.00);
        employees[3] = new Employee("Saul Goodman", 80000.00);
        employees[4] = new Worker("Mike Ehrmantraut", 25000.00, "Senior Manager");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager)employees[0]).setNumberOfSubordinates(nonManagerCount);
            employees[0].setSalary(7500.00);
        }

        System.out.println("Employee at index 3: " + employees[3]);

        System.out.println("All employees details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
