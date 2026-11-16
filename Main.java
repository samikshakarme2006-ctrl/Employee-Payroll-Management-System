
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Samiksha", 25000);

        Payroll payroll = new Payroll();

        System.out.println("EMPLOYEE PAYROLL SYSTEM");
        System.out.println("-----------------------");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + payroll.calculateGross(emp));
        System.out.println("Net Salary: " + payroll.calculateNet(emp));
    }
}
