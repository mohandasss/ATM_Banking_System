package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    String pin;
    JLabel l2;
    JButton depo;

    BalanceEnquriy(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel atm = new JLabel(i3);
        atm.setBounds(0, 0, 1550, 830);
        add(atm);

        JLabel dep = new JLabel("YOUR CURRENT BALAMCE IS RS :");
        dep.setFont(new Font("sans-serif", Font.BOLD, 18));
        dep.setBounds(430, 180, 700, 35);
        dep.setForeground(Color.WHITE);
        atm.add(dep);

        l2 = new JLabel("ENTER YOUR AMOUNT");
        l2.setFont(new Font("sans-serif", Font.BOLD, 18));
        l2.setBounds(430, 220, 400, 35);
        l2.setForeground(Color.WHITE);
        atm.add(l2);

        depo = new JButton("BACK");
        depo.setBounds(700, 406, 150, 35);
        depo.setBackground(Color.green);
        depo.addActionListener(this);
        atm.add(depo);

        int balance = 0;
        try {
            config c = new config();
            ResultSet resultset = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");

            while (resultset.next()) {
                String transactionType = resultset.getString("Type");
                int transactionAmount = Integer.parseInt(resultset.getString("Ammount"));

                if (transactionType.equals("Deposit")) {
                    balance += transactionAmount;
                } else {
                    balance -= transactionAmount;
                }
            }

            // Now you have calculated the balance based on transactions
            // You can use the 'balance' variable as needed

        } catch (Exception m) {
            m.printStackTrace();
        }
        l2.setText(""+balance+"");


        setLayout(null);
        setSize(1550, 1880);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0, 0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}


