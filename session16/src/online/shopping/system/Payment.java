package online.shopping.system;

public class Payment {

    private String paymentMethod;
    private double paymentAmount;
    private boolean paymentStatus;

    public Payment(String paymentMethod, double paymentAmount) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }

    public void processPayment() {
        System.out.println(" Payment processed successfully. ");
        this.paymentStatus = true;
    }

    public void displayPayment() {
        System.out.println(" Payment Method: " + paymentMethod);
        System.out.println(" Payment Amount: " + paymentAmount);
        System.out.println(" Payment Status: " + (paymentStatus ? " Paid " : " Unpaid "));
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
