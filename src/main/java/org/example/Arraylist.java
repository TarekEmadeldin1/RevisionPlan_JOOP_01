package org.example;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>(5);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        System.out.println(arraylist.size());
        arraylist.remove(0);
        System.out.println(arraylist.size());
        System.out.println(arraylist.hashCode());

    }

}
