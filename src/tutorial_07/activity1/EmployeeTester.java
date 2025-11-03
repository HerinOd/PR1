package tutorial_07.activity1;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee_01 = new Employee("HieuDo", 20000);
        System.out.println(employee_01.getName() + " is paid $" + employee_01.getSalary() + "/month.");

        System.out.println(" ");
        System.out.println("HieuDo's salary has been raised by 1%.");
        employee_01.raiseSalary(1);
        System.out.println(employee_01.getName() + " is paid $" + employee_01.getSalary() + "/month.");
    }
}
