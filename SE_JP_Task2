import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Currency_Converter extends JFrame implements ActionListener {

    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JTextField amountField;
    private JLabel resultLabel;

    private HashMap<String, Double> exchangeRates;

    public Currency_Converter() {
        setTitle("Currency Converter");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        String[] currencies = {"USD", "EUR", "INR", "GBP"};
        fromCurrency = new JComboBox<>(currencies);
        toCurrency = new JComboBox<>(currencies);
        amountField = new JTextField();
        resultLabel = new JLabel("Converted Amount: ");
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(this);

        add(new JLabel("From:"));
        add(fromCurrency);
        add(new JLabel("To:"));
        add(toCurrency);
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel(""));
        add(convertButton);
        add(new JLabel(""));
        add(resultLabel);

        // Dummy exchange rates (base: USD)
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.91);
        exchangeRates.put("INR", 83.12);
        exchangeRates.put("GBP", 0.78);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();
            double amount = Double.parseDouble(amountField.getText());

            double fromRate = exchangeRates.get(from);
            double toRate = exchangeRates.get(to);
            double converted = (amount / fromRate) * toRate;

            resultLabel.setText(String.format("Converted Amount: %.2f %s", converted, to));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Currency_Converter::new);
    }
}
