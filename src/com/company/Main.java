package com.company;


import java.util.*;

/**
 * 0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
 * Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.
 */
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            Arrays.sort(array);
        }
        System.out.println("\n" + "After sorting array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\n" + "\n" + "After sorting ArrayList: ");
        for (int counter : arrayList) {
            System.out.print(counter + " ");
        }
        System.out.println("\n" + "\n" + "After sorting LinkedList: ");
        for (int counter : linkedList) {
            System.out.print(counter + " ");
        }
    }
}
