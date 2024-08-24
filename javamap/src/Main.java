import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // se crea un map qwue guarda los países y capitales
        Map<String, String> mapaPaises = new HashMap<>();

        mapaPaises.put("Francia", "París");
        mapaPaises.put("Alemania", "Berlín");
        mapaPaises.put("Japón", "Tokio");

        // Busca y muestra la capital de Japón
        String capitalDeJapon = mapaPaises.get("Japón");
        System.out.println("La capital de Japón es: " + capitalDeJapon);

        // revisa si alemania se encuentra en el map
        if (mapaPaises.containsKey("Alemania")) {
            System.out.println("Alemania está en el map.");
        }

        // Pregunta si desea eliminar  Alemania
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Deseas eliminar a Alemania del mapa? (si/no)");
        String respuesta = scanner.nextLine();

        // Aplicamos remove() si la respuesta es "si"
        if (respuesta.equalsIgnoreCase("si")) {
            mapaPaises.remove("Alemania");
            System.out.println("Alemania ha sido eliminada del mapa.");
        } else {
            System.out.println("Alemania no ha sido eliminada del mapa.");
        }

        // Muestra el número total de países en el map después de eliminar o no el pais
        System.out.println("El mapa contiene " + mapaPaises.size() + " países después de la operación.");
    }
}
