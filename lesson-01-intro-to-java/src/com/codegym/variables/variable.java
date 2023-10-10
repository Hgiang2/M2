package com.codegym.variables;

import org.w3c.dom.ls.LSOutput;

public class variable {
    public static void main(String[] args) {
        String fullName ="Nguyen Van A";
        System.out.println(fullName); // print with line breaks
        System.out.print(fullName); // print inline

        int myAge = 18;
        // printf: output string with variable value in string
        // %d: number
        // %s: string
        // \n: break lines
        System.out.printf("My age is: %d\n", myAge);
        System.out.printf("My full name is: %s", fullName);
    }

}
