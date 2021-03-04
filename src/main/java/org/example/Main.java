package org.example;



public class Main {
    public static void main(String[] args) {
        int b = 0;
        Integer[] a=new Integer[3];
        a[0]=null;
        a[4]=0;
        a[2]=1;
        System.out.println(a[0].toString());
        System.out.println(a[4]);
        try {
            a[1]=1/b;
            if (b>0) throw new ArithmeticException();
        }catch (ArithmeticException ar){
            System.out.println("на ноль делить нельзя");
        }

    }
}
