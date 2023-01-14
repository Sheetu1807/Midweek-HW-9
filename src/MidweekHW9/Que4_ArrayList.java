package MidweekHW9;

// 4. Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;
public class Que4_ArrayList {

    public static void main(String[] args){

        // Create a new ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        numbers.add(15);
        numbers.add(10);
        numbers.add(27);
        numbers.add(13);
        numbers.add(48);

        // Get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the list using the iterator
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
