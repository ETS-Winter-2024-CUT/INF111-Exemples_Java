import java.util.Scanner; // Importe la classe Scanner du package `java.util`

/**
 * Ce programme calcule le salaire en fonction du nombre d'heures travaillées et du 
 *  taux horaire.
 * Il demande à l'utilisateur d'entrer le nombre d'heures de travail et le taux
 *  horaire, puis calcule et affiche le salaire.
 */

public class CalculSalaire {
    public static void main(String[] args) {
        // Crée un nouvel objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer le nombre d'heures et le stocke
        System.out.println("Nombre d'heures de travail: ");
        int nbr_heures = scanner.nextInt();

        // Demande à l'utilisateur d'entrer le taux horaire et le stocke
        System.out.println("Taux horaire: ");
        float taux_horaire = scanner.nextFloat();

        // Calcule du salaire
        float salaire = nbr_heures * taux_horaire;

        System.out.println("Salaire: " + salaire); // Affiche le salaire calculé

        scanner.close(); // Ferme l'objet Scanner pour libérer les ressources
    }
}
