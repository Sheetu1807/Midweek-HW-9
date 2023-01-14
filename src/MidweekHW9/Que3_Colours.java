package MidweekHW9;

// 3. Write a Java program to create a new array list, add some colours(string) and printout the collection using for each loop.

import java.util.ArrayList;

public class Que3_Colours {

    public static void main(String[] args){

        // Create a new ArrayList of strings
        ArrayList<String> colours = new ArrayList<>();

        // Add some colours to the list
        colours.add("White");
        colours.add("Pink");
        colours.add("Purple");
        colours.add("Black");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Red");

        // Print the colours using a for-each loop
        for (String colour : colours){
            System.out.println(colour);
        }
    }
}

