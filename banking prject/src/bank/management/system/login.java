package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    login()
    {

        super("Bank Management System");

        ImageIcon   image = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image image2=image.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image1 = new JLabel(image3);
        image1.setBounds(350,10,100,100);
        add(image1);

        ImageIcon   iimage = new ImageIcon(ClassLoader.getSystemResource("icons/cards.png"));
        Image iimage2=iimage.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon iimage3 = new ImageIcon(iimage2);
        JLabel iimage1 = new JLabel(iimage3);
        iimage1.setBounds(360,350,100,100);
        add(iimage1);


        label = new JLabel("WELCOME TO ATM");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("AvantGarde",Font.BOLD,40));
        label.setBounds(230,125,450,40);
        add(label);

        label2 = new JLabel("Card number : ");
        label2.setFont(new Font("POPPINS",Font.BOLD,15) );
        label2.setBounds(230,180,450,40);
        add(label2);

        label3 = new JLabel("Pin : ");
        label3.setFont(new Font("POPPINS",Font.BOLD,15) );
        label3.setBounds(232,220,450,40);
        add(label3);

        textField = new JTextField(15);
        textField.setFont(new Font("REM",Font.BOLD,15) );
        textField.setBounds(350,180,450,40);
        add(textField);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(350,220,450,40);
        add(passwordField);

        button1 = new JButton("SIGN IN");
        button1.setForeground(Color.BLUE);
        button1.setFont(new Font("Falling Sky",Font.BOLD,15));
        button1.setBounds(400,270,100,40);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("SIGN UP");
        button2.setForeground(Color.BLUE);
        button2.setFont(new Font("Falling Sky",Font.BOLD,15));
        button2.setBounds(520,270,100,40);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CLEAR");
        button3.setForeground(Color.BLUE);
        button3.setFont(new Font("Falling Sky",Font.BOLD,15));
        button3.setBounds(400,320,221,40);
        button3.addActionListener(this);
        add(button3);


        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image bg2=bg.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bg1 = new JLabel(bg3);
        bg1.setBounds(0,0,850,480);
        add(bg1);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1)
            {
                config card = new config();
                String cardnumm = textField.getText();
                String pin=String.valueOf(passwordField.getPassword());
                String q = "select * from login where card_no='"+cardnumm+"' and pin ='"+pin+"' ";
                ResultSet set =card.statement.executeQuery(q);
                if(set.next())
                {
                    setVisible(false);
                    new bank.management.system.main_class(pin);
                }
                else {
                    JOptionPane.showMessageDialog(null,"incorrect Card or Pin number" );
                }
            }
            else if (e.getSource()==button2)
            {
                new signup();
                setVisible(false);
            }
            else if (e.getSource()==button3)
            {
                textField.setText("");
                passwordField.setText("");
            }
        }
        catch(Exception A)
        {
            A.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new login();

    }
}

