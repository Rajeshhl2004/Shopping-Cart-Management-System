import java.util.Scanner;

public class Upload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double total = 0;
        int purchase = 0;
        int itemNumber = 0;
        int itemQuantity = 0;
        // item name and cost and total
        // String itemName = "";
        // double itemCost = 0.0;
        double totalItem = 0.0;
        int countQ1 = 0;
        int countQ2 = 0;
        int countQ3 = 0;

        System.out.println("Item code            Item name               Cost");
        System.out.println("1                    T-Shirt                 $15.99");
        System.out.println("2                    Jeans                   $29.99");
        System.out.println("3                    Shoes                   $49.99");

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter the number of item you want to purchase: ");
        purchase = sc.nextInt();

        for (int i = 1; i <= purchase; i++) {
            System.out.print("Enter the item number " + i + ": ");
            itemNumber = sc.nextInt();

            System.out.print("Enter the quantity: ");
            itemQuantity = sc.nextInt();

            if (itemNumber == 1) {
                // itemNumber = 1;

                // itemName = "T-Shirt";
                // itemCost = 15.99;
                countQ1 = countQ1 + itemQuantity;
                
                totalItem = 15.99 * itemQuantity;
                total = total + totalItem;
            } else if (itemNumber == 2) {

                // itemNumber = 2;

                // itemName = "Jeans";
                // itemCost = 29.99;
                countQ2 = countQ2 + itemQuantity;

                totalItem = 29.99 * itemQuantity;
                total = total + totalItem;
            } else if (itemNumber == 3) {

                // itemNumber = 3
                // itemName = "Shoes";
                // itemCost = 49.99;
                countQ3 = countQ3 + itemQuantity;

                totalItem = 49.99 * itemQuantity;
                total = total + totalItem;
            }
        }

        System.out.println("Name: " + name);

        System.out.println("Item Purchased:");

        System.out.printf("%-10s %-10s %-10s %-12s %-12s", "Item/Number", "Item", "Quantity", "Cost/item",
                "Total Costs \n");

        

        if(countQ1 != 0){
              System.out.printf("%-10d %-10s %-10d %-12s %-12.2f \n", 1, "T-Shirt", countQ1, "$15.99",
                    (countQ1 * 15.99), "\n");
        }

        if(countQ2 != 0){
              System.out.printf("%-10d %-10s %-10d %-12s %-12.2f \n", 2, "Jeans", countQ2, "$29.99",
                    (countQ2 * 29.99), "\n");
        }
        if(countQ3 != 0){
              System.out.printf("%-10d %-10s %-10d %-12s %-12.2f \n", 3, "Shoes", countQ3, "$49.99",
                    (countQ3 * 49.99), "\n");
        }
        // totalItem = itemCost * itemQuantity;
        // total = totalItem;

        System.out.printf("Total cost before discount: $%.2f \n", total);

        double firstDiscount = 0.0;
        double secondDiscount = 0.0;

        if (purchase >= 3) {
            // 5% discount
            firstDiscount = total * 0.05;

        }

        if (total > 80.0) {
            // 10% discount
            secondDiscount = total * 0.10;

        }

        double discountAmount = firstDiscount + secondDiscount;
        double finalTotal = total - discountAmount;
        double appliedDiscount = 0.0;

        if (firstDiscount > 0 && secondDiscount > 0) {
            appliedDiscount = 15;
        } else if (firstDiscount > 0) {
            // 5% discount
            appliedDiscount = 5;
        } else if (secondDiscount > 0) {
            // 10% discount
            appliedDiscount = 10;
        }

        System.out.printf("Applied Discount: $%.2f \n", appliedDiscount, "%");

        System.out.printf("Discount amount: $%.2f \n", discountAmount);

        System.out.printf("Final Total cost: $%.2f \n", finalTotal);

        System.out.println("Thank You For Buying!");

    }

}