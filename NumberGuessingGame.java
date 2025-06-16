
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.Random;

public class NumberGuessingGame extends JFrame implements ActionListener {
    private JLabel instructionLabel, resultLabel;
    private JTextField guessField;
    private JButton guessButton, resetButton, exitButton;

    private int randomNumber;

    public NumberGuessingGame() {
        setTitle("Number Guessing Game");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.DARK_GRAY);

        instructionLabel = new JLabel("Guess a number between 1 and 100:");
        instructionLabel.setBounds(50, 20, 300, 30);
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(instructionLabel);

        guessField = new JTextField();
        guessField.setBounds(50, 60, 120, 30);
        add(guessField);

        guessButton = new JButton("Guess");
        guessButton.setBounds(190, 60, 80, 30);
        guessButton.setBackground(Color.YELLOW);
        guessButton.addActionListener(this);
        add(guessButton);

        resultLabel = new JLabel(" ");
        resultLabel.setBounds(50, 100, 300, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(resultLabel);

        resetButton = new JButton("Reset");
        resetButton.setBounds(50, 150, 80, 30);
        resetButton.addActionListener(this);
        add(resetButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(150, 150, 80, 30);
        exitButton.setBackground(Color.red);
        exitButton.addActionListener(this);
        add(exitButton);

        generateRandomNumber();

        setVisible(true);
    }

    private void generateRandomNumber() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == guessButton) {
            try {
                int userGuess = Integer.parseInt(guessField.getText());
                if (userGuess < 1 || userGuess > 100) {
                    resultLabel.setText("Enter a number between 1 and 100.");
                } else if (userGuess < randomNumber) {
                    resultLabel.setText("Too low. Try again!");
                } else if (userGuess > randomNumber) {
                    resultLabel.setText("Too high. Try again!");
                } else {
                    resultLabel.setText("Correct! You guessed it!");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        }

        if (src == resetButton) {
            generateRandomNumber();
            guessField.setText("");
            resultLabel.setText(" ");
        }

        if (src == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new NumberGuessingGame();
    }
}
