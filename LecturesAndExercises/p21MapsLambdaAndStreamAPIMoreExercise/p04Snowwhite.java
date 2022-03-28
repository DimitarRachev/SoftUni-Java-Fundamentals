package LecturesAndExercises.p21MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p04Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Dwarf> dwarfs = new ArrayList<>();
        String line;
        while (!"Once upon a time".equals(line = scanner.nextLine())) {
            //split and take input
            String[] input = line.split(" <:> ");
            String name = input[0];
            String hatColor = input[1];
            int physics = Integer.parseInt(input[2]);

            //create and populate dwarf list/class
            Dwarf tempDwarf = getDwarf(name, hatColor, dwarfs);
            if (tempDwarf == null) {
                tempDwarf = new Dwarf(name, hatColor, physics);
                dwarfs.add(tempDwarf);
            } else {
                tempDwarf.setPhysics(Math.max(physics, tempDwarf.getPhysics()));
            }
        }

        //Create and populate map whits hat colors and their total count
        Map<String, Integer> hatColorCount = new LinkedHashMap<>();
        for (Dwarf dwarf : dwarfs) {
            if (hatColorCount.containsKey(dwarf.getHatColor())) {
                hatColorCount.put(dwarf.getHatColor(), hatColorCount.get(dwarf.getHatColor()) +1);
            } else {
                hatColorCount.put(dwarf.getHatColor(), 1);
            }
        }
        //set hat color count for each dwarf
        for (Dwarf dwarf : dwarfs) {
            dwarf.setColorCount(hatColorCount.get(dwarf.getHatColor()));
        }

        //sort dwarfs by physics(descending) and then by total count hat with same color(descending)
        dwarfs = dwarfs.stream().sorted(Comparator.comparing(Dwarf::getPhysics).reversed().thenComparing(Comparator.comparing(Dwarf::getColorCount).reversed())).collect(Collectors.toList());

        //print dwarfs
        for (Dwarf dwarf : dwarfs) {
            System.out.printf("(%s) %s <-> %d%n", dwarf.getHatColor(), dwarf.getName(), dwarf.getPhysics());
        }

    }

    private static Dwarf getDwarf(String name, String hatColor, List<Dwarf> dwarfs) {
        for (Dwarf dwarf : dwarfs) {
            if (dwarf.getHatColor().equals(hatColor) && dwarf.getName().equals(name)) {
                return dwarf;
            }
        }
        return null;
    }

    static class Dwarf {
        String name;
        String hatColor;
        int physics;
        int colorCount;

        public Dwarf(String name, String hatColor, int physics) {
            this.name = name;
            this.hatColor = hatColor;
            this.physics = physics;
        }

        public String getName() {
            return name;
        }

        public int getColorCount() {
            return colorCount;
        }

        public void setColorCount(int colorCount) {
            this.colorCount = colorCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHatColor() {
            return hatColor;
        }

        public void setHatColor(String hatColor) {
            this.hatColor = hatColor;
        }

        public int getPhysics() {
            return physics;
        }

        public void setPhysics(int physics) {
            this.physics = physics;
        }
    }
}
