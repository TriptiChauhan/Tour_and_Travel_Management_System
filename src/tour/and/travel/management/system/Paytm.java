package travel.management.system;

import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{
    
    Paytm() {
        setBounds(350,90,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,40,700,500);
        add(image);
        
        try {
//            pane.setPage("https://paytm.com/rent-payment/find-ifsc");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}
