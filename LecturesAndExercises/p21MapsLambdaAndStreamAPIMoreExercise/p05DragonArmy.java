package LecturesAndExercises.p21MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p05DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TypeDragon> listTypes = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            //split input and take variables
            String[] input = scanner.nextLine().split("\\s+");
            String type = input[0];
            String name = input[1];
            String damage = input[2];
            String health = input[3];
            String armor = input[4];

            //logic for populating dragons and type class/list
            Dragon tempDragon = getDragon(type, name, listTypes);
            if (tempDragon == null) {
                tempDragon = new Dragon(name, damage, health, armor);
                TypeDragon tempType = getTypesDragon(type, listTypes);
                if (tempType == null) {
                    List<Dragon> tempList = new ArrayList<>();
                    tempList.add(tempDragon);
                    tempType = new TypeDragon(type, tempList);
                    listTypes.add(tempType);
                } else {
                    List<Dragon> tempList = tempType.getDragons();
                    tempList.add(tempDragon);
                }
            } else {
                if (!health.equals("null")) {
                    tempDragon.setHealth(health);
                } else {
                    tempDragon.setHealth("250");
                }
                if (!damage.equals("null")) {
                    tempDragon.setDamage(damage);
                } else {
                    tempDragon.setDamage("45");
                }
                if (!armor.equals("null")) {
                    tempDragon.setArmor(armor);
                } else {
                    tempDragon.setArmor("10");
                }
            }
        }

        //printing
        for (TypeDragon type : listTypes) {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type.getType(), type.getAverageDamage(), type.getAverageHeath(), type.getAverageArmor());
            type.printDragons();
        }


    }

    private static TypeDragon getTypesDragon(String type, List<TypeDragon> listTypes) {
        for (TypeDragon listType : listTypes) {
            if (listType.getType().equals(type)) {
                return listType;
            }
        }
        return null;
    }

    private static Dragon getDragon(String type, String name, List<TypeDragon> listTypes) {
        for (TypeDragon listType : listTypes) {
            if (listType.getType().equals(type)) {
                List<Dragon> tempList = listType.getDragons();
                for (Dragon dragon : tempList) {
                    if (dragon.getName().equals(name)) {
                        return dragon;
                    }
                }
            }
        }
        return null;
    }

    static class TypeDragon {
        String type;
        List<Dragon> dragons;

        public TypeDragon(String type, List<Dragon> dragons) {
            this.type = type;
            this.dragons = dragons;
        }

        public double getAverageHeath() {
            double sum = 0;
            for (Dragon dragon : dragons) {
                sum += dragon.getHealth();
            }
            //check for NaN is not needed
            if (dragons.size() != 0) {
                return sum / dragons.size();
            }
            return 0;
        }

        public double getAverageDamage() {
            double sum = 0;
            for (Dragon dragon : dragons) {
                sum += dragon.getDamage();
            }
            //check for NaN is not needed
            if (dragons.size() != 0) {
                return sum / dragons.size();
            }
            return 0;
        }

        public double getAverageArmor() {
            double sum = 0;
            for (Dragon dragon : dragons) {
                sum += dragon.getArmor();
            }
            //check for NaN is not needed
            if (dragons.size() != 0) {
                return sum / dragons.size();
            }
            return 0;
        }

        public String getType() {
            return type;
        }


        public List<Dragon> getDragons() {
            return dragons;
        }

        public void printDragons() {
            this.dragons = this.dragons.stream().sorted(Comparator.comparing(Dragon::getName)).collect(Collectors.toList());
            for (Dragon dragon : this.dragons) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", dragon.getName(), dragon.getDamage(), dragon.getHealth(), dragon.getArmor());
            }

        }
    }

    static class Dragon {
        String name;
        int damage;
        int health;
        int armor;
//        String type;


        public String getName() {
            return name;
        }


        public int getDamage() {
            return damage;
        }

        public void setDamage(String damage) {
            this.damage = Integer.parseInt(damage);
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(String health) {
            this.health = Integer.parseInt(health);
        }

        public int getArmor() {
            return armor;
        }

        public void setArmor(String armor) {
            this.armor = Integer.parseInt(armor);
        }

        public Dragon(String name, String damage, String health, String armor) {
            this.name = name;
            if (!damage.equals("null")) {
                this.damage = Integer.parseInt(damage);
            } else {
                this.damage = 45;
            }
            if (!health.equals("null")) {
                this.health = Integer.parseInt(health);
            } else {
                this.health = 250;
            }
            if (!armor.equals("null")) {
                this.armor = Integer.parseInt(armor);
            } else {
                this.armor = 10;
            }
        }
    }
}
