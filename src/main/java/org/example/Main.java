package org.example;


public class Main {


    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        try {
            a[3] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            a[0] = null;
            System.out.println(a[0].toString());
        } catch (NullPointerException n) {
            System.out.println("Error: " + n.getMessage());
        }
        try {
            int b = 0;
            a[1] = 1 / b;
        } catch (ArithmeticException ar) {
            System.out.println("Error:"+ar.getMessage());
        }


    }
}
