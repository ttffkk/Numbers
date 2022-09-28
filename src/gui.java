import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);

       JTextArea textArea = new JTextArea();
       textArea.setBounds(50, 100, 200, 30);
       JButton button = new JButton("Nächste Primzahl");
       JButton button2 = new JButton("e^x");
        JButton button3 = new JButton("Fibonacci");
        
        frame.getContentPane().add(button2);
         frame.getContentPane().add(button3);
        frame.getContentPane().add(button);
        frame.add(textArea);
         frame.setLayout(new FlowLayout());
       frame.setVisible(true);
    }
}