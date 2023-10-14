package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    String pin;
    JButton withdrawButton, backButton;
    JTextField amountField;

    Withdraw(String pin) {
        this.pin = pin;

        ImageIcon atmIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image scaledImage = atmIcon.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel atmLabel = new JLabel(scaledIcon);
        atmLabel.setBounds(0, 0, 1550, 830);
        add(atmLabel);

        JLabel maxWithdrawLabel = new JLabel("MAXIMUM WITHDRAWAL IS RS. 10,000");
        maxWithdrawLabel.setFont(new Font("sans-serif", Font.BOLD, 18));
        maxWithdrawLabel.setBounds(460, 180, 700, 35);
        maxWithdrawLabel.setForeground(Color.WHITE);
        atmLabel.add(maxWithdrawLabel);

        JLabel amountLabel = new JLabel("ENTER AMOUNT");
        amountLabel.setFont(new Font("sans-serif", Font.BOLD, 18));
        amountLabel.setBounds(460, 220, 400, 35);
        amountLabel.setForeground(Color.WHITE);
        atmLabel.add(amountLabel);

        amountField = new JTextField();
        amountField.setFont(new Font("sans-serif", Font.BOLD, 22));
        amountField.setBounds(460, 260, 320, 25);
        amountField.setBackground(Color.WHITE);
        atmLabel.add(amountField);

        withdrawButton = new JButton("WITHDRAW");
        withdrawButton.setBounds(700, 360, 150, 35);
        withdrawButton.setBackground(Color.GREEN);
        withdrawButton.addActionListener(this);
        atmLabel.add(withdrawButton);

        backButton = new JButton("BACK");
        backButton.setBounds(700, 406, 150, 35);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.RED);
        backButton.addActionListener(this);
        atmLabel.add(backButton);

        setLayout(null);
        setSize(1550, 830);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == withdrawButton) {
            try {
                String amount = amountField.getText();
                Date date = new Date();
                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    config c = new config();
                    ResultSet resultSet = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("Type").equals("Deposit")) {
                             balance += Integer.parseInt(resultSet.getString("Ammount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("Ammount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("INSERT INTO bank VALUES('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == backButton) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }
}
