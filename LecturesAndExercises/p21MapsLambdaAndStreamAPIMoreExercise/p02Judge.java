package LecturesAndExercises.p21MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        List<Contest> contests = new ArrayList<>();
        List<User> users = new ArrayList<>();
        while (!"no more time".equals(input = scanner.nextLine())) {
            String username = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int score = Integer.parseInt(input.split(" -> ")[2]);
            //Populate User class/list
            if (findUser(username, users) == null) {
                Map<String, Integer> tempMap = new LinkedHashMap<>();
                tempMap.put(contest, score);
                User tempUser = new User(username, tempMap);
                users.add(tempUser);

            } else {
                User tempUser = findUser(username, users);
                Map<String, Integer> tempMap = tempUser.getContest();
                if (tempMap.containsKey(contest)) {
                    tempMap.put(contest, Math.max(score, tempMap.get(contest)));
                } else {
                    tempMap.put(contest, score);
                }
            }

            //Populate Contest class/list
            if (findContest(contest, contests) == null) {
                Map<String, Integer> tempMap = new LinkedHashMap<>();
                tempMap.put(username, score);
                Contest tempContest = new Contest(contest, tempMap);
                contests.add(tempContest);
            } else {
                Contest tempContest = findContest(contest, contests);
                Map<String, Integer> tempMap = tempContest.getUsersMap();
                if (tempMap.containsKey(username)) {
                    tempMap.put(username, Math.max(score, tempMap.get(username)));
                } else {
                    tempMap.put(username, score);
                }
            }
        }


        for (Contest contest : contests) {
            contest.printContest();
        }

        System.out.println("Individual standings:");
        users = users.stream().sorted(Comparator.comparing(User::getTotalScore).reversed().thenComparing(Comparator.comparing(User::getName))).collect(Collectors.toList());

        for (int i = 0; i < users.size(); i++) {
            System.out.printf("%d. %s -> %d%n", i + 1, users.get(i).getName(), users.get(i).getTotalScore());
        }
    }

    private static Contest findContest(String contest, List<Contest> contests) {
        for (Contest con : contests) {
            if (con.getContestName().equals(contest)) {
                return con;
            }
        }
        return null;
    }

    private static User findUser(String username, List<User> users) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
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

        public int getTotalScore() {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : this.contest.entrySet()) {
                sum += entry.getValue();
            }
            return sum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Integer> getContest() {
            return contest;
        }
    }


    static class Contest {
        String name;
        Map<String, Integer> users;

        public Contest(String name, Map<String, Integer> users) {
            this.name = name;
            this.users = users;
        }

        public void printContest() {
            System.out.printf("%s: %d participants%n", this.name, this.users.size());
            int counter = 0;
            Map<String, Integer> sorted = new LinkedHashMap<>();



            this.users.entrySet().stream().sorted((s1, s2) -> {
                        int sort = s2.getValue().compareTo(s1.getValue());
                        if (sort == 0) {
                            return s1.getKey().compareTo(s2.getKey());
                        }
                        return sort;
                    })
                    .forEach(x -> sorted.put(x.getKey(), x.getValue()));

            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                counter++;
                System.out.printf("%d. %s <::> %d%n", counter, entry.getKey(), entry.getValue());
            }

        }

        public String getContestName() {
            return name;
        }

        public Map<String, Integer> getUsersMap() {
            return users;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
