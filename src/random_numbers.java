import java.util.Random;

/**
 * La classe random_numbers illustre l'utilisation de la classe Random pour générer
 * des nombres aléatoires de différents types en Java.
 */
public class random_numbers {

    /**
     * La méthode principale de la classe random_numbers.
     * Elle génère un entier, un double et un booléen aléatoires, puis les affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {

        // Création d'une instance de la classe Random
        Random random = new Random();

        // Génération d'un entier aléatoire entre 1 (inclus) et 6 (exclus)
        int x = random.nextInt(6) + 1;

        // Génération d'un double aléatoire entre 0.0 (inclus) et 1.0 (exclus)
        double y = random.nextDouble();

        // Génération d'un booléen aléatoire
        boolean z = random.nextBoolean();

        // Affichage des nombres aléatoires générés
        System.out.println("Random Integer: " + x);
        System.out.println("Random Double: " + y);
        System.out.println("Random Boolean: " + z);
    }
}
