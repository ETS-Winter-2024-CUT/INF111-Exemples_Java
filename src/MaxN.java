import java.util.Scanner;

/*
 * Ce code Java permet à l'utilisateur de spécifier un nombre de valeurs, puis saisit ces valeurs et
 *  trouve la plus grande parmi elles. 
 * Il utilise les méthodes `saisir_entier_positif` pour obtenir un nombre valide de valeurs à 
 *  comparer et `trouver_max` pour déterminer la plus grande valeur parmi celles saisies. 
 * Ensuite, il affiche la plus grande valeur.
 */

public class MaxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demande à l'utilisateur le nombre de valeurs à comparer
        int nombre_valeurs = saisir_entier_positif(scanner);
        // Trouve la valeur maximale parmi les valeurs saisies
        double valeur_max = trouver_max(scanner, nombre_valeurs);

        // Affiche la plus grande valeur saisie
        System.out.printf("La plus grande valeur est: %.2f", valeur_max);

        scanner.close(); // Ferme le Scanner pour libérer les ressources
    }

    // Méthode pour saisir un entier positif supérieur ou égal à 2
    private static int saisir_entier_positif(Scanner scanner) {
        int valeur;

        // Vérifie que le nombre est supérieur à 2, redemander tant que nécessaire
        do {
            System.out.println("Entrez le nombre de valeurs à comparer:");
            valeur = scanner.nextInt();
        } while (valeur < 2);

        return valeur;
    }

    // Méthode pour trouver la valeur maximale parmi les valeurs saisies
    private static double trouver_max(Scanner scanner, int nombre_valeurs) {
        System.out.printf("Entrez %d valeurs:\n", nombre_valeurs);

        // Initialise la variable max avec une valeur minimale possible
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < nombre_valeurs; i++) {
            double nouvelle_valeur = scanner.nextDouble(); // Saisie de la nouvelle valeur

            // Mise à jour de la valeur maximale si la nouvelle valeur est plus grande
            if (nouvelle_valeur > max)
                max = nouvelle_valeur;
        }

        return max; // Retourne la valeur maximale parmi celles saisies
    }
}
