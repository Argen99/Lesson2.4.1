package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        Collections.sort(colors);
        System.out.println("Сортировка: " + colors);

        Collections.reverse(colors);
        System.out.println("Обратная сортировка: " + colors);

        Collections.shuffle(colors);
        System.out.println("Перемешивание: " + colors);

    }
}
