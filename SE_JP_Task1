import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result;
    int calculation;

    JFrame jFrame = new JFrame("Calculator");
    JLabel jLabel = new JLabel();
    JTextField jTextField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("ON");
    JRadioButton offRadioButton = new JRadioButton("OFF");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");

    public Calculator() {
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui() {
        jFrame.setSize(310, 510);
        jFrame.getContentPane().setLayout(null);
        jFrame.getContentPane().setBackground(Color.black);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        jLabel.setBounds(250, 0, 50, 50);
        jLabel.setForeground(Color.white);
        jFrame.add(jLabel);

        jTextField.setBounds(10, 40, 270, 40);
        jTextField.setFont(new Font("Arial", Font.BOLD, 20));
        jTextField.setEditable(false);
        jTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        jFrame.add(jTextField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        jFrame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        jFrame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        JButton[] buttons = {
                buttonSeven, buttonEight, buttonNine,
                buttonFour, buttonFive, buttonSix,
                buttonOne, buttonTwo, buttonThree,
                buttonZero
        };
        int x = 10, y = 230;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(x, y, 60, 40);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            jFrame.add(buttons[i]);
            x += 70;
            if ((i + 1) % 3 == 0) {
                x = 10;
                y += 60;
            }
        }
        buttonZero.setBounds(10, 410, 130, 40);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        jFrame.add(buttonDot);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        jFrame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        jFrame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        jFrame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        jFrame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        jFrame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        jFrame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        jFrame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        jFrame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        jFrame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        jFrame.add(buttonClear);
    }

    public void addActionEvent() {
        Component[] components = jFrame.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JButton || component instanceof JRadioButton) {
                ((AbstractButton) component).addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        DecimalFormat format = new DecimalFormat("0.######");

        if (source == onRadioButton) {
            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            jLabel.setText("");
            jTextField.setText("");
        } else if (source == buttonDelete) {
            String text = jTextField.getText();
            if (!text.isEmpty()) {
                jTextField.setText(text.substring(0, text.length() - 1));
            }
        } else if (source == buttonDot) {
            if (!jTextField.getText().contains(".")) {
                jTextField.setText(jTextField.getText() + ".");
            }
        } else if (source == buttonSquare) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText(format.format(Math.pow(num1, 2)));
        } else if (source == buttonSqrt) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText(format.format(Math.sqrt(num1)));
        } else if (source == buttonReciprocal) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText(format.format(1 / num1));
        } else if (source == buttonPlus) {
            num1 = Double.parseDouble(jTextField.getText());
            calculation = 1;
            jTextField.setText("");
            jLabel.setText(num1 + " + ");
        } else if (source == buttonMinus) {
            num1 = Double.parseDouble(jTextField.getText());
            calculation = 2;
            jTextField.setText("");
            jLabel.setText(num1 + " - ");
        } else if (source == buttonMul) {
            num1 = Double.parseDouble(jTextField.getText());
            calculation = 3;
            jTextField.setText("");
            jLabel.setText(num1 + " x ");
        } else if (source == buttonDiv) {
            num1 = Double.parseDouble(jTextField.getText());
            calculation = 4;
            jTextField.setText("");
            jLabel.setText(num1 + " / ");
        } else if (source == buttonEqual) {
            num2 = Double.parseDouble(jTextField.getText());
            switch (calculation) {
                case 1: result = num1 + num2; break;
                case 2: result = num1 - num2; break;
                case 3: result = num1 * num2; break;
                case 4:
                    if (num2 == 0) {
                        jTextField.setText("Error");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            jTextField.setText(format.format(result));
            jLabel.setText("");
            num1 = result;
        } else {
            JButton clickedButton = (JButton) source;
            jTextField.setText(jTextField.getText() + clickedButton.getText());
        }
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        jTextField.setEnabled(true);
        jLabel.setEnabled(true);
        for (Component comp : jFrame.getContentPane().getComponents()) {
            if (comp instanceof JButton) {
                comp.setEnabled(true);
            }
        }
    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        jTextField.setEnabled(false);
        jLabel.setEnabled(false);
        jLabel.setText("");
        jTextField.setText("");
        for (Component comp : jFrame.getContentPane().getComponents()) {
            if (comp instanceof JButton) {
                comp.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
