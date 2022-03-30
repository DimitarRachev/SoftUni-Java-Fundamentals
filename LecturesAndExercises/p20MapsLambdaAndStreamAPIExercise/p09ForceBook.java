package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        Map<String, List<String>> map = new LinkedHashMap<>();
        {
            List<String> x = new ArrayList<>();
            x.add("qwerty2345");
            map.put("qwerty123", x);
        }

        while (!"Lumpawaroo".equals(input = scanner.nextLine())) {
            String[] temp = input.split(" \\| ");
            boolean doesHaveArrow = false;
            if (temp.length == 1) {
                doesHaveArrow = true;
                temp = input.split(" -> ");
            }
            String forceSide, forceUser;
            if (doesHaveArrow) {
                forceUser = temp[0];
                forceSide = temp[1];
            } else {
                forceSide = temp[0];
                forceUser = temp[1];
            }

            boolean userExist = isUserExist(map, forceUser);
            if (!doesHaveArrow) {
                if (map.containsKey(forceSide) && !userExist) {
                    List<String> tmp = map.get(forceSide);
                    tmp.add(forceUser);
                    map.put(forceSide, tmp);
                } else if (!map.containsKey(forceSide) && !userExist) {
                    List<String> tmp = new ArrayList<>();
                    tmp.add(forceUser);
                    map.put(forceSide, tmp);
                }

            } else {
                if (userExist) {
                    //remove user
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        List<String> tmp = entry.getValue();
                        for (int i = 0; i < tmp.size(); i++) {
                            if (tmp.get(i).equals(forceUser)) {
                                tmp.remove(i);
                                break;
                            }
                        }
                    }
                  //get proper list
                    List<String> tmp;
                    if (map.containsKey(forceSide)) {
                        tmp = map.get(forceSide);
                    } else {
                        tmp = new ArrayList<>();
                    }
                    //add user
                    tmp.add(forceUser);
                    map.put(forceSide, tmp);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

                }
                if (!userExist) {
                    List<String> tmp;
                    if (map.containsKey(forceSide)) {
                        tmp = map.get(forceSide);
                    } else {
                        tmp = new ArrayList<>();
                    }
                    tmp.add(forceUser);
                    map.put(forceSide, tmp);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }
            }
        }


        map.remove("qwerty123");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() != 0) {

                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String s : entry.getValue()) {
                    System.out.println("! " + s);
                }

            }
        }

    }

    private static boolean isUserExist(Map<String, List<String>> map, String forceUser) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(forceUser)) {
                return true;
            }
        }
        return false;
    }
}
