package LecturesAndExercises.p02.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0f;
        switch (day) {
            case "Friday":
                if (typePeople.equals("Students")) {
                    price = 8.45;
                } else if (typePeople.equals("Business")) {
                    price = 10.9;
                } else if (typePeople.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (typePeople.equals("Students")) {
                    price = 9.80;
                } else if (typePeople.equals("Business")) {
                    price = 15.6;
                } else if (typePeople.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (typePeople.equals("Students")) {
                    price = 10.46;
                } else if (typePeople.equals("Business")) {
                    price = 16;
                } else if (typePeople.equals("Regular")) {
                    price = 22.5;
                }
                break;
        }
        if (typePeople.equals("Business") && NumPeople >= 100) {
            NumPeople -= 10;
        }
        //double total = NumPeople * price;
        if (typePeople.equals("Students") && NumPeople >= 30) {
            price *= 0.85;
        }
        if (typePeople.equals("Regular") && NumPeople >= 10 && NumPeople <= 20) {
            price *= 0.95;
        }
        // double total = NumPeople * price;
        System.out.printf("Total price: %.2f", NumPeople * price);

    }
}
