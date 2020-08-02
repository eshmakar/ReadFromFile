package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C://1.txt");
        int i;
        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }

    }
}