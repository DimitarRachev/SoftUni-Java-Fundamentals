package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class testComputerStoreExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWithoutTax = 0;
        double totalPrice=0;
        double totalPriceWithoutDiscount = 0;

        String priceOfParts = scanner.nextLine();
        while(!priceOfParts.equals("special") && !priceOfParts.equals("regular")){

       double currentPrice = Double.parseDouble(priceOfParts);
            if (currentPrice < 0 ) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTax += currentPrice;
            }


       priceOfParts = scanner.nextLine();
        }
totalPriceWithoutDiscount = priceWithoutTax * 1.2;
        if (priceOfParts.equals("special")) {
            totalPrice =totalPriceWithoutDiscount * 0.9;
        } else {
            totalPrice = totalPriceWithoutDiscount;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTax);
            System.out.printf("Taxes: %.2f$%n", totalPriceWithoutDiscount - priceWithoutTax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
