package LecturesAndExercises.p21MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, String> contestPasswords = new LinkedHashMap<>();
        while (!"end of contests".equals(input = scanner.nextLine())) {
            String contest = input.split(":")[0];
            String pass = input.split(":")[1];
            contestPasswords.put(contest, pass);
        }

        input = scanner.nextLine();
        List<User> users = new ArrayList<>();
        while (!input.equals("end of submissions")) {
            String contest = input.split("=>")[0];
            String pass = input.split("=>")[1];
            String user = input.split("=>")[2];
            int score = Integer.parseInt(input.split("=>")[3]);
            if (contestPasswords.containsKey(contest) && contestPasswords.get(contest).equals(pass)) {
                User tempUser = userExist(users, user);
                if (tempUser != null) {
                    Map<String, Integer> tempMap = tempUser.getContest();
                    if (tempMap.containsKey(contest)) {
                        tempMap.put(contest, Math.max(tempMap.get(contest), score));
                    } else {
                        tempMap.put(contest, score);
                    }
//                    този код не се ползва, тък като се работи с указатели и с горният код се променят оригиналните елементи. АКо се разкоментира се получава дублиране
//                    tempUser.setContest(tempMap);
//                    int index = findIndexof(users, user);
//                    users.add(index, tempUser);
                } else {
                    Map<String, Integer> tempMap = new LinkedHashMap<>();
                    tempMap.put(contest, score);
                    tempUser = new User(user, tempMap);
                    users.add(tempUser);
                }
            }
            input = scanner.nextLine();
        }
        List<User> sortedUsers = new ArrayList<>();

//         sortedUsers = users.stream().sorted(Comparator.comparing(User::getTotalScore)).collect(Collectors.toList());
//        User bestCandidate = sortedUsers.get(sortedUsers.size() - 1);

        // same as the 2 lines before ^
        User bestCandidate = users.stream().max(Comparator.comparing(User::getTotalScore)).orElse(null);

        // for the commented lines to work need to refactor stream from sortedUsers :  sortedUsers = sortedUsers.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        sortedUsers = users.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());

        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate.getName(), bestCandidate.getTotalScore());
        System.out.println("Ranking: ");
        for (User user : sortedUsers) {
            user.printUser();
        }

    }

    private static int findIndexof(List<User> users, String user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(user)) {
                return i;
            }
        }
        return -1;
    }

    private static User userExist(List<User> users, String user) {
        for (User current : users) {
            if (current.getName().equals(user)) {
                return current;
            }
        }
        return null;
    }

    static class User {
        String name;
        Map<String, Integer> contest;

        public User(String name, Map<String, Integer> contest) {
            this.name = name;
            this.contest = contest;
        }


        public void printUser() {
            System.out.println(this.name);
            Map<String, Integer> tmp = new LinkedHashMap<>();
            this.contest.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x -> tmp.put(x.getKey(), x.getValue()));

            for (Map.Entry<String, Integer> entry : tmp.entrySet()) {
                System.out.printf("#  %s -> %d%n", entry.getKey(), entry.getValue());
            }

        }


        public int getTotalScore() {
            int total = 0;
            for (Map.Entry<String, Integer> entry : this.contest.entrySet()) {
                total += entry.getValue();
            }
            return total;
        }

        public String getName() {
            return name;
        }

        public Map<String, Integer> getContest() {
            return contest;
        }

        public void setContest(Map<String, Integer> contest) {
            this.contest = contest;
        }
    }
}
