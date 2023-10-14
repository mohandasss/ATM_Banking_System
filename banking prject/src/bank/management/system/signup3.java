



package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton type,type1,type2,type3;
    JButton submit,cancel;
    JTextField card;
    JCheckBox s,s1,s2,s3,s4,s5;
    String formno;
    signup3(String formno)
    {
        this.formno=formno;
        ImageIcon  image = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image image2=image.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image1 = new JLabel(image3);
        image1.setBounds(60,0,300,300);
        add(image1);

        JLabel p3= new JLabel("PAGE 3");
        p3.setFont(new Font("Large x-height",Font.BOLD,22));
        p3.setBounds(280,40,400,40);
        add(p3);

        JLabel adetails = new JLabel("ACCOUNT DETAILS");
        adetails.setFont(new Font("Large x-height",Font.BOLD,22));
        adetails.setBounds(280,100,400,40);
        add(adetails);

        JLabel atype = new JLabel("ACCOUNT TYPE :");
        atype.setFont(new Font("Large x-height",Font.BOLD,22));
        atype.setBounds(100,240,200,30);
        add(atype);

        type = new JRadioButton("SAVINGS");
        type.setBackground(new Color(142, 117, 228));
        type.setFont(new Font("Large x-height",Font.BOLD,15));
        type.setBounds(300,240,100,30);
        add(type);

        type1 = new JRadioButton("FIXED DIPOSITE");
        type1.setBackground(new Color(142, 117, 228));
        type1.setFont(new Font("Large x-height",Font.BOLD,15));
        type1.setBounds(450,240,200,30);
        add(type1);

        type2 = new JRadioButton("CUREENT ACCOUNT");
        type2.setBackground(new Color(142, 117, 228));
        type2.setFont(new Font("Large x-height",Font.BOLD,15));
        type2.setBounds(630,240,200,30);
        add(type2);

        type3 = new JRadioButton("RECURRING DEPOSITE ACCOUNT");
        type3.setBackground(new Color(142, 117, 228));
        type3.setFont(new Font("Large x-height",Font.BOLD,15));
        type3.setBounds(850,240,300,30);
        add(type3);

        ButtonGroup group = new ButtonGroup();
        group.add(type);
        group.add(type1);
        group.add(type2);
        group.add(type3);

        JLabel cardno  = new JLabel("CARD NUMBER :");
        cardno.setFont(new Font("Large x-height",Font.BOLD,22));
        cardno.setBounds(100,320,200,30);
        add(cardno);

        JLabel hidden  = new JLabel("XXXX-XXXX-XXXX-0007");
        hidden.setFont(new Font("Large x-height",Font.BOLD,22));
        hidden.setBounds(300,320,400,30);
        add(hidden);

        JLabel car  = new JLabel("(your 16-digit card number)");
        car.setFont(new Font("Large x-height",Font.BOLD,11));
        car.setBounds(100,340,200,30);
        add(car);

            /*card = new JTextField();
            card.setBackground(new Color(142, 117, 228));
            card.setFont(new Font("Large x-height",Font.BOLD,15));
            card.setBounds(300,300,600,30);
            add(card);*/



        JLabel hiddenn  = new JLabel("(it would on ATM card / cheque book and statements)");
        hiddenn.setFont(new Font("Large x-height",Font.BOLD,11));
        hiddenn.setBounds(300,340,400,30);
        add(hiddenn);

        JLabel pin  = new JLabel("PIN :");
        pin.setFont(new Font("Large x-height",Font.BOLD,22));
        pin.setBounds(100,400,200,30);
        add(pin);

        JLabel blankpin  = new JLabel("XXXX");
        blankpin.setFont(new Font("Large x-height",Font.BOLD,22));
        blankpin.setBounds(300,400,200,30);
        add(blankpin);

        JLabel pass  = new JLabel("(4-password)");
        pass.setFont(new Font("Large x-height",Font.BOLD,11));
        pass.setBounds(100,420,200,30);
        add(pass);

        JLabel service  = new JLabel("SERVICE REQUIRED :");
        service.setFont(new Font("Large x-height",Font.BOLD,22));
        service.setBounds(100,480,400,30);
        add(service);

        s = new JCheckBox("ATM CARD");
        s.setBackground(new Color(142, 117, 228));
        s.setFont(new Font("Large x-height",Font.BOLD,15));
        s.setBounds(100,520,200,30);
        add(s);

        s1 = new JCheckBox("INTERNET BANKING");
        s1.setBackground(new Color(142, 117, 228));
        s1.setFont(new Font("Large x-height",Font.BOLD,15));
        s1.setBounds(300,520,200,30);
        add(s1);
        s2 = new JCheckBox("MOBILE BANKING");
        s2.setBackground(new Color(142, 117, 228));
        s2.setFont(new Font("Large x-height",Font.BOLD,15));
        s2.setBounds(520,520,400,30);
        add(s2);
        s3 = new JCheckBox("E-MAIL ALERTS");
        s3.setBackground(new Color(142, 117, 228));
        s3.setFont(new Font("Large x-height",Font.BOLD,15));
        s3.setBounds(100,580,200,30);
        add(s3);
        s4 = new JCheckBox("CHEQUE BOOK");
        s4.setBackground(new Color(142, 117, 228));
        s4.setFont(new Font("Large x-height",Font.BOLD,15));
        s4.setBounds(300,580,200,30);
        add(s4);

        s5 = new JCheckBox("E-STATEMENT");
        s5.setBackground(new Color(142, 117, 228));
        s5.setFont(new Font("Large x-height",Font.BOLD,15));
        s5.setBounds(520,580,400,30);
        add(s5);

        JCheckBox agreement= new JCheckBox("I here by decleares that the above enterted details correct to the best of my knowledge.");
        agreement.setBackground(new Color(142, 117, 228));
        agreement.setFont(new Font("Large x-height",Font.BOLD,13));
        agreement.setBounds(100,700,700,30);
        add(agreement);

        JLabel form = new JLabel("Form No :-");
        form.setBounds(700,10,150,30);
        form.setFont(new Font("Large x-height",Font.BOLD,12));
        add(form);

        JLabel formm = new JLabel(formno);
        formm.setBounds(760,10,150,30);
        formm.setFont(new Font("Large x-height",Font.BOLD,15));
        add(formm);

        submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Josefin Sans",Font.BOLD,18));
        submit.setBounds(600,750,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("Josefin Sans",Font.BOLD,18));
        cancel.setBounds(200,750,100,30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(142, 117, 228));
        setVisible(true);

        }

@Override
public void actionPerformed(ActionEvent e) {

            String aatype="";
            if(type.isSelected())
            {
                aatype="SAVINGS";
            }
            else if (type1.isSelected())
            {
                aatype="FIXED DIPOSITE";
            }
            else if (type2.isSelected())
            {
                aatype="CUREENT ACCOUNT";
            }
            else if (type3.isSelected())
            {
                aatype="RECURRING DEPOSITE ACCOUNT";
            }
                Random ran = new Random();
                long first7= (ran.nextLong()%90000000L)+1409963000000000L;
                String cardd =""+Math.abs(first7);
                long first3=(ran.nextLong()%9000L+1000L);
                String pin = ""+ Math.abs(first3);

                String serv ="";
                if (s.isSelected())
                {
                    serv+="ATM CARD";
                }
                else if(s1.isSelected())
                {
                    serv+="INTERNET BANKING";
                }
                else if (s2.isSelected())
                {
                    serv+="MOBILE BANKING";
                }
                else if (s3.isSelected())
                {
                    serv+="E-MAIL ALERTS";
                }
                else if (s4.isSelected())
                {
                    serv+="CHEQUE BOOK";
                }
                else if (s5.isSelected())
                {
                    serv+="E-STATEMENT";
                }



                try{


                    if (e.getSource()==submit) {
                        if (aatype.equals("")) {
                            JOptionPane.showMessageDialog(null, "fill all the fields");

                        } else {
                            config s3 = new config();
                            String q1 = "insert into signupthree values('" + formno + "','" + aatype + "','" + cardd + "','" + pin + "','" + serv + "')";
                            String q2 = "insert into login values('" + formno + "','" + cardd + "','" + pin + "')";
                            s3.statement.executeUpdate(q1);
                            s3.statement.executeUpdate(q2);
                            JOptionPane.showMessageDialog(null, "Card number :" + cardd + "\n pin :" + pin);
                            new Deposit(pin);
                            setVisible(false);

                        }
                    }
                    else if (e.getSource()==cancel)
                    {
                        System.exit(0);
                    }


                }

                catch (Exception p)
                {
                    p.printStackTrace();
                }






        }

public static void main(String[] args) {
        new signup3("");
        }

    public static class withdraw {
    }
}