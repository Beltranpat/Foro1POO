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
        
        // Para crear una collection usamos ArrayList
        Collection<String> collection = new ArrayList<>();{

        // Agregar elementos a la collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        // Para mostrar la collection
        System.out.println("Collection: " + collection);

        // Para verificar si un elemento especifico existe (o no) en la collection
        boolean hasBanana = collection.contains("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Para remover un elemento especifico de la collection
        collection.remove("Banana");
        System.out.println("After removing Banana: " + collection);

        // Para obtener el tamaño de la colecction (Cantidad de elementos)
        int size = collection.size();
        System.out.println("Size of collection: " + size);

        // Para verificar si la collection esta vacia (o no)
        boolean isEmpty = collection.isEmpty();
        System.out.println("Is collection empty? " + isEmpty);

        // Para borrar todos los elementos de una collection y dejarla vacia
        collection.clear();
        System.out.println("After clearing: " + collection);
        System.out.println("Is collection empty now? " + collection.isEmpty());
    }
}

}
    

