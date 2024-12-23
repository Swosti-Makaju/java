import javax.swing.*;
import java.awt.event.*;
//1st step implement action listener
public class App implements ActionListener{
       JTextField  tf;
       JButton b;
       App()
       {
        JFrame f=new JFrame();
        tf=new JTextField();
        tf.setBounds(50, 50, 150, 30);
        b=new JButton("Click Here");
        b.setBounds(50, 100, 60, 30);
        //2nd step
        b.addActionListener(this);
        f.add(b);

        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
       }
       //3rd step
       public void actionPerformed(ActionEvent e)
       {
        tf.setText("Hello World");
       }
       public static void main(String[] args) throws Exception {
        new App();
       }
    }

