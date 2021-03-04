package org.example;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class Main {
    public static void main(String[] args) {
        Integer[] a=new Integer[3];
        a[0]=null;
        a[4]=0;
        a[3]=1;
        System.out.println(a[0].toString());
        System.out.println(a[4]);
        System.out.println(a[3]/0);
    }
}
