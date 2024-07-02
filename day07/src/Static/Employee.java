package Static;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(String employeeName, String department){
        this.employeeId = serialNum++;
        this.employeeName = employeeName;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo() {
        System.out.println(employeeId + " / " + employeeName + " / " + department);
    }
}
