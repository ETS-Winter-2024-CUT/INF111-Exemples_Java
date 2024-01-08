import java.util.Scanner;

/**
 * Programme pour déterminer le nombre de jours dans un mois pour une année donnée.
 */
public class NombreJoursADate {

    /**
     * Méthode principale pour exécuter le programme.
     *
     * @param args Arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un numéro de mois et d'année
        System.out.println("Entrez un numéro de mois et d'année (ex: 12 2023)");

        // Lecture des entrées de l'utilisateur pour le mois et l'année
        int mois = scanner.nextInt();
        int annee = scanner.nextInt();

        // Vérification de la validité du mois et de l'annee
        if (mois < 0 || mois > 12) {
            // Affiche un message si le mois est invalide
            System.out.println("Ce mois est invalide!");
        } else if (annee < 1582) {
            // Affiche un message si l'année est antérieure à l'adoption du calendrier Grégorien
            System.out.println("En cette année, le calendrier Grégorien n'existait pas!");
        } else {
            // Affichage du nombre de jours dans le mois et l'année donnés
            System.out.printf("Il y a %d jours dans le mois %d de l'année %d!",
                    nbr_jours_mois(annee, mois), mois, annee);
        }

        scanner.close(); // Fermeture du scanner pour libérer les ressources
    }

    /**
     * Méthode pour déterminer le nombre de jours dans un mois donné pour une année donnée.
     *
     * @param annee Année pour laquelle le nombre de jours est calculé
     * @param mois  Mois pour lequel le nombre de jours est calculé
     * @return      Le nombre de jours dans le mois pour l'année donnée
     */
    private int nbrJoursMois(int annee, int mois) {
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31; // Mois ayant 31 jours
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; // Mois ayant 30 jours
            case 2:
                // Février avec ajustement pour les années bissextiles
                return 28 + (annee_est_bisextile(annee) ? 1 : 0);
            default:
                return 0; // Pour toute autre entrée de mois invalide
        }
    }

    /**
     * Méthode pour vérifier si une année est bissextile ou non.
     *
     * @param annee Année à vérifier pour la bissextile
     * @return      True si l'année est bissextile, sinon False
     */
    private static boolean annee_est_bisextile(int annee) {
        // Vérification des conditions pour qu'une année soit bissextile
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}
