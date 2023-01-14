package MidweekHW9;

// 7. Create a HashMap object called people that will store String keys and Integer values:
// And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Que7_HashMap {

    public static void main(String[] args){

        // Create a new HashMap object called "people" that stores String keys and Integer values.
        Map<String, Integer> people = new HashMap<>();

        // Add some entries to the map
        people.put("Julia", 22);
        people.put("Kevin", 27);
        people.put("Paul", 35);
        people.put("Yon Jin", 42);

        // Use a for-each loop to iterate through values in the map
        for (Integer age : people.values()){
            System.out.println(age);
        }

        System.out.println("\n");

        // Use a for-each loop to iterate through keys in the map
        for (String name : people.keySet()){
            System.out.println(name);
        }

        System.out.println("\n");
        // Use a for-each loop to iterate through the key-value pairs in the map
        for (Map.Entry<String,Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
