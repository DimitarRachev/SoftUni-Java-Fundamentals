package LecturesAndExercises.p19MapsLambdaAndStreamAPILab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p02WordSynonyms {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
                String word = sc.nextLine();
                String synonim = sc.nextLine();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) +", " + synonim);
            } else {
                map.put(word, synonim);
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

    }
}