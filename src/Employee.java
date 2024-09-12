import java.util.Objects;

public class Employee {
    private final String fullName;
    private int salaryEmployee;
    private int employeesDepartment;
    private static int idEmployees = 0; //статическая переменная-счетчик
    private final int id; //уникальный идентификатор для каждого сотрудника

    public Employee(String fullName, int salaryEmployee,
                    int employeesDepartment) {
        this.fullName = fullName;
        this.salaryEmployee = salaryEmployee;
        this.employeesDepartment = employeesDepartment;
        this.id = ++idEmployees;
    }



    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.id;
    }

    public int getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public int getEmployeesDepartment() {
        return this.employeesDepartment;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public void setEmployeesDepartment(int employeesDepartment) {
        this.employeesDepartment = employeesDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salaryEmployee == employee.salaryEmployee && employeesDepartment == employee.employeesDepartment && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salaryEmployee, employeesDepartment, id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Employee: " + fullName + ", Salary: " +
                salaryEmployee + ", Department: " + employeesDepartment;
    }
}

