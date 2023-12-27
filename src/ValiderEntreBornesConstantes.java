import java.util.Scanner;

/*
    Valider qu'un nombre est compris entre 1 et 100.
    Pour ce faire, définire deux constantes avec les valeurs 1 et 100 et une variable de type entier
    Dans une boucle, saisir une valeur au clavier, vérifier qu'elle est entre 1 et 100,
        si elle ne l'est pas, afficher un message d'erreur et redemander a nouveau la valeur.
    La boucle se termine lorsque le nombre est valide.
    On affiche ensuite ce nombre.
*/

public class ValiderEntreBornesConstantes {
    static final int VALEUR_MIN = 1;
    static final int VALEUR_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valeur;

        do {
            System.out.printf("Entrez une valeur comprise entre %d et %d (inclus) : ",
                    VALEUR_MIN, VALEUR_MAX);
            valeur = scanner.nextInt();

            if (valeur < VALEUR_MIN || valeur > VALEUR_MAX) {
                System.out.printf("Erreur, %d n'est pas compris entre %d et %d!\n",
                        valeur, VALEUR_MIN, VALEUR_MAX);
            }
        } while (valeur < VALEUR_MIN || valeur > VALEUR_MAX);

        System.out.println(valeur);
        scanner.close();
    }
}
