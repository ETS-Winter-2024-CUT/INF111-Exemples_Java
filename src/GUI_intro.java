import javax.swing.JOptionPane;

/**
 * La classe GUI_intro illustre l'utilisation de JOptionPane pour interagir avec l'utilisateur
 * à travers des boîtes de dialogue graphiques.
 */
public class GUI_intro {

    /**
     * La méthode principale de la classe GUI_intro.
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        // Demande et affichage du nom saisi par l'utilisateur
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Saisie de l'âge en utilisant showInputDialog et conversion en int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        /* Lorsqu'on utilise showInputDialog, ça retourne un string.
         * En utilisant Integer.parseInt, nous convertissons la variable de retour (string) en int.
         */
        JOptionPane.showMessageDialog(null, "Your are " + age + " years old");

        // Saisie de la taille en mètres en utilisant showInputDialog et conversion en double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in
                                                                        meters"));
        JOptionPane.showMessageDialog(null, "Your are " + height + " meters tall");
    }
}
