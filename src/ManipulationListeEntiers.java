import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Cette classe permet à l'utilisateur de manipuler une liste d'entiers en effectuant diverses 
 *  opérations telles que l'ajout, l'affichage, le calcul de la somme, la recherche du plus grand 
 *  élément et la suppression d'un élément spécifique de la liste.
 */

public class ManipulationListeEntiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'une liste pour stocker des entiers
        List<Integer> liste_entiers = new ArrayList<>();

        System.out.println("Combien de valeurs souhaitez-vous ajouter a la liste?");
        int nombre_elements = scanner.nextInt();

        System.out.println("Veuillez saisir les valeurs:");
        for (int i = 0; i < nombre_elements; i++) {
            int element = scanner.nextInt(); // Demande à l'utilisateur de saisir chaque élément
            liste_entiers.add(element); // Ajout de l'élément à la liste
        }

        // Affichage de la taille de la liste
        System.out.printf("Il y'a %d valeurs dans la liste\n", liste_entiers.size());

        // Affichage des éléments de la liste
        System.out.println("Contenu de la liste: " + liste_entiers);

        // Calcul et affichage de la somme des éléments de la liste
        int somme = 0;

        /*
         * l'opérateur `:` est utilisé dans une structure de boucle for améliorée (ou for-each) 
         * pour itérer à travers les éléments d'une collection telle qu'une liste, un tableau ou 
         * toute autre structure de données itérable.
         */
        for (int element : liste_entiers)
            somme += element; // Ajoute chaque élément à la somme

        System.out.println("La somme des valeurs est " + somme);

        // Affichage du plus grand élément de la liste
        int maximum = Collections.max(liste_entiers); // Trouve le plus grand élément dans la liste
        System.out.println("La plus grand valeur est " + maximum);

        // Suppression d'un élément de la liste en fonction de l'indice fourni par l'utilisateur
        System.out.println("Entrez l'indice de la valeur a supprimer");
        int index_element_a_supprimer = scanner.nextInt();
        liste_entiers.remove(index_element_a_supprimer); // Supprime l'élément à l'indice spécifié
        System.out.println("Liste mise a jour: " + liste_entiers);

        scanner.close();
    }
}
