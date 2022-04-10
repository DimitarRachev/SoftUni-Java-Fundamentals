package LecturesAndExercises.p17ObjectsAndClassesExercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPool {
    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Person tmp = new Person(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));
            persons.add(tmp);
        }

//            persons.sort(Comparator.comparing(Person::getName));
        for (Person person : persons) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %s%n", person.getName(), person.getAge());
            }
        }


    }
}
