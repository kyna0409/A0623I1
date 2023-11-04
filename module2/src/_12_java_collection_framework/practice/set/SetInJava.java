package _12_java_collection_framework.practice.set;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[] args) {
        //Createing an empty set
        Set<String> s = new HashSet<>();
        // Use add() method to add elements into the Set
        s.add("Welcome");
        s.add("To");
        s.add("Geeks");
        s.add("4");
        s.add("Geeks");
        s.add("Set");

        // Displaying the Set
        System.out.println("Set: " + s);
        // Displaying the Set
        System.out.println("Set: " + s);

        // Check for "Geeks" in the set
        System.out.println("Does the Set contains 'Geeks'? "
                + s.contains("Geeks"));

        // Check for "4" in the set
        System.out.println("Does the Set contains '4'? "
                + s.contains("4"));

        // Check if the Set contains "No"
        System.out.println("Does the Set contains 'No'? "
                + s.contains("No"));
    }
}
