package com.company;

import java.util.Scanner;

public class JavaLoopsI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String b = scan.nextLine();
        String s = scan.nextLine();
        //scan.close();
        double d = Double.parseDouble(b);
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
