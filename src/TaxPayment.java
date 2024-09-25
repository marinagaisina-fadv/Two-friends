public class TaxPayment {
    String empoyeeName;
    double incomTax;

    public String getEmpoyeeName() {
        return empoyeeName;
    }

    public void setEmpoyeeName(String empoyeeName) {
        this.empoyeeName = empoyeeName;
    }

    public double getIncomTax() {
        return incomTax;
    }

    public void setIncomTax(double incomTax) {
        this.incomTax = incomTax;
    }

    public TaxPayment(String empoyeeName, double incomTax) {
        this.empoyeeName = empoyeeName;
        this.incomTax = incomTax;
    }
}
