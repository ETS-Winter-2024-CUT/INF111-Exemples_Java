/**
 * Ce programme illustre l'utilisation des boucles for pour filtrer et afficher des nombres en
 *  fonction de différentes conditions dans des plages définies.
 */

public class BoucleFor {
    public static void main(String[] args) {
        System.out.println("Nombres impairs entre 1 et 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.printf("%d ", i);
        }

        System.out.println("\n\nNombres pair entre 100 et 1: ");
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0)
                System.out.printf("%d ", i);
        }

        System.out.println("\n\nNombres divisibles par 3 entre 99 et 300: ");
        for (int i = 99; i <= 300; i++) {
            if (i % 3 == 0)
                System.out.printf("%d ", i);
        }

        System.out.println("\n\nNombres divisibles par 7 entre 700 et 600: ");
        for (int i = 700; i >= 600; i--) {
            if (i % 7 == 0)
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
