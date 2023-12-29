import java.util.Scanner;

/**
 * Programme Java pour calculer le prix total des achats avec des réductions et des taxes
 */

public class PrixCoopETS {
    // Définition des constantes pour les taxes, la réduction et le seuil de réduction
    static final double TAXES = 0.15;
    static final double REDUCTION = 0.1;
    static final double SEUIL_REDUCTION = 100.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sous_total = calculSousTotal(scanner);

        afficherSousTotal(sous_total);

        double total = calculTotal(sous_total);

        afficherTotal(total);

        scanner.close();
    }

    // Fonction pour poser une question à l'utilisateur et obtenir une réponse "oui/non"
    public static boolean poserQuestionOuiNon(Scanner scanner, String question) {
        System.out.println(question + " [oui/non]");
        String reponse = scanner.next().toLowerCase();
        char premier_caractere = reponse.charAt(0);
        return premier_caractere == 'o';
    }

    // Fonction pour calculer le sous-total des achats
    private static double calculSousTotal(Scanner scanner) {
        double sous_total = 0;

        boolean continuer = true;
        while (continuer) {
            System.out.println("Entrez la quantite d'articles pris:");
            int quantite = scanner.nextInt();

            System.out.println("Entrez le prix unitaire:");
            double prix_unitaire = scanner.nextDouble();

            // Calcul du sous-total en ajoutant le coût des articles saisis
            sous_total += quantite * prix_unitaire;

            continuer = poserQuestionOuiNon(scanner, "Ajouter autre chose au panier?");
        }

        return sous_total;
    }

    // Fonction pour calculer et appliquer la réduction si le sous-total dépasse le seuil
    public static double calculTotal(double sous_total) {
        double total = sous_total;

        // Vérification si le sous-total dépasse le seuil pour appliquer une réduction
        if (sous_total >= SEUIL_REDUCTION) {
            double application_reduction = total * REDUCTION;
            System.out.printf("Application de la reduction (-%.2f%%): $-%.2f\n",
                    (REDUCTION * 100), application_reduction);
            total -= application_reduction;
        }

        return total + calculTaxes(total);
    }

    // Fonction pour calculer le montant des taxes
    private static double calculTaxes(double total) {
        double taxes = total * TAXES;
        System.out.printf("Taxes: $%.2f\n", taxes);
        return taxes;
    }

    // Fonction pour afficher le sous-total
    private static void afficherSousTotal(double sous_total) {
        System.out.printf("Sous-total: $%.2f\n", sous_total);
    }

    // Fonction pour afficher le total
    private static void afficherTotal(double total) {
        System.out.printf("Total: $%.2f\n", total);
    }
}
