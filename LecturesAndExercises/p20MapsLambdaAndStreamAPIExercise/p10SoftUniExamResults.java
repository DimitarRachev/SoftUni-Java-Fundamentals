package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        Map<String, Map<String, List<Integer>>> map = new LinkedHashMap<>();

        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] temp = input.split("-");
            boolean isBanned = false;
            String name, language = "", points = "";

            //take name, language and points
            name = temp[0];
            if (temp.length == 2) {
                isBanned = true;

            } else {
                language = temp[1];
                points = temp[2];
            }
            if (map.containsKey(name)) {
                Map<String, List<Integer>> tmpLanguageMap = map.get(name);
                if (isBanned) {
                    //change name to name+banned
                    map.remove(name);
                    name = name + "banned";
                    map.put(name, tmpLanguageMap);
                } else {
                    //increment submission counter and check if the new score is bigger and add it if true
                    int newScore = Integer.parseInt(points);

                    if (tmpLanguageMap.containsKey(language)) {
                        List<Integer> tmpIntList = tmpLanguageMap.get(language);
                        if (tmpIntList.get(0) < newScore) {
                            tmpIntList.set(0, newScore);
                            tmpIntList.set(1, tmpIntList.get(1) + 1);
                            tmpLanguageMap.put(language, tmpIntList);
                            map.put(name, tmpLanguageMap);
                        } else {
                            tmpIntList.set(1, tmpIntList.get(1) + 1);
                            tmpLanguageMap.put(language, tmpIntList);
                            map.put(name, tmpLanguageMap);
                        }
                    } else {
                        List<Integer> tmpIntList = new ArrayList<>();
                        tmpIntList.add(Integer.parseInt(points));
                        tmpIntList.add(1);
                        tmpLanguageMap.put(language, tmpIntList);
                        map.put(name, tmpLanguageMap);

                    }
                }

            } else {
                //add the new username
                Map<String, List<Integer>> tmpLanguageMap = new LinkedHashMap<>();
                List<Integer> tmp = new ArrayList<>();
                tmp.add(Integer.parseInt(points));
                tmp.add(1);
                tmpLanguageMap.put(language, tmp);
                map.put(name, tmpLanguageMap);
            }
        }

        Map<String, Integer> submissionMap = new LinkedHashMap<>();

        System.out.println("Results:");
        for (Map.Entry<String, Map<String, List<Integer>>> entry : map.entrySet()) {


            Map<String, List<Integer>> tmpLangMap = entry.getValue();
            for (Map.Entry<String, List<Integer>> langEntry : tmpLangMap.entrySet()) {
                int score = langEntry.getValue().get(0);
                if (!entry.getKey().contains("banned")) {
                    System.out.printf("%s | %s%n", entry.getKey(), score);
                }
                if (submissionMap.containsKey(langEntry.getKey())) {
                    int tmpInt = submissionMap.get(langEntry.getKey());
                    submissionMap.put(langEntry.getKey(), langEntry.getValue().get(1) + tmpInt);
                } else {
                    submissionMap.put(langEntry.getKey(), langEntry.getValue().get(1));
                }
            }
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissionMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
