/**
 * La classe expressions illustre les concepts d'expressions, d'opérandes et d'opérateurs en Java.
 * Elle démontre également l'utilisation des opérateurs arithmétiques et des opérateurs 
 * d'assignation augmentée.
 */
public class Expressions {

    /**
     * La méthode principale de la classe expressions.
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        /*
         * expression = operands & operators
         * operands = values, variables, numbers, quantity
         * operators = + - * / %
         */

        int num = 10;

        // Division par 2 et assignation du résultat à la variable num
        num = num / 2; // est la meme chose que: num /= 2

        System.out.println(num);
    }

    /**
     * Les opérateurs arithmétiques disponibles en Java.
     * + (addition)
     * - (soustraction)
     * * (multiplication)
     * / (division)
     * % (modulo)
     * ++ (incrément)
     * -- (décrément)
     */

    /**
     * Les opérateurs d'assignation augmentée facilitent l'utilisation des opérations récurrentes.
     * x = x + 1 peut être remplacé par x += 1.
     */
}
