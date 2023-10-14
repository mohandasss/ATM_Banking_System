package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    main_class(String pin)
    {
            this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel atm = new JLabel(i3);
        atm.setBounds(0,0,1550,830);
        add(atm);

        JLabel label = new JLabel("SELECT YOUR TRANSACTION");
        label.setBounds(423,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,28));
        atm.add(label);

        b1= new JButton("DEPOSIT");
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.GREEN);
        b1.addActionListener(this);
        b1.setBounds(410,270,150,35);
        atm.add(b1);

        b2= new JButton("CASH WITHDRAW");
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);
        b2.addActionListener(this);
        b2.setBounds(700,270,150,35);
        atm.add(b2);

        b3= new JButton("FAST CASH");
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.GREEN);
        b3.addActionListener(this);
        b3.setBounds(410,318,150,35);
        atm.add(b3);

        b4= new JButton("MINI STATEMENT");
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.YELLOW);
        b4.addActionListener(this);
        b4.setBounds(700,318,150,35);
        atm.add(b4);

        b5= new JButton("PIN CHANGE");
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.GREEN);
        b5.addActionListener(this);
        b5.setBounds(410,364,150,35);
        atm.add(b5);

        b6= new JButton("BALANCE");
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.YELLOW);
        b6.addActionListener(this);
        b6.setBounds(700,364,150,35);
        atm.add(b6);

        b7= new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.RED);
        b7.addActionListener(this);
        b7.setBounds(555,420,150,35);
        atm.add(b7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1)
        {
          new Deposit(pin);
          setVisible(false);
            }
        else if (e.getSource()==b7)
        {
            System.exit(0);
        }
        else if (e.getSource()==b2) {
            new Withdraw(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }




    public static void main(String[] args) {
        new main_class("");
    }

}
