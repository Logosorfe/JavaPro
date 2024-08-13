package com.telran.prof.lessonsbeforespring.lesson9;

import java.util.HashSet;
import java.util.Set;

public class TestExampleSix {

    public static void main(String[] args) {
        String inputData = "sskghfkghgkgfdekjghjkghfj dfkjghdjghkdgfg kjgfhksmdfkfhsdkjf ksdfhtfsdf";
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);
        }

        System.out.println("Count of letters " + characters.size());
        System.out.println("Letters : " + characters);
    }
}
