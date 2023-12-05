package org.example.strings;

public class UpperToLower {

    public static void main(String[] args) {
        String newStr ="";
        String sent = " my name is roopali";

        for (int i = 0; i < sent.length(); i++) {
            if (Character.isWhitespace(sent.charAt(i)))
                newStr = newStr + Character.toString(sent.charAt(i));
            else
                newStr = newStr + Character.toString(sent.charAt(i) - 32);
        }
                System.out.print(newStr);

        }
    }


