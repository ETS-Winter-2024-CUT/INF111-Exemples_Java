import java.util.Scanner; /* Afin d'utiliser les scanners, on doit ajouter de la librairie, la classe Scanner se trouver dans le pack Utility */

public class user_input {
    public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in); 
        /* On initialise un Scanner nommer "scanner1" */

        System.out.println("What is your name?");
        String name = scanner1.nextLine();
        /* On lui indique de scanner la prochaine ligne (entrer dans le terminal) */
        
        System.out.println("How old are you ");
        int age = scanner1.nextInt();
        /* On lui indique de scanner le prochain int (entrer dans le terminal) */

        scanner1.nextLine();
        /* En utilisant le scanner "next line" nous allons chercher dans l'ordre
         * Variable     Scanner
         * Name         Jhon\n (Le \n represente la touche enter)
         * Age          20
         * Food         \n     (Car lorsque on clic "enter" suite a notre age, le scanner ne garde que le chiffre et laisse donc la
         *                      caractere \n comme etant le prochain objet a scanner, donc si nous voulons lire un autre ligne de caractere
         *                      on doit "eliminer" le \n, ce qui peut etre fait avec la ligne scanner1.nextLine())
         */

        System.out.println("What is your favorite food? ");
        String food = scanner1.nextLine();
        /* On lui indique de scanner la prochaine ligne (entrer dans le terminal) */

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favorite food is "+food);
    }
}
