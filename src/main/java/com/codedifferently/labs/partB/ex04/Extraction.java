package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/

        String text1 = greeting.substring(0, 5);

        String text2 = greeting.substring(7, 11);

        String text3 = greeting.substring(7, greeting.length());

        response = text1 + "\n" + text2 + "\n" + text3;
        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
