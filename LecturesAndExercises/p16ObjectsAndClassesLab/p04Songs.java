package LecturesAndExercises.p16ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p04Songs {
   static class Song{
        String name;
        String time;
        String typeList;

        Song(String typeList, String name, String time) {
            this.name = name;
            this.time = time;
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public String getTypeList() {
            return typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Song tmp = new Song(input.split("\\_")[0], input.split("\\_")[1], input.split("\\_")[2]);
            songs.add(tmp);
        }
        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(songs.get(i).getName());
            }
        } else {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getTypeList().equals(input)) {
                    System.out.println(songs.get(i).getName());
                }
            }
        }

    }
}
