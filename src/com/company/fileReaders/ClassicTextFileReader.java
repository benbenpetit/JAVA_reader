package com.company.fileReaders;

import com.company.TextFileReader;

import java.io.IOException;

public class ClassicTextFileReader extends TextFileReader {
    public ClassicTextFileReader() {
        super();
    }

    public void readFile() {
        String line = null;
        this.lines.clear();

        try {
            while ((line = this.bufferReader.readLine())!= null) {
                this.lines.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}