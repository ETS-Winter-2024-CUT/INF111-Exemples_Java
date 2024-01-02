import java.util.Scanner;

/**
 * Ce programme prend une note numérique (entre 0 et 100) en entrée et affiche la notation
 *  littérale correspondante en fonction d'une échelle de notation prédéfinie.
 */

public class NotationLiterale {
    // Définition des bornes minimale et maximale des notes
    static final int NOTE_MIN = 0;
    static final int NOTE_MAX = 100;

    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Invite l'utilisateur à entrer une note dans la plage définie
        System.out.printf("Entrez une note (entre %d et %d): ", NOTE_MIN, NOTE_MAX);
        double note = scanner.nextFloat(); // Stocke la note saisie dans la variable 'note'

        // Appelle la fonction pour afficher la notation littérale correspondant à la note entrée
        afficher_note_litterale(note);

        // Ferme le scanner pour libérer les ressources
        scanner.close();
    }

    // Fonction pour afficher la notation littérale correspondant à la note donnée
    private static void afficher_note_litterale(double note) {
        // Vérifie si la note est valide (entre NOTE_MIN et NOTE_MAX)
        if (note < NOTE_MIN || note > NOTE_MAX) {
            System.out.printf("Cette note (%.2f) est invalide!\n", note);
            return;
        }

        System.out.printf("Cette note correspond a ");

        if (note >= 89.5) System.out.printf("A+, Excellent");
        else if (note >= 84.5) System.out.printf("A, Excellent");
        else if (note >= 79.5) System.out.printf("A-, Excellent");
        else if (note >= 74.5) System.out.printf("B+, Tres bien");
        else if (note >= 69.5) System.out.printf("B, Tres bien");
        else if (note >= 64.5) System.out.printf("B-, Tres bien");
        else if (note >= 59.5) System.out.printf("C+, Bien");
        else if (note >= 54.5) System.out.printf("C, Bien");
        else if (note >= 49.5) System.out.printf("C-, Bien");
        else if (note >= 44.5) System.out.printf("D+, Passable");
        else if (note >= 39.5) System.out.printf("D, Passable");
        else System.out.printf("E, Echec");

        System.out.println("."); // Affiche un point à la fin de la notation littérale
    }
}
