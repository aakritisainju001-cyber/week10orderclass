package Orderclass;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order {

    private double deliveryCharge;

    public NormalOrder(int orderId, String customerName, double amount, double deliveryCharge) {
        super(orderId, customerName, amount);
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + deliveryCharge;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount() - discountAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Order Type: Normal" +
               ", Delivery Charge: " + deliveryCharge;
    }
}
