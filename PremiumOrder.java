package Orderclass;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order {

    private double premiumDiscount;

    public PremiumOrder(int orderId, String customerName, double amount, double premiumDiscount) {
        super(orderId, customerName, amount);
        this.premiumDiscount = premiumDiscount;
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() - premiumDiscount;
    }

    public double calculateFinalAmount(double extraDiscount) {
        return calculateFinalAmount() - extraDiscount;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Order Type: Premium" +
               ", Premium Discount: " + premiumDiscount;
    }
}
