import MAP1.MAP1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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