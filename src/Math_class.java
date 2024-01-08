import java.util.Scanner;

/**
 * La classe math_class illustre l'utilisation de la classe Math et de la classe Scanner pour
 * calculer l'hypoténuse d'un triangle en utilisant le théorème de Pythagore.
 */
public class Math_class {

    /**
     * La méthode principale de la classe math_class.
     * Elle permet à l'utilisateur d'entrer les côtés d'un triangle, puis calcule et affiche
     * l'hypoténuse.
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        // Calcul de l'hypoténuse en utilisant le théorème de Pythagore
        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is: " + z);

        scanner.close();
    }

    /**
     * Méthodes mathématiques disponibles dans la classe Math :
     *
     * Méthodes trigonométriques :
     * - double Math.sin(double a) : Renvoie le sinus de l'angle spécifié en radians.
     * - double Math.cos(double a) : Renvoie le cosinus de l'angle spécifié en radians.
     * - double Math.tan(double a) : Renvoie la tangente de l'angle spécifié en radians.
     *
     * Méthodes logarithmiques :
     * - double Math.log(double a) : Renvoie le logarithme naturel (base e) d'un nombre donné.
     * - double Math.log10(double a) : Renvoie le logarithme en base 10 d'un nombre donné.
     *
     * Méthodes exponentielles :
     * - double Math.exp(double a) : Renvoie la valeur exponentielle de l'argument spécifié.
     *
     * Méthodes de puissance :
     * - double Math.pow(double base, double exponent) : Renvoie la valeur de la base élevée à la
     *   puissance de l'exposant.
     *
     * Méthodes de manipulation de nombres :
     * - double Math.abs(double a) : Renvoie la valeur absolue d'un nombre.
     * - int Math.abs(int a) : Renvoie la valeur absolue d'un entier.
     * - double Math.sqrt(double a) : Renvoie la racine carrée d'un nombre.
     *
     * Méthodes de conversion :
     * - double Math.toDegrees(double angrad) : Convertit l'angle spécifié de radians en degrés.
     * - double Math.toRadians(double angdeg) : Convertit l'angle spécifié de degrés en radians.
     *
     * Constantes :
     * - double Math.PI : La constante π (pi).
     * - double Math.E : La constante e (base du logarithme naturel).
     *
     * Méthodes d'arrondi :
     * - double Math.round(double a) : Arrondi.
     * - double Math.ceil(double a) : Arrondi vers le haut.
     * - double Math.floor(double a) : Arrondi vers le bas.
     */
}
