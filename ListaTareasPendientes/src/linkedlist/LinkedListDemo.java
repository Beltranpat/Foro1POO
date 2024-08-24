package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> tareasLinkedList = new LinkedList<>();
        System.out.println("Demostración de LinkedList:");

        // Añadir elementos a la lista
        tareasLinkedList.add("Revisar correos de trabajo");
        tareasLinkedList.add("Preparar presentación de la tarea");
        System.out.println("Tareas con LinkedList: " + tareasLinkedList);

        // Agregar en una posición específica
        tareasLinkedList.add(1, "Urgente: Terminar informe semanal");
        System.out.println("Tareas después de agregar en posición específica: " + tareasLinkedList);

        // Añadir al principio y al final
        tareasLinkedList.addFirst("Urgente: Terminar informe semanal");
        tareasLinkedList.addLast("Comprar café");
        System.out.println("Tareas después de añadir al principio y al final: " + tareasLinkedList);

        // Eliminar elementos
        tareasLinkedList.removeFirst();
        System.out.println("Tareas después de eliminar la tarea más urgente: " + tareasLinkedList);

        tareasLinkedList.remove("Preparar presentación de la tarea");
        System.out.println("Tareas después de eliminar por valor: " + tareasLinkedList);

        // Recorrer la lista con for-each
        System.out.println("Recorriendo la lista con for-each:");
        for (String tarea : tareasLinkedList) {
            System.out.println("Tarea: " + tarea);
        }
    }
}