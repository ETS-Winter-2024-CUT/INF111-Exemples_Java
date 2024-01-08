/**
 * Ce programme illustre l'utilisation des boucles for pour filtrer et afficher
 * des nombres en
 * fonction de différentes conditions dans des plages définies.
 */

public class BoucleFor {
    static final int BORNE_MIN = 1;
    static final int BORNE_MAX = 100;
    static final int GRANDE_BORNE_MIN = 99;
    static final int GRANDE_BORNE_MAX = 300;

    public static void main(String[] args) {

        // Affichage des valeurs impairs entre deux bornes
        System.out.printf("Valeurs impairs entre %d et %d: ", BORNE_MIN, BORNE_MAX);

        for (int i = BORNE_MIN; i <= BORNE_MAX; i++) {
            if (i % 2 == 1)
                System.out.printf("%d ", i);
        }

        System.out.println('\n'); // Ajout d'un double saut de ligne entre deux affichages

        // Affichange des valeurs pairs entre deux bornes en ordre décroissant
        System.out.printf("Valeurs pair entre %d et %d: ", BORNE_MAX, BORNE_MIN);

        for (int i = BORNE_MAX; i >= BORNE_MIN; i--) {
            if (i % 2 == 0)
                System.out.printf("%d ", i);
        }

        System.out.println('\n'); // Ajout d'un double saut de ligne entre deux affichages

        // Affichage des valeurs multiples de trois (valeur arbitraire pour l'exercice)
        System.out.printf("Valeurs divisibles par 3 entre %d et %d: ",
                GRANDE_BORNE_MIN, GRANDE_BORNE_MAX);

        for (int i = GRANDE_BORNE_MIN; i <= GRANDE_BORNE_MAX; i++) {
            if (i % 3 == 0)
                System.out.printf("%d ", i);
        }

        System.out.println('\n'); // Ajout d'un double saut de ligne entre deux affichages

        // Affichage des valeurs multiples de sept (valeur abitraire pour l'exercice)
        System.out.printf("Valeurs divisibles par 7 entre %d et %d: ",
                GRANDE_BORNE_MAX, GRANDE_BORNE_MIN);

        for (int i = GRANDE_BORNE_MAX; i >= GRANDE_BORNE_MIN; i--) {
            if (i % 7 == 0)
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
