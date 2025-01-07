package com.codedifferently.labs.partC;

public class AlgoChallenge {
/* Problem 1
    The instructor provided you with a non-empty string and a number n.
    The instructor wants you to remove the letter at index n and provide a new string.
    Tip: Value of n should be a valid index of a given letter in the original string,
    such as 0 or str.length()-1 inclusive
    missingLetter("kitten", 1) --> "ktten"
    missingLetter("kitten", 0) --> "itten"
    missingLetter("kitten", 4) --> "kittn"
     */

    /* Problem 2
    Given the word of the day, take the last letter and
    return a new word of the day when you add the last letter to the front and back of the word.
    For example, "founder" yields "rfounderr".
    Tip: The word of the day will be a length 1 or more
    wordOfDay("cat") --> "tcatt"
    wordOfDay("Hello" --> "oHelloo"
    wordOfDay("a") --> "aaa"
     */

    public static String missingLetter(String word, int n) {
        String Firstword = word.substring(0,n);
        String Secondword = word.substring(n+1, word.length());
        return Firstword + Secondword;
    }
    public static String wordOfDay(String word) {
        String letter = String.valueOf(word.charAt(word.length() - 1));
        System.out.println(letter);
        return letter + word + letter;
    }

    public static void main(String[] args) {
        String originalStr = "For Balling";
        String wordStr = "Special";
        System.out.println(missingLetter(originalStr, 6));
        System.out.println(wordOfDay(wordStr));

    }
}

