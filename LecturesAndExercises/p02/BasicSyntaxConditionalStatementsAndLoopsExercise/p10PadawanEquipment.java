package LecturesAndExercises.p02.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p10PadawanEquipment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double availableMoney = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightSaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());
        double lightSabers = Math.ceil(students * 1.1);
        int freeBelts = students / 6;
        int belts = students - freeBelts;
        double total = lightSaberPrice * lightSabers + robePrice * students + beltPrice * belts;
        if (total <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - availableMoney);
        }
    }
}
