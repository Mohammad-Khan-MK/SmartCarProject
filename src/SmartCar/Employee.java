package SmartCar;

public class Employee extends Person {
    private int empNo;

    public Employee(String firstName, String lastName, String email, String addressLine1, String addressLine2, String city, String eirCode, int empNo) {
        super(firstName, lastName, email, addressLine1, addressLine2, city, eirCode);
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Override
    public String toString() {
        return String.format("""
                Employee Number: %s %s
                """,empNo, super.toString());
    }
}
