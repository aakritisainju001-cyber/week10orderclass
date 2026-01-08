package Orderclass;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp{

    public static void main(String[] args) {

        NormalOrder normalOrder =
                new NormalOrder(501, "Aakriti", 3500, 150);

        PremiumOrder premiumOrder =
                new PremiumOrder(502, "Ramesh", 6000, 500);

        System.out.println("------ INVOICE ------");

        System.out.println("\nNormal Order:");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " + normalOrder.calculateFinalAmount());
        System.out.println("Final Amount (After Discount): " +
                normalOrder.calculateFinalAmount(200));

        System.out.println("\nPremium Order:");
        System.out.println(premiumOrder);
        System.out.println("Final Amount: " + premiumOrder.calculateFinalAmount());
        System.out.println("Final Amount (After Extra Discount): " +
                premiumOrder.calculateFinalAmount(300));
    }
}
