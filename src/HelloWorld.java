/**
 * La classe HelloWorld est le point de départ de ce programme Java.
 * Elle contient une méthode principale (main) qui est le point d'entrée du programme.
 * 
 * - public : Indique que la classe HelloWorld est accessible depuis n'importe où.
 * - class : Déclare la création d'une nouvelle classe nommée HelloWorld.
 * - HelloWorld : Nom de la classe.
 */
public class HelloWorld {

    /**
     * La méthode main est le point de départ de l'exécution du programme.
     * 
     * - public : Indique que la méthode main peut être appelée depuis l'extérieur de la classe.
     * - static : La méthode main est associée à la classe elle-même plutôt qu'à une instance 
     *  spécifique.
     * - void : La méthode main ne renvoie aucune valeur.
     * - main : Nom de la méthode principale du programme.
     * - String[] args : Le paramètre args est un tableau de chaînes de caractères 
     *  (arguments de ligne de commande).
     * - throws Exception : Indique que cette méthode peut lancer une erreur de type Exception.
     */
    public static void main(String[] args) throws Exception {
        // La ligne suivante affiche "Hello, World!" sur la console.
        System.out.println("Hello, World!");
    }
}
