package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя № " + i + " для списка Листа А");
            listA.add(i, scanner.next());
        }
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Введите имя №" + i + " для списка Листа Б");
            listB.add(i, scanner.next());
        }

        listA = new ArrayList<>();
        listA.add("Асан");
        listA.add("Тамара");
        listA.add("Болот");
        listA.add("Жаныш");
        listA.add("Апал");
        System.out.println("Список А: " + listA);
        System.out.println("------------------------------------------------");


        listB = new ArrayList<>();
        listB.add("Упол");
        listB.add("Байыш");
        listB.add("Бекен");
        listB.add("Самара");
        listB.add("Усон");
        System.out.println("Список В: " + listB);
        System.out.println("-------------------------------------------------");


        ArrayList<String> listC = new ArrayList<>();
        listC.add(0, "Асан");
        listC.add(1, "Усон");
        listC.add(2, "Тамара");
        listC.add(3, "Самара");
        listC.add(4, "Болот");
        listC.add(5, "Бекен");
        listC.add(6, "Жаныш");
        listC.add(7, "Байыш");
        listC.add(8, "Апал");
        listC.add(9, "Упол");
        System.out.println("Список С: " + listC);

        listC = new ArrayList<>();
        listC.addAll(listA);


        listC.add(1,listB.get(4));
        System.out.println(listC);
        listC.add(3,listB.get(3));
        System.out.println(listC);
        listC.add(5,listB.get(2));
        System.out.println(listC);
        listC.add(7,listB.get(1));
        System.out.println(listC);
        listC.add(9,listB.get(0));
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);


    }
}
