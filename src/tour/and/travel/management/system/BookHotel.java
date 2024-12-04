//package travel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//
//
//public class BookHotel extends JFrame implements ActionListener {
//    
//    Choice chotel,cac,cfood;
//    JTextField tfpersons,tfdays;
//    String username;
//    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
//    JButton checkprice,bookpackage, back;
//    
//    BookHotel(String username) {
//        this.username = username;
//        setBounds(150,60,1100,600);
//        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
//        
//        JLabel text = new JLabel("BOOK HOTEL");
//        text.setBounds(100,10,200,30);
//        text.setFont(new Font("Tahoma", Font.BOLD,20));
//        add(text);
//        
//        JLabel lblusername = new JLabel("Username");
//        lblusername.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblusername.setBounds(40,70,100,20);
//        add(lblusername);
//        
//        labelusername = new JLabel();
//        labelusername.setFont(new Font("Tahoma", Font.PLAIN,16));
//        labelusername.setBounds(250,70,200,20);
//        add(labelusername);
//        
//        JLabel lblpackage= new JLabel("Select Hotel");
//        lblpackage.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblpackage.setBounds(40,110,150,20);
//        add(lblpackage);
//        
//        chotel = new Choice();
//        chotel.setBounds(250,110,200,20);
//        add(chotel);
//        
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from hotel");
//            while(rs.next()) {
//                chotel.add(rs.getString("name"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        JLabel lblpersons = new JLabel("Total Persons");
//        lblpersons.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblpersons.setBounds(40,150,150,25);
//        add(lblpersons);
//        
//        tfpersons = new JTextField("1");
//        tfpersons.setBounds(250,150,200,25);
//        add(tfpersons);
//        
//        JLabel lbldays = new JLabel("No. of Days");
//        lbldays .setFont(new Font("Tahoma", Font.PLAIN,16));
//        lbldays .setBounds(40,190,150,25);
//        add(lbldays);
//        
//        tfdays = new JTextField("1");
//        tfdays.setBounds(250,190,200,25);
//        add(tfdays );
//        
//        JLabel lblac = new JLabel("AC/ Non-AC");
//        lblac .setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblac .setBounds(40,230,150,25);
//        add(lblac);
//        
//        cac = new Choice();
//        cac.add("AC");
//        cac.add("Non-AC");
//        cac.setBounds(250,230,200,20);
//        add(cac);
//        
//        JLabel lblfood = new JLabel("Food Included");
//        lblfood .setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblfood .setBounds(40,270,150,25);
//        add(lblfood);
//        
//        cfood = new Choice();
//        cfood.add("Yes");
//        cfood.add("No");
//        cfood.setBounds(250,270,200,20);
//        add(cfood);
//        
//        JLabel lblid = new JLabel("Id");
//        lblid.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblid.setBounds(40,310,150,20);
//        add(lblid);
//        
//        labelid = new JLabel();
//        labelid.setFont(new Font("Tahoma", Font.PLAIN,16));
//        labelid.setBounds(250,310,200,25);
//        add(labelid);
//        
//        JLabel lblnumber = new JLabel("Number");
//        lblnumber.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblnumber.setBounds(40,350,150,25);
//        add(lblnumber);
//        
//        labelnumber = new JLabel();
//        labelnumber.setBounds(250,350,150,25);
//        add(labelnumber);
//        
//        JLabel lblphone = new JLabel("Phone");
//        lblphone.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lblphone.setBounds(40,390,150,20);
//        add(lblphone);
//        
//        labelphone = new JLabel();
//        labelphone.setBounds(250,390,200,25);
//        add(labelphone);
//        
//        JLabel lbltotel = new JLabel("Total Price");
//        lbltotel.setFont(new Font("Tahoma", Font.PLAIN,16));
//        lbltotel.setBounds(40,430,150,25);
//        add(lbltotel);
//        
//        labelprice = new JLabel();
//        labelprice.setBounds(250,430,150,25);
//        add(labelprice);
//        
//        
//        try {
//            Conn conn = new Conn();
//            String query = "select * from customer where username = '"+username+"'";
//            ResultSet rs = conn.s.executeQuery(query);
//            while(rs.next()) {
//                labelusername.setText(rs.getString("username"));
//                labelid.setText(rs.getString("id"));
//                labelnumber.setText(rs.getString("number"));
//                labelphone.setText(rs.getString("phone")); 
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        checkprice = new JButton("Check Price");
//        checkprice.setBackground(Color.BLACK);
//        checkprice.setForeground(Color.WHITE);
//        checkprice.setBounds(60,490,120,25);
//        checkprice.addActionListener(this);
//        add(checkprice);
//        
//        bookpackage = new JButton("Book Hotel");
//        bookpackage.setBackground(Color.BLACK);
//        bookpackage.setForeground(Color.WHITE);
//        bookpackage.setBounds(200,490,120,25);
//        bookpackage.addActionListener(this);
//        add(bookpackage);
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.setBounds(340,490,120,25);
//        back.addActionListener(this);
//        add(back);
//        
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l12 = new JLabel(i3);
//        l12.setBounds(500, 50, 600, 400);
//        add(l12);
//        
//        
//       
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource() == checkprice) {
//            try {
//   
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
//            while(rs.next()){
//               int cost = Integer.parseInt(rs.getString("costperperson"));
//               int food = Integer.parseInt(rs.getString("foodincluded"));
//               int ac = Integer.parseInt(rs.getString("acroom"));
//               
//               int persons = Integer.parseInt(tfpersons.getText());
//               int days = Integer.parseInt(tfdays.getText());
//               
//               String acselected = cac.getSelectedItem();
//               String foodselected = cfood.getSelectedItem();
//               
//               if(persons * days > 0) {
//                   int total = 0;
//                   total += acselected.equals("AC") ? ac : 0;
//                   total += foodselected.equals("Yes") ? food : 0;
//                   total += cost;
//                   total = total * persons * days;
//                   labelprice.setText("RS " + total);
//               } else {
//                   JOptionPane.showMessageDialog(null, "Please enter a valid number");
//               }
//            }
////            String pack = chotel.getSelectedItem();
////            int cost = 0;
////            if(pack.equals("Gold Package")) {
////                cost += 12000;
////            } else if (pack.equals("Silver Package")){
////                cost += 25000;
////            } else {
////                cost += 32000;
////            }
////            
////            int persons = Integer.parseInt(tfpersons.getText());
////            cost *= persons;
////            labelprice.setText("Rs " + cost);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if(ae.getSource() == bookpackage) {
//            try {
//                Conn c = new Conn();
//                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"', '"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
//                
//                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
//                setVisible(false);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            setVisible(false);
//        }
//    }
//    
//    public static void main(String[] args) {
//        new BookHotel("saini");
//    }
//}
//
//
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener {

    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdays;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton checkprice, bookpackage, back;

    // Constructor
    BookHotel(String username) {
        this.username = username;
        setBounds(150, 60, 1100, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblusername.setBounds(40, 70, 100, 20);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelusername.setBounds(250, 70, 200, 20);
        add(labelusername);

        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpackage.setBounds(40, 110, 150, 20);
        add(lblpackage);

        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);

        // Populate hotel choices
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM hotel");
            while (rs.next()) {
                chotel.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpersons.setBounds(40, 150, 150, 25);
        add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);

        JLabel lbldays = new JLabel("No. of Days");
        lbldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbldays.setBounds(40, 190, 150, 25);
        add(lbldays);

        tfdays = new JTextField("1");
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);

        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblac.setBounds(40, 230, 150, 25);
        add(lblac);

        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250, 230, 200, 20);
        add(cac);

        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblfood.setBounds(40, 270, 150, 25);
        add(lblfood);

        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 20);
        add(cfood);

        // ID and Contact Details Labels
        labelid = createLabel("Id", 310);
        labelnumber = createLabel("Number", 350);
        labelphone = createLabel("Phone", 390);

        JLabel lbltotel = new JLabel("Total Price");
        lbltotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltotel.setBounds(40, 430, 150, 25);
        add(lbltotel);

        labelprice = new JLabel();
        labelprice.setBounds(250, 430, 150, 25);
        add(labelprice);

        // Fetching user details
        loadUserDetails();

        // Action Buttons
        checkprice = createButton("Check Price", 60, 490);
        bookpackage = createButton("Book Hotel", 200, 490);
        back = createButton("Back", 340, 490);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(500, 50, 600, 400);
        add(l12);

        setVisible(true);
    }

    // Method to create labels for ID, number, and phone
    private JLabel createLabel(String text, int y) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbl.setBounds(40, y, 150, 20);
        add(lbl);

        JLabel label = new JLabel();
        label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label.setBounds(250, y, 200, 25);
        add(label);
        return label;
    }

    // Method to create buttons
    private JButton createButton(String text, int x, int y) {
        JButton btn = new JButton(text);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setBounds(x, y, 120, 25);
        btn.addActionListener(this);
        add(btn);
        return btn;
    }

    // Load user details from the database
    private void loadUserDetails() {
        try {
            Conn conn = new Conn();
            String query = "SELECT * FROM customer WHERE username = '" + username + "'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Action Event Handling
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkprice) {
            calculatePrice();
        } else if (ae.getSource() == bookpackage) {
            bookHotel();
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    // Calculate Price Method
    private void calculatePrice() {
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM hotel WHERE name='" + chotel.getSelectedItem() + "'");
            while (rs.next()) {
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());

                int total = cost * persons * days;
                if (cac.getSelectedItem().equals("AC")) total += ac * persons * days;
                if (cfood.getSelectedItem().equals("Yes")) total += food * persons * days;
                
                labelprice.setText("RS " + total);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error in calculating price!");
            e.printStackTrace();
        }
    }

    // Book Hotel Method
    private void bookHotel() {
        try {
            Conn c = new Conn();
            String query = "INSERT INTO bookhotel VALUES('" + labelusername.getText() + "', '" + chotel.getSelectedItem() +
                    "','" + tfpersons.getText() + "', '" + tfdays.getText() + "','" + cac.getSelectedItem() +
                    "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelnumber.getText() +
                    "','" + labelphone.getText() + "','" + labelprice.getText() + "')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Hotel Booked Successfully");
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Booking failed. Please try again.");
            e.printStackTrace();
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new BookHotel("saini");
    }
}
