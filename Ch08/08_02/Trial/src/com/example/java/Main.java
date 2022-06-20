package com.example.java;
import java.util.*;
class point{
    public int x;
    private int y;
    public void set(int a, int b){
        this.x = a;
        this.y = b;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
//        Map treeMap = new HashMap();
//        treeMap.put(10, "India");
//        treeMap.put(2, "F");
//        treeMap.put(3, "Germany");
//        treeMap.put(null, "null");
//        System.out.println(treeMap);

//        point p1 = new point();
//        p1.set(2, 3);
//        System.out.println(p1.x, p1.y);

        Map treeMap = new TreeMap();
        treeMap.put(10, "India");
        treeMap.put(2, "F");
        treeMap.put(3, "Germany");
        treeMap.put(null, "null");
        System.out.println(treeMap);

//        int[] age = {25, 26, 27, 28, 29};
//        int sum = 0;
//        try {
//            for (int item:age) sum += item;
//            System.out.print("Total age = ");
//            if (sum > 125)
//                throw new Exception(sum+"is above 125");
//            System.out.print("average age is " + sum/age.length);
//        }
//        catch (Exception e){
//            System.out.print(e.getMessage());
//        }

//        int i = 0;
//        i = i++ + i;
//        System.out.println("I = "+i);
//        int a = 2, b = 3, c = 4, d = 5;
//        float k = 4.3f;
//        System.out.println(--b*a+c*d--);
//
//        try {
//            int a = 1;
//            int b = 10/1;
//            try {
//                if (a ==1) a = a/a-a;
//                if (a == 2){
//                    int c[] = {1};
//                    c[8] = 9;
//                }
//
//            }
//            finally{
//                System.out.println("Over");
//            }
//
//        }
//        catch (Exception e){
//            System.out.println("Error");
//        }
//        finally {
//            System.out.println("End");
//        }


    }
}
