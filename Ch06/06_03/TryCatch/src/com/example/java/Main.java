package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last Char: " + lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bound exception.");
            e.printStackTrace();
            return;
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Any other Exception");
            e.printStackTrace();
            return;
        }
        System.out.println("Code Ran Successfully");
    }
}
