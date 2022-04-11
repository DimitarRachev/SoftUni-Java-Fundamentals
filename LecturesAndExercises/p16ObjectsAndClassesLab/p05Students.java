package LecturesAndExercises.p16ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            String hometown = input.split(" ")[3];
            Student tmp = new Student(firstName, lastName, age, hometown);
            students.add(tmp);
            input = scanner.nextLine();
        }
        String searchCriteria = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (searchCriteria.equals(students.get(i).getHomeTown())) {
                System.out.printf("%s %s is %d years old%n",students.get(i).getFirstName(), students.get(i).getLastName(), students.get(i).getAge() );
            }
        }
    }
}
