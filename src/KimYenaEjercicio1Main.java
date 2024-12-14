import java.util.Scanner;
import java.util.Random;

public class KimYenaEjercicio1Main {
    public static void main(String[] args) {
        // Crear un objeto del tipo KimYenaPerfil
        KimYenaPerfil miPerfil = new KimYenaPerfil("Yena Kim", "Soy una desarrolladora web apasioinada por el running y el arte.");

        // Añadir información al perfil
        miPerfil.getHobbies().add("\uD83C\uDFC3\u200D♀\uFE0F\u200D➡\uFE0F Running");
        miPerfil.getHobbies().add("\uD83C\uDFB6 Hacer música");
        miPerfil.getHobbies().add("\uD83C\uDFAC Ver película");
        miPerfil.getFoods().add("\uD83C\uDF4C Plátanos");
        miPerfil.getFoods().add("\uD83C\uDF57 Chicken chicken chicken coreano");
        miPerfil.getFoods().add("\uD83C\uDF6B Chocolate");
        miPerfil.getFunFacts().add("Este año he completado correr 21 km en el half-maratón!");
        miPerfil.getFunFacts().add("Me gusta producir música y hacer DJ.");
        miPerfil.getFunFacts().add("Soy una apisionada de Pokemon");

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        // Bucle del menú
        while (option != 4) {
            showMenu(miPerfil.getName());
            try {
                // Leer opción del usuario
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println(miPerfil.getFormattedStory());
                        break;
                    case 2:
                        System.out.println(miPerfil.getFormattedHobbies());
                        System.out.println(miPerfil.getFormattedFoods());
                        break;
                    case 3:
                        // Obtener un fun fact aleatorio
                        String funFact = miPerfil.getFunFacts().get(new Random().nextInt(miPerfil.getFunFacts().size()));
                        System.out.println("===Fun Fact ===");
                        System.out.println(funFact);
                        break;
                    case 4:
                        System.out.println("\n¡Adiós!");
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intenta nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada no válida. Por favor, introduce un número del 1 al 4.");
            }
            // Separador entre iteraciones
            System.out.println("--------------------------------------\n");
        }
        scanner.close();
    }
    // Mostrar el menú
    public static void showMenu(String nombre) {
        System.out.println("Menu AboutMe [" + nombre + "]");
        System.out.println("[1] Story");
        System.out.println("[2] Favorites");
        System.out.println("[3] Fun Fact");
        System.out.println("[4] Salir");
        System.out.println("Elige una opción: ");
    }
}