package lamdbaexpression.ex7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LambdaExEventListener {

    public LambdaExEventListener() {
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("click");
        b.setBounds(80, 100, 70, 30);

        // lambda expression implementing here.  
        b.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, tf.getText());
        });

        JFrame f = new JFrame();
        f.add(tf);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LambdaExEventListener();
    }
}
