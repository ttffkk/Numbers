import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("Basic Math Functions");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);

       JPanel panel = new JPanel();
       JTextArea textArea = new JTextArea();
       textArea.setBounds(50, 100, 200, 30);
       JButton button = new JButton("Nächste Primzahl");
       JButton button2 = new JButton("e^x");
        JButton button3 = new JButton("Fibonacci");
        JButton button4 = new JButton("Primfaktoren");
        panel.setLayout(new BorderLayout(20,15));
       panel.add(button, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.WEST);
        panel.add(button3, BorderLayout.EAST);
        panel.add(button4, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.CENTER);
        textArea.setBounds(50, 100, 200, 30);
        frame.add(panel);
        frame.setVisible(true);
    }
}