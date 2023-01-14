package MidweekHW9;

// 5. Write a Java program to test an array list is empty or not. Define array list with underground tube names.

import java.util.ArrayList;

public class Que5_Tubes_Names {

    public static void main(String[] args) {

        // Create a new ArrayList of strings representing underground tube names
        ArrayList<String> tubes = new ArrayList<>();

        // Add some tube names to the list
        tubes.add("Central");
        tubes.add("Jubilee");
        tubes.add("District");
        tubes.add("Northern");
        tubes.add("Victoria");
        tubes.add("Piccadilly");
        tubes.add("Metropolitan");
        tubes.add("Waterloo & City");
        tubes.add("Circle");
        tubes.add("Bakerloo");
        tubes.add("Hammersmith & City");


        // Test to see if the list is empty
        if (tubes.isEmpty()) {
            System.out.println("The list of tubes is empty.");

        } else {
            System.out.println("The list of tubes is not empty.");
        }
    }
}



