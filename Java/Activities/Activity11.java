package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
    //Create a Map named colours with integer keys and String values.
    Map<Integer, String> colors = new HashMap<Integer, String>();
    //Add 5 random colours to it and print the Map to the console.
    colors.put(1, "Blue");
    colors.put(2, "Yellow");
    colors.put(3, "Green");
    colors.put(4, "Orange");
    colors.put(5, "Purple");
    System.out.println("The Original map: " + colors);
    //Original Map Size
    System.out.println("Original Map Size is: " + colors.size());
    //Remove one colour using the remove() method.
    colors.remove(2);
    //Check if the colour green exists in the Map using the containsValue() method.
    if(colors.containsValue("Green")) {
        System.out.println("Green exists in the Map");
    } else {
        System.out.println("Green does not exist in the Map");
    }
    //Print the size of the Map using the size() method.
    System.out.println("Map Size is: " + colors.size());
    }

}
