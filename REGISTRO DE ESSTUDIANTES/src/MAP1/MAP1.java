package MAP1;

import java.util.HashMap;
import java.util.Map;

public class MAP1 {
    // Definimos un Map para almacenar los estudiantes donde la clave es el carnet y el valor es el nombre completo
    private Map<String, String> estudiantes;

    // Constructor de la clase MAP1 inicializa el Map utilizando HashMap
    public MAP1() {
        estudiantes = new HashMap<>(); // Aquí estamos creando un nuevo HashMap para almacenar los estudiantes
    }

    // Método para ingresar un nuevo alumno en el Map
    public void ingresarAlumno(String carnet, String nombreCompleto) {

        estudiantes.put(carnet, nombreCompleto);


        System.out.println("\n==========================");
        System.out.println("Alumno " + nombreCompleto + " con carnet " + carnet + " ingresado exitosamente.");
        System.out.println("==========================\n");
    }

    // Método para buscar un alumno en el Map usando el carnet
    public void buscarAlumno(String carnet) {

        String nombreCompleto = estudiantes.get(carnet);

        System.out.println("\n-----------------------------------");
        if (nombreCompleto != null) {
            // Si se encuentra el alumno, mostramos su nombre completo
            System.out.println("Alumno encontrado: " + nombreCompleto);
        } else {
            // Si no se encuentra el alumno, mostramos un mensaje indicando que no fue encontrado
            System.out.println("Alumno no encontrado, no se puede Mostrar.");
        }
        System.out.println("-----------------------------------\n");
    }

    // Método para eliminar un alumno del Map usando el carnet
    public void eliminarAlumno(String carnet) {
        // Removemos al alumno del Map y guardamos el nombre del alumno eliminado
        String eliminado = estudiantes.remove(carnet);

        System.out.println("\n-----------------------------------");
        if (eliminado != null) {
            // Si se encuentra y elimina el alumno, mostramos un mensaje de éxito
            System.out.println("Alumno " + eliminado + " con carnet " + carnet + " eliminado exitosamente.");
        } else {
            // Si no se encuentra el alumno, mostramos un mensaje indicando que no fue encontrado
            System.out.println("Alumno no encontrado, no se puede Eliminar.");
        }
        System.out.println("-----------------------------------\n");
    }

    // Método para mostrar todos los alumnos registrados en el Map
    public void mostrarAlumnos() {
        System.out.println("\n-----------------------------------");
        if (estudiantes.isEmpty()) {
            // Si el Map está vacío, mostramos un mensaje indicando que no hay alumnos registrados
            System.out.println("No hay alumnos registrados.");
        } else {
            // Si hay alumnos registrados, iteramos sobre el Map y mostramos cada uno
            System.out.println("Lista de alumnos:");
            for (Map.Entry<String, String> entry : estudiantes.entrySet()) {
                // Mostramos el carnet y el nombre completo de cada alumno
                System.out.println("Carnet: " + entry.getKey() + ", Nombre: " + entry.getValue());
            }
        }
        System.out.println("-----------------------------------\n");
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        // Creamos una instancia de la clase MAP1
        MAP1 MAP1 = new MAP1();


        MAP1.ingresarAlumno("GM202436", "Rolando Guevara");
        MAP1.ingresarAlumno("RM235589", "Ronald Vladimir");
        MAP1.ingresarAlumno("RM235689", "Rolo Martinez");


        MAP1.buscarAlumno("GM202436"); // Alumno que sí existe
        MAP1.buscarAlumno("XX2420"); // Alumno que no existe


        //MAP1.eliminarAlumno("RM235589"); // Alumno que sí existe
        MAP1.eliminarAlumno("XX2420"); // Alumno que no existe


        MAP1.mostrarAlumnos();
    }
}