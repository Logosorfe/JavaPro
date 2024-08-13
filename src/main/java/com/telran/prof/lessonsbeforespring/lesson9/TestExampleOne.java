package com.telran.prof.lessonsbeforespring.lesson9;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleOne {

    public static void main(String[] args) {
        String inputData = "sskghfkghgkgfdekjghjkghfj dfkjghdjghkdgfg kjgfhksmdfkfhsdkjf ksdfhtfsdf";
        Set<Character> characters = new TreeSet<>();
        for (int i = 0; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);
        }

        System.out.println("Count of symbols " + characters.size());
        System.out.println("Symbols : " + characters);

        char[] chars = inputData.toCharArray();
    }
}
