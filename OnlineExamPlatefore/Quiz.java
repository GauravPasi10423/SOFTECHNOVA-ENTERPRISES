package OnlineExamPlatefore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Quiz extends JFrame implements ActionListener {
    JLabel image, qno, qus;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton submit, next;
    ButtonGroup group;

    String[][] questions = new String[10][5];
    String[][] answers = new String[10][2];
    String[][] userans = new String[10][1];

    public static int timer = 15;
    public static int ans_give = 0;
    public static int count = 0;
    public static int score = 0;

    Quiz() {
        setBounds(50, 50, 1300, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Load and scale image
        ImageIcon rawIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/exxam.jpg")));
        Image scaledImage = rawIcon.getImage().getScaledInstance(1300, 400, Image.SCALE_SMOOTH);
        image = new JLabel(new ImageIcon(scaledImage));
        image.setBounds(0, 0, 1300, 400);
        add(image);

        addComponents();
    }

    public void addComponents() {
        qno = new JLabel("1.");
        qno.setBounds(50, 420, 30, 30);
        qno.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(qno);

        qus = new JLabel("This is question");
        qus.setBounds(80, 420, 1000, 30);
        qus.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(qus);

        // Sample questions
        questions[0][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "JVM"; questions[0][2] = "JDB"; questions[0][3] = "JDK"; questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int"; questions[1][2] = "Object"; questions[1][3] = "long"; questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package"; questions[2][2] = "java.lang package"; questions[2][3] = "java.awt package"; questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface"; questions[3][2] = "Abstract Interface"; questions[3][3] = "Marker Interface"; questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack"; questions[4][2] = "String memory"; questions[4][3] = "Random storage space"; questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface"; questions[5][2] = "Remote interface"; questions[5][3] = "Readable interface"; questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import"; questions[6][2] = "package"; questions[6][3] = "extends"; questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner"; questions[7][2] = "Java Archive"; questions[7][3] = "Java Application Resource"; questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder"; questions[8][2] = "java.lang.Short"; questions[8][3] = "java.lang.Byte"; questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM"; questions[9][2] = "The applet makes the Java code secure and portable"; questions[9][3] = "Use of exception handling"; questions[9][4] = "Dynamic binding between objects";

        // Correct answers
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        // Options
        opt1 = new JRadioButton(); opt1.setBounds(100, 470, 800, 40); opt1.setFont(new Font("Dialog", Font.PLAIN, 20)); add(opt1);
        opt2 = new JRadioButton(); opt2.setBounds(100, 520, 800, 40); opt2.setFont(new Font("Dialog", Font.PLAIN, 20)); add(opt2);
        opt3 = new JRadioButton(); opt3.setBounds(100, 570, 800, 40); opt3.setFont(new Font("Dialog", Font.PLAIN, 20)); add(opt3);
        opt4 = new JRadioButton(); opt4.setBounds(100, 620, 800, 40); opt4.setFont(new Font("Dialog", Font.PLAIN, 20)); add(opt4);

        group = new ButtonGroup();
        group.add(opt1); group.add(opt2); group.add(opt3); group.add(opt4);

        next = new JButton("Next");
        next.setBounds(530, 680, 120, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(750, 680, 120, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        Start(count);
    }

    private void Start(int count) {
        if (count >= 10) return; // Prevent index error

        qno.setText((count + 1) + ".");
        qus.setText(questions[count][0]);
        opt1.setText(questions[count][1]); opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]); opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]); opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]); opt4.setActionCommand(questions[count][4]);

        group.clearSelection();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left: " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 16));
        g.drawString((timer > 0 ? time : "Times Up!!"), 1000, 500);

        if (timer <= 0) {
            timer = 15;

            if (group.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = group.getSelection().getActionCommand();
            }

            count++;

            if (count == 10) {
                next.setEnabled(false);
                submit.setEnabled(true);
            } else {
                Start(count);
            }
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            if (group.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = group.getSelection().getActionCommand();
            }

            count++;
            if (count == 10) {
                next.setEnabled(false);
                submit.setEnabled(true);
            } else {
                timer = 15;
                Start(count);
            }
        } else if (e.getSource() == submit) {
            if (group.getSelection() != null && count < 10) {
                userans[count][0] = group.getSelection().getActionCommand();
            }

            score = 0;
            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0] != null && userans[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }

            JOptionPane.showMessageDialog(this, "Your score is: " + score + " out of 100");
            this.dispose(); // close window after score
        }
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
