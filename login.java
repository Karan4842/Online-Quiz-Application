package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Image for login background
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);  // Adjusted to fit within frame
        add(image);
        
        // Heading label
        JLabel heading = new JLabel("Sharp Minds");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        // Name label
        JLabel name = new JLabel("Enter your name");
        name.setBounds(700, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        // Text field for entering name
        tfname = new JTextField();
        tfname.setBounds(700, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        // Rules button
        rules = new JButton("Rules");
        rules.setBounds(700, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        // Back button
        back = new JButton("Back");
        back.setBounds(880, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1100, 500);  // Adjusted frame size
        setLocation(200, 150);
        setVisible(true);
    }
    
    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your name to proceed.");
            } else {
                setVisible(false);
                new Rules(name);
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
