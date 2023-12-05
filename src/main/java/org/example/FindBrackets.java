package org.example;

public class FindBrackets {
    public static void main(String[] args) {
        char temp;

        String statement = "Ia()S (ivd)";


        int ctr=0;

       for(int j=0; j< statement.length()-1;j++) {
           temp = statement.toCharArray()[j];
           if ((temp == '(') || (temp == '{') || (temp == '[')) {
               for (int i = j+1; i < statement.length(); i++) {
                   temp = statement.toCharArray()[i];
                   if ((temp == ')') || (temp == '}') || (temp == ']')) {
                       ctr = ctr + 1;
                   }
               }
           }
           }
        System.out.println(ctr);
       }
        }


