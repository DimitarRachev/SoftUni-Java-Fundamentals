package FinalExamPreparation.p02ProgrammingFundamentalsFinalExam;

import java.util.*;

public class p03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plants = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("<->");
            String name = input[0];
            int rarity = Integer.parseInt(input[1]);
            plants.put(name, new Plant(name, rarity));
        }

        String line;
        while (!"Exhibition".equals(line = scanner.nextLine())) {
            String[] input = line.split(":\\s+");
            String command = input[0];
            String[] plantInfo = input[1].split(" - ");
            String plant = plantInfo[0];
            if (!plants.containsKey(plant)) {
                System.out.println("error");

            } else {
                switch (command) {
                    case "Rate":
                        Double rating = Double.parseDouble(plantInfo[1]);
                        plants.get(plant).getRatings().add(rating);
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(plantInfo[1]);
                        plants.get(plant).setRarity(rarity);
                        break;
                    case "Reset":
                        plants.get(plant).resetRatings();
                        break;
                }
            }
        }

        System.out.println("Plants for the exhibition:");
        plants.values().forEach(System.out::println);
    }

    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        private Double getAverageRating() {
            return this.ratings.stream().mapToDouble(e -> e).average().orElse(0);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public List<Double> getRatings() {
            return ratings;
        }

        public void resetRatings() {
            this.ratings = new ArrayList<>();
        }

        @Override
        public String toString() {
            return String.format("- %s; Rarity: %d; Rating: %.2f", this.name, this.rarity, getAverageRating());
        }
    }
}
