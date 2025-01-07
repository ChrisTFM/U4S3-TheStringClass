package com.codedifferently.labs.partA.ex01;

public class ShoppingCart {
    public static String name() {
        String response = "";
        String custName = "Hakim Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");

        // Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        return response;
    }
    public static void main(String[] args) {
        String nameOut = name();
        System.out.println(nameOut);
    }
}
