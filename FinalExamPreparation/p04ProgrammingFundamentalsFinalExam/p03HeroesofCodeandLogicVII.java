package FinalExamPreparation.p04ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Hero> heroes = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int HP = Integer.parseInt(input[1]);
            int MP = Integer.parseInt(input[2]);
            heroes.put(name, new Hero(name, HP, MP));
        }

        String line;
        while (!"End".equals(line = scanner.nextLine())) {
            String[] input = line.split(" - ");
            String command = input[0];
            String name = input[1];

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(input[2]);
                    String spell = input[3];
                    castSpell(heroes.get(name), mpNeeded, spell);
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(input[2]);
                    String attacker = input[3];
                    takeDMG(heroes, name, damage, attacker);
                    break;
                case "Recharge":
                    int manaAmount = Integer.parseInt(input[2]);
                    recharge(heroes.get(name), manaAmount);
                    break;
                case "Heal":
                    int HealthAmount = Integer.parseInt(input[2]);
                    heal(heroes.get(name), HealthAmount);
                    break;
            }
        }
        heroes.values().forEach(System.out::println);
    }

    private static void heal(Hero hero, int healthAmount) {
        if (hero.getHP() + healthAmount > 100) {
            healthAmount = 100 - hero.getHP();
        }
        hero.setHP(hero.getHP() + healthAmount);
        System.out.printf("%s healed for %d HP!%n", hero.getName(), healthAmount);
    }

    private static void recharge(Hero hero, int manaAmount) {
        if (hero.getMP() + manaAmount > 200) {
            manaAmount = 200 - hero.getMP();
        }
        hero.setMP(hero.getMP() + manaAmount);
        System.out.printf("%s recharged for %d MP!%n", hero.getName(), manaAmount);
    }

    private static void takeDMG(Map<String, Hero> heroes, String name, int damage, String attacker) {
        Hero hero = heroes.get(name);
        hero.setHP(hero.getHP() - damage);
        if (hero.getHP() <= 0) {
            System.out.printf("%s has been killed by %s!%n", name, attacker);
            heroes.remove(name);
        } else {
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, hero.getHP());
        }
    }

    private static void castSpell(Hero hero, int mpNeeded, String spell) {
        if (hero.getMP() >= mpNeeded) {
            hero.setMP(hero.getMP() - mpNeeded);
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero.getName(), spell, hero.getMP());
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", hero.getName(), spell);
        }
    }

    static class Hero {
        String name;
        int HP;
        int MP;

        public Hero(String name, int HP, int MP) {
            this.name = name;
            this.HP = HP;
            this.MP = MP;
        }

        public int getHP() {
            return HP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public int getMP() {
            return MP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s%n  HP: %d%n  MP: %d", this.name, this.HP, this.MP);
        }
    }
}
