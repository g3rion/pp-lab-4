import employees.Employee;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Walter White", 30000.00);
        employees[1] = new Employee("Jesse Pinkman", 17500.00);
        employees[2] = new Employee("Gustavo Fring", 280000.00);
        employees[3] = new Employee("Saul Goodman", 80000.00);
        employees[4] = new Employee("Mike Ehrmantraut", 25000);

        System.out.println(employees[3]);

        employees[3].setSalary(85000.00);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}