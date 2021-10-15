package com.company.fileReaders;

import com.company.TextFileReader;

import java.io.IOException;
import java.util.Collections;

public class PalindromeTextFileReader extends TextFileReader {
    public PalindromeTextFileReader() {
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

            Collections.reverse(this.lines);

            for (String s : this.lines) {
                System.out.println(new StringBuilder(s).reverse().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}