package com.company;

import com.company.fileReaders.ClassicTextFileReader;
import com.company.fileReaders.PalindromeTextFileReader;
import com.company.fileReaders.ReverseTextFileReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClassicTextFileReader classic = new ClassicTextFileReader();
        ReverseTextFileReader reverse = new ReverseTextFileReader();
        PalindromeTextFileReader palindrome = new PalindromeTextFileReader();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file url : ");
        String fileUrl = scanner.nextLine();

        System.out.println("\n\n\n--- Normal text file reader---\n");
        classic.openFile(fileUrl);

        System.out.println("\n\n\n--- Reverse text file reader---\n");
        reverse.openFile(fileUrl);

        System.out.println("\n\n\n--- Palindrome text file reader---\n");
        palindrome.openFile(fileUrl);
        
        scanner.close();
    }

}

// D:/Benoit/OneDrive/Desktop/lenovo.txt