package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        first();
        second();
    }

    public static void first()
    {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 12; i++)
            arr.add(rand.nextInt(10));
        ArrayList<Integer> arr2 = new ArrayList<>(arr);

        int len = arr.size();
        for (int i=0; i<len; i++, len--)
            arr.remove(i);

        Collections.sort(arr2);
        System.out.println(arr2);

        Collections.sort(arr);
        System.out.println(arr);
    }

    public static void second()
    {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 12; i++)
            arr.add(rand.nextInt(10-5+1)+5);

        System.out.println(arr);

        for (int i=0; i<arr.size(); i+=4)
            arr.add(i+1, rand.nextInt(25-20+1)+20);

        System.out.println(arr);
    }
}
