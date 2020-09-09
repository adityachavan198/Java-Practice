package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Hello!";
        String s2 = "Hello!";
        if (s1 == s2){
            System.out.println("Strings match");
        }
        else {
            System.out.println("Strings don't match");
        }
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if (s3.equals(s4)){
            System.out.println("Strings match");
        }
        else {
            System.out.println("Strings don't match");
        }
    }
}
