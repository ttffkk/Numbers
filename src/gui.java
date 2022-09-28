import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("Basic Math Functions");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);

       JPanel panel = new JPanel();
       JPanel plen = new JPanel();
       JTextArea textArea = new JTextArea();
       textArea.setBounds(50, 100, 200, 30);
       JButton button = new JButton("Nächste Primzahl");
       JButton button2 = new JButton("e^x");
        JButton button3 = new JButton("Fibonacci");
        JButton button4 = new JButton("Primfaktoren");
        
       panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        plen.add(textArea);
        textArea.setBounds(50, 100, 200, 30);
        panel.setLayout(new FlowLayout());
        frame.add(panel);
        frame.add(plen);
        frame.setVisible(true);
    }
}