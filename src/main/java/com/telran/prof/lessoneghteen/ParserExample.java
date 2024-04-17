package com.telran.prof.lessoneghteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class ParserExample {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessoneghteen/football.txt";
        List<Match> matches = new ArrayList<>();
        try {
            FileInputStream stream = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split(", ");

                Match match = new Match(
                        new GregorianCalendar(Integer.parseInt(split[0]),
                                Integer.parseInt(split[1]),
                                Integer.parseInt(split[2])),
                        split[3],
                        split[5],
                        split[4],
                        "NULL".equals(split[6]) ? 0 : Integer.parseInt(split[6]),
                        split[7]);
                matches.add(match);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("Count of matches " + matches.size());
        System.out.println(matches);
    }

}
