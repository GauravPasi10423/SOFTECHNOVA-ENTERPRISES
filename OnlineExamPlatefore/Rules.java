package OnlineExamPlatefore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules implements ActionListener {
    String name;
    JFrame jFrame;
    JButton back, start;
    Rules(String name){
        this.name = name;
        jFrame = new JFrame();
        jFrame.setSize(800,700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocation(300,100);

        JLabel heading = new JLabel("Welcome "+name+" for onliine Examination");
        heading.setBounds(50,50,500,30);
        heading.setFont(new Font("Helvetica",Font.BOLD,25));
        heading.setForeground(new Color(255,160,122));
        jFrame.add(heading);

        JLabel rules = getjLabel();
        jFrame.add(rules);

        back = new JButton("Back");
        back.setBounds(300,550,90,30);
        back.setBackground(new Color(255,160,122));
        back.addActionListener(this);
        jFrame.add(back);

        start = new JButton("Start");
        start.setBounds(400,550,90,30);
        start.setBackground(new Color(255,160,122));
        start.addActionListener(this);
        jFrame.add(start);
    }

    private static JLabel getjLabel() {
        JLabel rules = new JLabel();
        rules.setBounds(30,75,700,600);
        rules.setFont(new Font("Thoma",Font.PLAIN,16));
//        rules.setForeground(new Color(255,160,122));
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        return rules;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            jFrame.setVisible(false);
            new OnlineExamPlateform();
        } else if (e.getSource() == start) {
            jFrame.setVisible(false);
            new Quiz();
        }
    }

    public static void main(String[] args) {
        new Rules("user");
    }


}
