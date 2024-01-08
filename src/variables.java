/**
 * La classe variables illustre la déclaration et l'initialisation de différentes variables en Java,
 * et fait une comparaison avec des concepts de programmation en C.
 */
public class variables {

    /**
     * La méthode principale de la classe variables.
     * Elle déclare et initialise plusieurs variables de différents types, puis les affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args){

        // Déclaration et initialisation de variables de différents types
        int x = 123;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Hugh";

        // Affichage des valeurs des variables
        System.out.println("Hello " + name); 
        System.out.println(symbol);
        /*
         * Une différence entre "C" et "Java":
         * En C, simplement printf();
         * En Java, System.out.printf();
         * 
         * Ici, le System.out.println(); (print line) est utilisé pour afficher une ligne
         * suivie d'un saut de ligne. Il permet aussi le formatage " + variable", ou 
         * println(variable) qui peut simplifier l'écriture, bien que l'écriture habituelle du C 
         * soit tout aussi valable.
         */ 
    } 
}
