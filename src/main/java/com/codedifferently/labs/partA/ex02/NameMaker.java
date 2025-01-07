package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class NameMaker {
    public static String nameMaker(String firstName, String middleName, String lastName) {
        String response = "";
        String fullName;
        fullName=firstName+" "+middleName+" "+lastName;
        response += ("Your full name is "+ fullName);
        return response;
    }

    public static void main(String[] args) {
        /* Put your code in between these comments : Top */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input First Name");
        String firstName = scan.nextLine();
        System.out.println("Input Middle Name");
        String middleName = scan.nextLine();
        System.out.println("Input Last Name");
        String lastName = scan.nextLine();

        /* Put your code in between these comments : Bottom */
        String fullName  = nameMaker(firstName, middleName, lastName);
        System.out.println(fullName);
    }
}
