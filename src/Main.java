public class Main {

    public static void countMinSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalary() > employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " рублей - " + emp.getName() + " " + emp.getSurname() + " " + emp.getPatronymic());
        } else {
            System.out.println("Массив пустой");
        }
    }
    public static void countMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalary() < employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с максимально  зарплатой: " + emp.getSalary() + " рублей - " + emp.getName() + " " + emp.getSurname() + " " + emp.getPatronymic());
        } else {
            System.out.println("Массив пустой");
        }
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат на зарплаты в месяц: " + sum + " рублей");
        return sum;
    }
    public static float middleSumSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary() / 10;
        }
        System.out.println("Средняя зарплата: " + sum + " рублей");
        return sum;
    }

    public static void allStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void staffName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудники кампании: " + employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymic());
        }
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Георгий", "Евгеньевич", "Широков", 189990.0F, 1, 0);
        employee[1] = new Employee("Василий", "Генадьевич", "Прохоров", 188468.0F, 4, 0);
        employee[2] = new Employee("Кристина", "Андреевна", "Крылова", 202079.0F, 2, 0);
        employee[3] = new Employee("Андрей", "Васильевич", "Сухов", 198352.0F, 1, 0);
        employee[4] = new Employee("Игорь", "Андреевич", "Конопля", 220987.0F, 3, 0);
        employee[5] = new Employee("Дмитрий", "Александрович", "Шац", 216875.0F, 4, 0);
        employee[6] = new Employee("Константин", "Григорьевич", "Сухоруков", 249785.0F, 5, 0);
        employee[7] = new Employee("Александра", "Прокофьевна", "Иванова", 198732.0F, 3, 0);
        employee[8] = new Employee("Юлия", "Евгеньевна", "Смолина", 160798.0F, 4, 0);
        employee[9] = new Employee("Татьяна", "Станиславовна", "Исаева", 190875.0F, 4, 0);

        countMinSalary(employee);
        countMaxSalary(employee);
        sumSalary(employee);
        middleSumSalary(employee);
        allStaff(employee);
        staffName(employee);
    }
}