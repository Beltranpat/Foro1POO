package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> tareasArrayList = new ArrayList<>();
        System.out.println("Demostración de ArrayList:");

        // Añadir elementos a la lista
        tareasArrayList.add("Ir al super");
        tareasArrayList.add("Ir a la cita del ISSS");
        tareasArrayList.add("Pagar facturas");
        System.out.println("Tareas con ArrayList: " + tareasArrayList);

        // Recorrer la lista por índice
        System.out.println("Recorriendo la lista por índice:");
        for (int i = 0; i < tareasArrayList.size(); i++) {
            String tarea = tareasArrayList.get(i);
            System.out.println("Índice " + i + ": " + tarea);
        }

        // Añadir una tarea
        tareasArrayList.add("Estudiar para el parcial");
        System.out.println("Tareas después de agregar una tarea: " + tareasArrayList);

        // Eliminar una tarea por valor
        tareasArrayList.remove("Ir a la cita del ISSS");
        System.out.println("Tareas después de eliminar por valor: " + tareasArrayList);

        // Eliminar una tarea por índice
        tareasArrayList.remove(1);
        System.out.println("Tareas después de eliminar por índice: " + tareasArrayList);

        // Recorrer la lista con for-each después de eliminar elementos
        System.out.println("Recorriendo la lista con for-each después de eliminar elementos:");
        for (String tarea : tareasArrayList) {
            System.out.println("Tarea: " + tarea);
        }
    }
}