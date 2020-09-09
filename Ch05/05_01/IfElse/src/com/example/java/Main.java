package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int monthNumber = 0;
        if (monthNumber >= 0 && monthNumber <= 2){
            System.out.println("You're in Quarter - 1");
        }
        else if (monthNumber >=3 && monthNumber <= 5){
            System.out.println("You're in Quarter - 2");
        }
        else if (monthNumber >=6 && monthNumber <= 8){
            System.out.println("You're in Quarter - 3");
        }
        else {
            System.out.println("You're in Quarter - 4");
        }
    }
}
