package com.company;

import java.util.Scanner;

public class JavaStaticInitializerBlock<input> {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    if(input<=0)

    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }else

    {
        System.out.println(input);
    }
}
