package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> tareasStack = new Stack<>();
        System.out.println("Demostración de Stack:");

        // Añadir elementos a la pila
        tareasStack.push("Videollamada con mi jefe");
        tareasStack.push("Enviar reporte mensual");
        tareasStack.push("Actualizar software");
        System.out.println("Tareas con Stack: " + tareasStack);

        // Verificar si la pila está vacía
        if (tareasStack.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }

        // Ver el último elemento agregado
        System.out.println("Último elemento agregado (peek): " + tareasStack.peek());

        // Eliminar el último elemento agregado
        String ultimoElemento = tareasStack.pop();
        System.out.println("Elemento eliminado: " + ultimoElemento);
        System.out.println("Tareas después de eliminar el último elemento: " + tareasStack);

        // Recorrer la pila con for-each
        System.out.println("Recorriendo la pila con for-each:");
        for (String tarea : tareasStack) {
            System.out.println("Tarea: " + tarea);
        }
    }
}