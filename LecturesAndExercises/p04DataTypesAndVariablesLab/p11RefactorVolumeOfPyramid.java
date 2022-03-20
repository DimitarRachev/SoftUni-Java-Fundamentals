package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double Lenght, sh, V, H = 0;
        System.out.print("Length: ");
        double Lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double widht = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        double V = (Lenght * widht * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);


    }
}
