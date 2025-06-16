package OnlineExamPlatefore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static java.awt.Image.SCALE_SMOOTH;

public class OnlineExamPlateform implements ActionListener {
    JFrame jFrame;
    JLabel image, name;
    JTextField tfname;
    JButton jbNext, jbExit;


    public OnlineExamPlateform(){
        prepareGUI();
        addComponents();
    }

    public void prepareGUI(){
        jFrame = new JFrame();
        jFrame.setSize(1200,600);
        jFrame.setLocation(200,150);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon rawIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/EducationLaptop01.jpg")));
        Image scaledImage = rawIcon.getImage().getScaledInstance(1200, 600, SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 1200, 600);
        jFrame.add(image);

    }

    public void addComponents(){
        name = new JLabel("Enter Your Name");
        name.setBounds(70,250,200,30);
        name.setFont(new Font("Helvetica", Font.BOLD,20));
        name.setForeground(Color.gray);
        image.add(name);

        tfname= new JTextField();
        tfname.setBounds(70,290,200,30);
        tfname.setFont(new Font("Helvetica", Font.BOLD,16));
        image.add(tfname);

        jbNext = new JButton("Next");
        jbNext.setBounds(90,350,60,30);
        jbNext.setBackground(new Color(255,160,122));
        jbNext.addActionListener(this);
        image.add(jbNext);

        jbExit= new JButton("Exit");
        jbExit.setBounds(180,350,60,30);
        jbExit.setBackground(new Color(255,160,122));
        jbExit.addActionListener(this);
        image.add(jbExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbNext){
            String name = tfname.getText();
            jFrame.setVisible(false);
            new Rules(name);
        } else if (e.getSource() == jbExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        OnlineExamPlateform Object = new OnlineExamPlateform();
    }

    
}
