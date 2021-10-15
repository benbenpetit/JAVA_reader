package com.company.fileReaders;

import com.company.TextFileReader;

import java.io.IOException;
import java.util.Collections;

public class ReverseTextFileReader extends TextFileReader {
    public ReverseTextFileReader() {
        super();
    }

    public void readFile() {
        String line = null;
        this.lines.clear();

        try {
            while ((line = this.bufferReader.readLine())!= null) {
                this.lines.add(line);
            }

            Collections.reverse(this.lines);

            for (String s : this.lines) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}