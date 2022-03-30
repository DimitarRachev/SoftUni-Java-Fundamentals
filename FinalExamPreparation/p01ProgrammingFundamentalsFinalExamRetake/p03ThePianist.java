package FinalExamPreparation.p01ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Piece> pieces = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\|");
            String name = input[0];
            String composer = input[1];
            String key = input[2];
            pieces.put(name, new Piece(name, composer, key));
        }

        String line;
        while (!"Stop".equals(line = scanner.nextLine())) {
            String[] input = line.split("\\|");
            String command = input[0];
            switch (command) {
                case "Add":
                    addPiece(input, pieces);
                    break;
                case "Remove":
                    removePiece(pieces, input);
                    break;
                case "ChangeKey":
                    changeKey(pieces, input);
                    break;
            }
        }

        pieces.values().forEach(System.out::println);
    }

    private static void changeKey(Map<String, Piece> pieces, String[] input) {
        String name = input[1];
        String newKey = input[2];
        if (pieces.containsKey(name)) {
            pieces.get(name).setKey(newKey);
            System.out.println("Changed the key of " + name + " to " + newKey + "!");
        }else {
            System.out.println("Invalid operation! " + name + " does not exist in the collection.");
        }
    }

    private static void removePiece(Map<String, Piece> pieces, String[] input) {
        String  name = input[1];
        if (pieces.containsKey(name)) {
            pieces.remove(name);
            System.out.println("Successfully removed " + name + "!");
        }else {
            System.out.println("Invalid operation! " + name + " does not exist in the collection.");
        }
    }

    private static void addPiece(String[] input, Map<String, Piece> pieces) {
        String name = input[1];
        String composer = input[2];
        String key = input[3];
        if (pieces.containsKey(name)) {
            System.out.println(name + " is already in the collection!");
        } else {
            pieces.put(name, new Piece(name, composer, key));
            System.out.println(name + " by "+ composer + " in " + key + " added to the collection!");
        }
    }

    static class Piece {
        String name;
        String composer;
        String key;

        public Piece(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return this.name + " -> Composer: " + this.composer + ", Key: " + this.key;
        }
    }
}
