package LecturesAndExercises.p24TextProcessingMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> morseCode = new LinkedHashMap<>();
        morseCode.put(".-","A");
        morseCode.put("-...","B");
        morseCode.put("-.-.","C");
        morseCode.put("-..","D");
        morseCode.put(".","E");
        morseCode.put("..-.","F");
        morseCode.put("--.","G");
        morseCode.put("....","H");
        morseCode.put("..","I");
        morseCode.put(".---","J");
        morseCode.put("-.-","K");
        morseCode.put(".-..","L");
        morseCode.put("--","M");
        morseCode.put("-.","N");
        morseCode.put("---","O");
        morseCode.put(".--.","P");
        morseCode.put("--.-","Q");
        morseCode.put(".-.","R");
        morseCode.put("...","S");
        morseCode.put("-","T");
        morseCode.put("..-","U");
        morseCode.put("...-","V");
        morseCode.put(".--","W");
        morseCode.put("-..-","X");
        morseCode.put("-.--","Y");
        morseCode.put("--..","Z");
        morseCode.put("|"," ");
    
    String[] input = scanner.nextLine().split(" ");
    StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            output.append(morseCode.get(input[i]));
        }
        System.out.println(output);
    }
}
