public class Main {

    private static final Employee[] employees = {
            new Employee("Rostkova Pipa Pipachkina", 999_000, 3),
            new Employee("Zanina Nina Ninachkina", 800_000, 2),
            new Employee("Pusikovich Alex Alexandrovich", 5_000, 4),
            new Employee("Popkov Tolik Tolikovich", 950_000, 5),
            new Employee("Bublik Bastard Bastardovich", 10_000, 1)
    };

    public static void printAllEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum += employee.getSalaryEmployee();
            }
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (employeeWithMinSalary == null || employeeWithMinSalary.getSalaryEmployee() > employee.getSalaryEmployee())) {
            employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null  && (employeeWithMaxSalary == null || employeeWithMaxSalary.getSalaryEmployee() < employee.getSalaryEmployee())) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employees.length;
    }

    private static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        printAllEmployees();
        findEmployeeWithMaxSalary();

        System.out.println("Сумма ЗП сотрудников: " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП: " + calculateAverageOfSalaries());
        printFullNames();

    }
}



