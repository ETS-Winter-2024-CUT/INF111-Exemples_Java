import javax.swing.JOptionPane;

public class GUI_intro {
        public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        /* Lorsqu'on utiliser showImputDialog, ça retourne un string, ici on veux un int, en utilisant Integer.Parse,
           nous allons convertir la variable de retour string, dirrectement en int */
        JOptionPane.showMessageDialog(null, "Your are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in m"));
        JOptionPane.showMessageDialog(null, "Your are "+height+" meters tall");
    }
}
