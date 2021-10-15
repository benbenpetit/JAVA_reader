package com.company;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;

public abstract class TextFileReader implements FileReader {
    protected BufferedReader bufferReader;
    protected ArrayList<String> lines;

    public TextFileReader() {
        this.bufferReader = null;
        this.lines = new ArrayList<String>();
    }

    public void openFile(String fileUrl) {
        try {
            if (fileUrl.contains(".txt")) {
                this.bufferReader = Files.newBufferedReader(Paths.get(fileUrl));
                this.readFile();
            } else {
                System.out.println("Error : This is not a text file");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (this.bufferReader != null) {
                this.closeFile();
            }
        }
    }

    public void closeFile() {
        try {
            this.bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}