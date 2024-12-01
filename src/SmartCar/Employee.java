package SmartCar;

public class Employee extends Person {
    private int empNo;

    public Employee(String firstName, String lastName, String email, String address, int empNo) {
        super(firstName, lastName, email, address);
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
                Employee No: %s
                %s
                """,empNo,super.toString());
    }
}
