package com.telran.prof.lessoneghteen.custom;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CustomListWriter extends Writer {

    private String path;

    public CustomListWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
