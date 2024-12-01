package SmartCar;

public class Customer extends Person {
    private int custNo;

    public Customer(String firstName, String lastName, String email, String address, int custNo) {
        super(firstName, lastName, email, address);
        this.custNo = custNo;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    @Override
    public String toString() {
        return String.format("""
                Customer No: %s
                %s
                """,custNo,super.toString());
    }


}
