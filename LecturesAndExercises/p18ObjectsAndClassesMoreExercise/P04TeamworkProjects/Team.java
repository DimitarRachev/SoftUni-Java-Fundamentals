package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P04TeamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
  private final String name;
   private final User creator;
    List<User> members;

    public Team(String name, User creator) {
        this.name = name;
        this.creator = creator;
        members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMembersCount() {
        return members.size();
    }

    public User getCreator() {
        return creator;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
}
