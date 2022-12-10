import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class ArraysListsMapsSets {
    public static void main(String[] args) {
        // Arrays
        int[] x = { 0, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(x));// prints entire array
        System.out.println(x[1]);// prints 1

        // ArrayLists
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.indexOf("BMW"));// retruns index of first instance of object passed in
        cars.set(0, "Opel");// changes element value at postion n
        cars.remove(0);// removes element at position n
        cars.add("Toyota");// adds element to the end of the arrayslist
        cars.sort(null);// sorts in alphabetical if string arraylist and ascending if numerical
        cars.size();// length of arraylist
        cars.clear();

        // LinkedList
        // contains all the same methods as the arraylist but behaves differently
        // arraylist is an array and simply makes a new array of a different size any
        // time elements are added or removed
        // LinkedList stores its items in "containers" (AKA nodes). The list has a link
        // to the first
        // container and each container has a link to the next container in the list.
        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        System.out.println(cars2);
        cars2.addFirst("Honda");// Adds an item to the beginning of the list.
        cars2.addLast("Ferrari");// Add an item to the end of the list
        cars2.removeFirst();// Remove an item from the beginning of the list.
        cars2.removeLast();// Remove an item from the end of the list
        cars2.getFirst();// Get the item at the beginning of the list
        cars2.getLast();// Get the item at the end of the list

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        capitalCities.get("England");// To access a value in the HashMap, use the get() method and refer to its key:
        capitalCities.remove("England");// To remove an item, use the remove() method and refer to the key
        capitalCities.clear();// To remove all items, use the clear() method
        capitalCities.size();// To find out how many items there are, use the size() method

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // hashSets (where every item is unique and no indexing)
        HashSet<String> cars3 = new HashSet<String>();
        cars3.add("Volvo");
        cars3.add("BMW");
        cars3.add("Ford");
        cars3.add("BMW");
        cars3.add("Mazda");
        System.out.println(cars3);
        cars3.contains("Mazda");// To check whether an item exists in a HashSet, use the contains() method:
        cars3.remove("Volvo");// To remove an item, use the remove() method:
        cars3.clear();// To remove all items, use the clear() method:
        cars3.size();// To find out how many items there are, use the size method:
        for (String i : cars3) {
            System.out.println(i);
        }
    }
}
