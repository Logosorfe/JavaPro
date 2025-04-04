package com.telran.prof.lessonsbeforespring.lesson18.custom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CustomListWriter extends Writer {

    private String path;

    private FileWriter fileWriter;

    public CustomListWriter(String path) {
        this.path = path;
        init(); // not good idea
    }

    private void init() {
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            fileWriter.write(cbuf[i]);
        }
        fileWriter.write('\n');
        fileWriter.flush();
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {
        fileWriter.close();
    }
}
