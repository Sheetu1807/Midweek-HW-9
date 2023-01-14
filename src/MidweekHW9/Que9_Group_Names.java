package MidweekHW9;

// 9. Write program and add all group names in to array and iterates through for each loop.

import java.util.ArrayList;

public class Que9_Group_Names {

    public static void main(String[] args){

        // Create an array of strings representing group names
        ArrayList<String> groups = new ArrayList<>();

        // Add each group to the empty array, remove via object and index
        groups.add("Postman");
        groups.add("Selenium");
        groups.add("Rest-Assured");
        groups.add("Java");
        groups.add("Selenium1");
        groups.remove("Java2");
        groups.remove("Postman1");

        // Iterate through the array using a for-each loop
        for (String group : groups){
            System.out.println(group);
        }
    }
}
