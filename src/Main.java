import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Маша", "Саша", "Женя", "Виталик", "Толик"};
    private final static String[] LASTNAME = {"Машина", "Сашков", "Женщина", "Вита", "Толика"};
    private final static String[] PATRONYMIC = {"Максимовна", "Сашковна", "Женикбекович", "Витальевна", "Толикович"};

    private static final Employee[] employees = new Employee[10];

    private static void addEmployees() {
        for (int i = 0; i < employees.length; i++) {
            String fullName = LASTNAME[RANDOM.nextInt(0, LASTNAME.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    PATRONYMIC[RANDOM.nextInt(0, PATRONYMIC.length)];
            employees[i] = new Employee(fullName, RANDOM.nextInt(50_000, 100_000), RANDOM.nextInt(1, 6));
        }

    }

    private static void printAllEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryEmployee();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalaryEmployee() < employeeWithMinSalary.getSalaryEmployee()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalaryEmployee() > employeeWithMaxSalary.getSalaryEmployee()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries()/employees.length;
    }

    private static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        addEmployees();
        printAllEmployees();
        System.out.println("Сумма ЗП сотрудников: " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП: " + calculateAverageOfSalaries());
        printFullNames();

    }
}



