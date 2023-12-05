package org.example.strings;

public class stringFormatter {

    public static void main(String[] args){
        String name = "Roopali";
        int age = 35;
        double marks =  98.8;
        char percnt= '%';

        String mainString = String.format("My name is %s. My age is %d. My marks are %f%c", name, age, marks, percnt);
      // is name). my marks are %d in class", name, age, marks);
        System.out.println(mainString);
    }

}
