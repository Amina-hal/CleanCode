package com.capgemini.cleancode;

public class Main {
    public static void main(String args[]) {
        try {
            int i = 5 / 0;
            System.out.print("TRY ");
        } catch (ArithmeticException e) {
            System.out.print("CATCH ");
        } finally {
            System.out.print("FINALLY");
        }

        String str1 = new String("STRING");
        String str2 = new String(str1);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

}
