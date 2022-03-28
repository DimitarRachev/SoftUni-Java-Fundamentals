package LecturesAndExercises.p21MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Player> players = new ArrayList<>();
        String line;
        while (!"Season end".equals(line = scanner.nextLine())) {

            // implement battle
            if (line.contains(" vs ")) {
                String[] input = line.split(" vs ");
                String name1 = input[0];
                String name2 = input[1];
                Player player1 = getPlayer(name1, players);
                Player player2 = getPlayer(name2, players);
                if (player2 != null && player1 != null) {
                    for (Map.Entry<String, Integer> entryplayer1 : player1.getPositions().entrySet()) {
                        if (player2.getPositions().containsKey(entryplayer1.getKey())) {
                            if (entryplayer1.getValue() > player2.getPositions().get(entryplayer1.getKey())) {
                                players.remove(player2);
                            } else if (entryplayer1.getValue() < player2.getPositions().get(entryplayer1.getKey())) {
                                players.remove(player1);
                            }
                        }
                    }

                }

//          populate players list/class
            } else {
                String[] input = line.split(" -> ");
                String player = input[0];
                String position = input[1];
                int skill = Integer.parseInt(input[2]);
                if (getPlayer(player, players) == null) {
                    Map<String, Integer> tempMap = new LinkedHashMap<>();
                    tempMap.put(position, skill);
                    Player tempPlayer = new Player(player, tempMap);
                    players.add(tempPlayer);
                } else {
                    Player tempPlayer = getPlayer(player, players);
                    Map<String, Integer> tempMap = tempPlayer.getPositions();
//                    if (tempMap == null) {
//                        tempMap = new LinkedHashMap<>();
//                    }
                    if (tempMap.containsKey(position)) {
                        if (tempMap.get(position) < skill) {
                            tempMap.put(position, skill);
                        }
                    } else {
                        tempMap.put(position, skill);
                    }
                }
            }


        }

        players = players.stream().sorted(Comparator.comparing(Player::getTotalSkillPoints).reversed()).collect(Collectors.toList());
        for (Player player : players) {

            System.out.printf("%s: %d skill%n", player.getName(), player.getTotalSkillPoints());
            player.printPositions();
        }



    }

    private static Player getPlayer(String name, List<Player> players) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    static class Player {
        String name;
        Map<String, Integer> positions;

        public Player(String name, Map<String, Integer> positions) {
            this.name = name;
            this.positions = positions;
        }

        public void printPositions() {
            Map<String, Integer> sorted = new LinkedHashMap<>();
          positions.entrySet().stream().sorted((s1, s2) -> {
                int sort = Integer.compare(s2.getValue(), s1.getValue());
                if (sort == 0) {
                    return s1.getKey().compareTo(s2.getKey());
                }
                return sort;
            }).forEach(x -> sorted.put(x.getKey(), x.getValue()));

            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                System.out.printf("- %s <::> %d%n", entry.getKey(), entry.getValue());
            }

        }

        public int getTotalSkillPoints() {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : this.positions.entrySet()) {
                sum += entry.getValue();
            }
            return sum;
        }

        public String getName() {
            return name;
        }


        public Map<String, Integer> getPositions() {
            return positions;
        }

        public void setPositions(Map<String, Integer> positions) {
            this.positions = positions;
        }
    }

}
