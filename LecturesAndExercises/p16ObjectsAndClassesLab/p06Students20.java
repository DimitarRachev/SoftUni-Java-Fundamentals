package LecturesAndExercises.p16ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p06Students20 {

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

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
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
            if (isExistingStudent(tmp, students)) {
                Student existStudenst = getStudent(students, firstName, lastName);
                existStudenst.setAge(age);
                existStudenst.setHomeTown(hometown);
            } else {
                students.add(tmp);
            }
            input = scanner.nextLine();
        }
        String searchCriteria = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (searchCriteria.equals(students.get(i).getHomeTown())) {
                System.out.printf("%s %s is %d years old%n",students.get(i).getFirstName(), students.get(i).getLastName(), students.get(i).getAge() );
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
    Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
                return existingStudent;
            }
        }

        return existingStudent;
    }

    private static boolean isExistingStudent(Student tmp, List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (tmp.getFirstName().equals(students.get(i).getFirstName()) && tmp.getLastName().equals(students.get(i).getLastName())) {
                return true;
            }
        }
        return false;
    }
}
