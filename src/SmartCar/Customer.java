package SmartCar;

public class Customer extends Person {
    private int custNo;

    public Customer(String firstName, String lastName, String email, String addressLine1, String addressLine2, String city, String eirCode, int custNo) {
        super(firstName, lastName, email, addressLine1, addressLine2, city, eirCode);
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
                Customer Number: %s %s
                """,custNo, super.toString());
    }
}
