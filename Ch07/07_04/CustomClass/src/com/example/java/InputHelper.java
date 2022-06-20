package com.example.java;

import java.util.Scanner;

public class InputHelper {
    static String getInput(String propmt) {
        System.out.println(propmt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
