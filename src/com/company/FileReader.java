package com.company;

public interface FileReader {
    public void openFile(String fileUrl);
    public void closeFile();
    public void readFile();
}