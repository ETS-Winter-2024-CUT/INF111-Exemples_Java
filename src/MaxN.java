import java.util.Scanner;

public class MaxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre_valeurs = saisir_entier_positif(scanner);
        double valeur_max = trouver_max(scanner, nombre_valeurs);

        System.out.printf("La plus grande valeur est: ");
        if ((int) valeur_max == valeur_max) {
            System.out.println((int) valeur_max);
        } else {
            System.out.println(valeur_max);
        }

        scanner.close();
    }

    private static int saisir_entier_positif(Scanner scanner) {
        System.out.println("Entrez le nombre de valeurs a comparer:");
        int valeur = scanner.nextInt();

        return valeur;
    }

    private static double trouver_max(Scanner scanner, int nombre_valeurs) {
        System.out.printf("Entrez %d valeurs: ", nombre_valeurs);

        double max = scanner.nextDouble();

        for (int i = 0; i < nombre_valeurs - 1; i++) {
            double nouvelle_valeur = scanner.nextDouble();

            if (nouvelle_valeur > max)
                max = nouvelle_valeur;
        }

        return max;
    }
}
