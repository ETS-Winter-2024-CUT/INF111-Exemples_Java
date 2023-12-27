import java.util.Scanner;

/*
    Programme permettant de calculer la somme de plusieurs entiers saisis au clavier, 
        compris dans l'intervalle 1 à 10.
*/

public class SommeEntreBornes {
    // Définition des constantes
    static final int FIN = 0;
    static final int VALEUR_MIN = 1;
    static final int VALEUR_MAX = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombre;
        long somme = 0;

        // Boucle pour saisir les nombres et calculer la somme
        do {
            System.out.println("Entrez un nombre compris entre " + VALEUR_MIN + " et " +
                    VALEUR_MAX + " (inclus), ou entrez 0 pour terminer : ");
            nombre = scanner.nextInt();

            // Vérifie si l'utilisateur veut terminer la saisie
            if (nombre == FIN) {
                System.out.println("La somme finale est: " + somme);
                break; // Sort de la boucle si l'utilisateur veut terminer
            }

            // Vérifie si le nombre saisi est dans la plage valide
            if (nombre < VALEUR_MIN || nombre > VALEUR_MAX) {
                System.out.println("Erreur, " + nombre + " n'est pas compris entre " + VALEUR_MIN +
                        " et " + VALEUR_MAX + " !");
            } else {
                // Ajoute le nombre à la somme si celui-ci est valide
                somme += nombre;
            }
        } while (nombre != FIN); // Continue la boucle jusqu'à ce que l'utilisateur termine

        scanner.close(); // Ferme le scanner une fois la saisie terminée
    }
}
