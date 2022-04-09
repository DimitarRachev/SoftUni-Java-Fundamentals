package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P01CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> Workers = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String name = input.get(0);
            double salary = Double.parseDouble(input.get(1));
            String position = input.get(2);
            String department = input.get(3);
            String mail = "n/a";
            int age = -1;
            input.remove(0);
            input.remove(0);
            input.remove(0);
            input.remove(0);

            while (input.size() > 0) {
                String next = input.get(0);
                if (next.contains("@")) {
                    mail = next;
                } else {
                    age = Integer.parseInt(next);
                }
                input.remove(0);
            }
            Employee tmp = new Employee(name, salary, position, department, mail, age);
            Workers.add(tmp);
        }

        List<Department> departments = new ArrayList<>();
        for (Employee w : Workers) {
            String dep = w.getDepartment();
          Department x = departmentExist(dep, departments);
            if (x != null)   {
                x.workers.add(w);
            } else {
                Department tmp = new Department(dep);
                tmp.workers.add(w);
                departments.add(tmp);
            }
        }

        for (Department y : departments) {
            y.calculateAverageSalary();
        }

        departments.sort(Comparator.comparing(Department::getAverageSalary));
        Collections.reverse(departments);

        Department top = departments.get(0);
        top.sortWorkers();

        System.out.println("Highest Average Salary: " + top.getName());
        for (Employee z : top.workers) {
            System.out.printf("%s %.2f %s %d%n", z.getName(), z.getSalary(), z.getEmail(), z.getAge());
        }

    }

    private static Department departmentExist(String dep, List<Department> departments) {
        for (Department x : departments) {
            if (x.getName().equals(dep)) {
                return x;
            }
        }
        return null;

    }
}
