package org.example.strings;

public class EqualsTo {

    public static void main(String[] args){
        String literal1 = "xyz";
        String literal2 = "xyz1";
        String literal3 = new String("xyz");

        if(literal1.equals(literal3)){
            System.out.println(" True");
        } else
            System.out.println("False");
    }
}
