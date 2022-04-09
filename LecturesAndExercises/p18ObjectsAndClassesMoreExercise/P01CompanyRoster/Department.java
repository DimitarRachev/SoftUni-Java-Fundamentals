package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P01CompanyRoster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Department {
    List<Employee> workers;
    private String name;
    private Double averageSalary;


    public Department(String name) {
        this.name = name;
        this.workers = new ArrayList<>();

    }

    public void setWorkers(List<Employee> workers) {
        this.workers = workers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public List<Employee> getWorkers() {
        return workers;
    }

    public String getName() {
        return name;
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

    public void calculateAverageSalary() {
        double total = 0;
        for (Employee worker : workers) {
            total += worker.getSalary();
        }
        this.averageSalary= total / workers.size();
    }
    public void sortWorkers() {
        workers.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(workers);
    }
}
