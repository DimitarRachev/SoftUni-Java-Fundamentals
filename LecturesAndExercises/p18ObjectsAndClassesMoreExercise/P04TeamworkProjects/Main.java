package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P04TeamworkProjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();
        List<User> allUsers = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("-");
            User tmp = new User(input[0]);
            boolean isAlreadyCreated = false;
            if (teams.size() > 0) {
                for (Team team : teams) {
                    if (team.getName().equals(input[1])) {
                        System.out.printf("Team %s was already created!%n", input[1]);
                        isAlreadyCreated = true;
                        break;
                    }
                }
            }
            if (!areUserExisting(allUsers, tmp) && !isAlreadyCreated) {
                Team temp = new Team(input[1], tmp);
                teams.add(temp);
                allUsers.add(tmp);
                System.out.printf("Team %s has been created by %s!%n", temp.getName(), tmp.getName());
            } else if (areUserExisting(allUsers, tmp) && !isAlreadyCreated){
                System.out.printf("%s cannot create another team!%n", input[0]);

            }
        }

        String command;
        while (!"end of assignment".equals(command = scanner.nextLine())) {
            String[] input = command.split("->");
            Team temp = getTeam(input[1], teams);
            if (temp == null) {
                System.out.printf("Team %s does not exist!%n", input[1]);
                continue;
            }
            User tmp = getUser(input[0], allUsers);
            if (tmp != null) {
                System.out.printf("Member %s cannot join team %s!%n", input[0], input[1]);
                continue;
            }
            tmp = new User(input[0]);
            temp.members.add(tmp);
            allUsers.add(tmp);
        }
        List<Team> teamsToDisband = disbandTeams(teams);

        teams = teams.stream().sorted(Comparator.comparing(Team::getMembersCount).reversed().thenComparing(Team::getName)).collect(Collectors.toList());

        for (Team team : teams) {
            System.out.println(team.getName());
            System.out.printf("- %s%n", team.getCreator().getName());
            List<User> listToSort = team.getMembers().stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
            team.setMembers(listToSort);
            for (int i = 0; i < team.members.size(); i++) {
                System.out.printf("-- %s%n", team.members.get(i).getName());
            }
        }

        System.out.println("Teams to disband:");
        if (teamsToDisband.size() != 0) {
            teamsToDisband.sort(Comparator.comparing(Team::getName));
            for (Team team : teamsToDisband) {
                System.out.println(team.getName());
            }
        }
    }

private static boolean areUserExisting(List<User> users, User temp) {
    for (User user : users) {
        if (user.getName().equals(temp.getName())) {
            return true;
        }
    }
return false;

}

    private static List<Team> disbandTeams(List<Team> teams) {
        List<Team> result = new ArrayList<>();
        for (int i = teams.size() - 1; i >= 0; i--) {
            if (teams.get(i).members.size() == 0) {
                result.add(teams.get(i));
                teams.remove(i);
            }
        }
        return result;
    }

    private static User getUser(String s, List<User> allUsers) {
        for (User user : allUsers) {
            if (user.getName().equals(s)) {
                return user;
            }
        }
        return null;
    }

    private static Team getTeam(String s, List<Team> teams) {
        for (Team team : teams) {
            if (team.getName().equals(s)) {
                return team;
            }
        }
        return null;
    }
}
