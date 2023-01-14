package MidweekHW9;

// 10. Write program and add all group members names in to array and iterates through for each loop and print your name.

public class Que10_Group_Members_Names {

    public static void main(String[] args) {

        // Create four arrays of strings to hold the group member names
        String[] Postman = {"Sheetal", "Maulik", "Kirtan", "Maitry", "Jiten", "Minesh", "Hetvi"};
        String[] Java = {"Anish", "Krunal", "Niddhi", "Paresh", "Anupama", "Riddhi"};
        String[] RestAssured = {"Jigar", "Shivam", "Dhwanil", "Arpita", "Akshit"};
        String[] Selenium = {"Urvi", "Sonia", "Bhumika", "Dipali", "Kuldip"};

        // Iterate through each array and search for "Sheetal" in each group array
        for (String name : Postman) {
            if (name.equals("Sheetal")) {
                System.out.println("Found Sheetal in the Postman group");
            }
        }
        for (String name : Java) {
            if (name.equals("Sheetal")) {
                System.out.println("Found Sheetal in the Java group");
            }
        }
        for (String name : RestAssured) {
            if (name.equals("Sheetal")) {
                System.out.println("Found Sheetal in the Rest-Assured group");
            }
        }
        for (String name : Selenium) {
            if (name.equals("Sheetal")) {
                System.out.println("Found Sheetal in the Selenium group");
            }
        }
    }
}