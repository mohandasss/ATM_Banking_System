package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.stream.Stream;

class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField paisa;
    JButton depo,back;

               Deposit(String pin)
        {
                this.pin=pin;
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
                Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel atm = new JLabel(i3);
                atm.setBounds(0,0,1550,830);
                add(atm);

                JLabel dep = new JLabel("ENTER AMMOUNT TO DEPOSIT");
                dep.setFont(new Font("sans-serif",Font.BOLD,15));
                dep.setBounds(460,180,400,35);
                dep.setForeground(Color.WHITE);
                atm.add(dep);

                paisa = new JTextField();
                paisa.setFont(new Font("sans-serif",Font.BOLD,22));
                paisa.setBounds(460,230,320,25);
                paisa.setBackground(Color.WHITE);
                atm.add(paisa);

                depo = new JButton("DEPOSIT");
                depo.setBounds(700,360,150,35);
                depo.setBackground(Color.green);
                depo.addActionListener(this);
                atm.add(depo);


                back = new JButton("BACK");
                back .setBounds(700,406,150,35);
                back.setForeground(Color.white);
                back .setBackground(Color.RED);
                 back .addActionListener(this);
                atm.add(back );


                setLayout(null);
                setSize(1550,1880);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLocation(0,0);
                setVisible(true);
        }


    @Override
    public void actionPerformed(ActionEvent e) {
            try {
                String amount =(String) paisa.getText();
                Date date = new Date();
                if (e.getSource()==depo)
                {
                    if (paisa.getText()=="")
                    {
                        JOptionPane.showMessageDialog(null,"please enter the ammont");
                    }
                    else{
                        config c = new config();
                        String k = "insert into bank values('" + pin + "','"+ date+"', 'Deposit','" + amount + "')";
                        c.statement.executeUpdate(k);
                        JOptionPane.showMessageDialog(null, "Rs. " + amount +" Deposit Successful");
                        setVisible(false);
                        new main_class(pin);

                    }


                }
                else if (e.getSource()==back)
                {
                    setVisible(false);
                }







            }
            catch (Exception m)
            {
                m.printStackTrace();
            }








    }

    public static void main(String[] args) {
        new Deposit("");
    }
}