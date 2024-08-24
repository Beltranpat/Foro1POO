/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.ejemplo;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author famen
 */
public class CollectionEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a collection using ArrayList
        Collection<String> collection = new ArrayList<>();{

        // Add elements to the collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        // Display the collection
        System.out.println("Collection: " + collection);

        // Check if the collection contains a specific element
        boolean hasBanana = collection.contains("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Remove an element from the collection
        collection.remove("Banana");
        System.out.println("After removing Banana: " + collection);

        // Get the size of the collection
        int size = collection.size();
        System.out.println("Size of collection: " + size);

        // Check if the collection is empty
        boolean isEmpty = collection.isEmpty();
        System.out.println("Is collection empty? " + isEmpty);

        // Clear the collection
        collection.clear();
        System.out.println("After clearing: " + collection);
        System.out.println("Is collection empty now? " + collection.isEmpty());
    }
}

        // TODO code application logic here
    }
    

