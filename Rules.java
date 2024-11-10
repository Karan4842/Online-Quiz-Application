package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>" + 
                "1. Make sure to complete all questions before the time expires." + "<br><br>" +
                "2. One Submission Only: You may submit each quiz only once." + "<br><br>" +
                "3. No Retakes: Once the quiz is submitted, retakes are not permitted unless allowed by the instructor." + "<br><br>" +
                "4. Allowed Resources: Only the resources specified by the instructor (if any) are allowed." + "<br><br>" +
                "5. Ensure that you are in a quiet, distraction-free environment to focus on the quiz without interruptions." + "<br><br>" +
                "6. No cheating is allowed." + "<br><br>" +
                "7. Avoid refreshing the page or navigating to other tabs during the quiz. Good Luck!" + "<br><br>" +
            "</html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 600);
        setLocation(350, 100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
new Quiz(name);

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }

    private static class Quiz {

        public Quiz(String name) {
        }
    }
}
