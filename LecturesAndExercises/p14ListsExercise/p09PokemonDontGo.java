package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p09PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sumRemovedElements = 0;
        while (list.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index < 0) {
                int removedItem = list.get(0);
                sumRemovedElements += removedItem;
                list.set(0, list.get(list.size() -1));
                increaseOrDecreaseItems(list, removedItem);

            } else if (index >= list.size()) {
                int removedItem = list.get(list.size() -1);
                sumRemovedElements += removedItem;
                list.remove(list.size() -1);
                list.add(list.get(0));
                increaseOrDecreaseItems(list, removedItem);

            } else {                                    //if index is valid
                int removedItem = list.get(index);
                sumRemovedElements += removedItem;
                list.remove(index);
                increaseOrDecreaseItems(list, removedItem);
            }
        }

        System.out.println(sumRemovedElements);
    }

    public static void increaseOrDecreaseItems(List<Integer> list, int removedItem) {
        for (int i = 0; i < list.size(); i++) {   //check all items in list
            int temp = list.get(i);
            if (list.get(i) <= removedItem) {     // if are smaller or equal
                list.set(i, temp + removedItem);
            } else {                               //or greater than removed item
            list.set(i, temp - removedItem);
            }
        }
    }
}
