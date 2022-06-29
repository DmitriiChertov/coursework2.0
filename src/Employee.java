import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private float salary;
    private int departmentNumber;
    private int id;
    private static int counter;
    public Employee(String name, String surname, String patronymic, float salary, int departmentNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getCounter() {
        return counter;
    }
    @Override
    public String toString() {
        return "Ф.И.О. сотрудника: " + this.name + " " + this.surname + " " + this.patronymic + "; Зарплата сотрудника: " + this.salary + "; Отдел №: " + this.departmentNumber + "; Личный номер сотдурника: " + this.id + ";" + " ";
    }
}
