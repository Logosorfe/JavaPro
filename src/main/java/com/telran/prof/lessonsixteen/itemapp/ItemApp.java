package com.telran.prof.lessonsixteen.itemapp;

import java.util.Arrays;
import java.util.List;

public class ItemApp {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Phone", 25),
                new Item("Milk", 15),
                new Item("Broad", 2),
                new Item("Table", 35),
                new Item("Phone", 25),
                new Item("Phone", 55),
                new Item("Door", 50),
                new Item("Paper", 4),
                new Item("Beer", 5),
                new Item("Beer", 65));
        // .collect(Collector.toSet())

    }
}
