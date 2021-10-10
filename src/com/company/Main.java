package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> listA = new ArrayList<>();
        listA.add("Асан");
        listA.add("Тамара");
        listA.add("Болот");
        listA.add("Жаныш");
        listA.add("Апал");
        System.out.println("Список А: " + listA);
        System.out.println("------------------------------------------------");
        ArrayList<String> listB = new ArrayList<>();
        listB.add("Упол");
        listB.add("Байыш");
        listB.add("Бекен");
        listB.add("Самара");
        listB.add("Усон");
        System.out.println("Список В: " + listB);
        System.out.println("-------------------------------------------------");
        ArrayList<String> listC =new ArrayList<>();
        listC.add(0,"Асан");
        listC.add(1,"Усон");
        listC.add(2,"Тамара");
        listC.add(3,"Самара");
        listC.add(4,"Болот");
        listC.add(5,"Бекен");
        listC.add(6,"Жаныш");
        listC.add(7,"Байыш");
        listC.add(8,"Апал");
        listC.add(9,"Упол");
        System.out.println("Список С: " + listC);



//        listA.addAll(listB);
//        System.out.println("Список C: " + listA);
//        ArrayList <String> listC = new ArrayList<>();
//        System.out.println("Список С: " + listA + listB);

//        System.out.println(listA);
//        Collections.sort(listA);
//        System.out.println(listB);
//        Collections.sort(listB);

    }
}
