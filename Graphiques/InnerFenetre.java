import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre {
    public static void main(String []arg){
        JFrame fen = new JFrame("Je sui");
        JPanel p = new JPanel();

        fen.setContentPane(p);
        fen.setSize(400,300);
        fen.setLocationRelativeTo(null);
        fen.setVisible(true);
        fen.getMenuBar();
        fen.setLocationRelativeTo(null);

        JTextField input = new JTextField(10);
        JLabel label = new JLabel("Mon texte");
        JButton button = new JButton("Je suis");
        p.add(label);
        p.add(input);
        p.add(button);

        p.setBackground(Color.WHITE);
    }
}


/**
 * InnerFenetre
 */
public class InnerFenetre {

    
}