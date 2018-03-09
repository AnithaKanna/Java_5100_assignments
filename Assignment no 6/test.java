import java.text.DecimalFormat;

public class test {


    public static void main(String args[]) {
        checkout Checkout = new checkout();
        Checkout.enterItem(new candy("Peanut Butter Fudge", 2.25f, 399));
        Checkout.enterItem(new icecream("Vanilla Ice Cream", 105));
        Checkout.enterItem(new sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        Checkout.enterItem(new cookie("Oatmeal Raisin Cookies", 4, 399));

        System.out.println("\nNumber of items:\t" + Checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost\t" +new DecimalFormat("#.00").format( Checkout.totalcost()/100) + "\n");
        System.out.println("\nTotal tax:\t" + new DecimalFormat("#.00").format(Checkout.TotalTax()/100) + "\n");
        System.out.println("\nCost + Tax:\t" + new DecimalFormat("#.00").format((Checkout.totalcost() + Checkout.TotalTax())/100) + "\n");
        System.out.println(Checkout);

        Checkout.clear();
        Checkout.enterItem(new icecream("Strawberry Ice Cream", 145));
        Checkout.enterItem(new sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        Checkout.enterItem(new candy("Gummy Worms", 1.33f, 89));
        Checkout.enterItem(new cookie("Chocolate Chip Cookies", 4, 399));
        Checkout.enterItem(new candy("Salt Water Taffy", 1.5f, 209));
        Checkout.enterItem(new candy("Candy Corn", 3.0f, 109));

        System.out.println("\nNumber of items: " + Checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost\t" +new DecimalFormat("#.00").format(Checkout.totalcost()/100) + "\n");
        System.out.println("\nTotal tax:\t" + new DecimalFormat("#.00").format(Checkout.TotalTax()/100) + "\n");
        System.out.println("\nCost + Tax:\t" + new DecimalFormat("#.00").format((Checkout.totalcost() + Checkout.TotalTax())/100) + "\n");
        System.out.println(Checkout);

    }
}


