package com.telran.prof.lessontwentysix.example;

import java.util.ArrayList;
import java.util.List;

public class WRApp {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ReaderThread readerThread = new ReaderThread(list);
        WriterThread writerThread = new WriterThread(list);

        writerThread.start();
        readerThread.start();
    }
}
