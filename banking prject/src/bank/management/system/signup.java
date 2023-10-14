package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton gen , gen1,msts,msts1,msts2,msts3;
    JTextField textField;
    JTextField textField1,address,live,pincode,statee;
    //JLabel label;
    Random random = new Random();
    long first4=(random.nextLong()%9000L)+1000L;
    String first = " " + Math.abs(first4);
    JDateChooser date;
    JTextField mailbox;
    signup()
    {
        super("APPLICATION FORM");

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image image2=image.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image1 = new JLabel(image3);
        image1.setBounds(25,10,100,100);
        add(image1);

        JLabel label = new JLabel("APPLICATION FORM NO. " + first);
        label.setBounds(160,20,600,40);
        label.setFont(new Font("Josefin Sans",Font.BOLD,38));
        add(label);

        JLabel label2 = new JLabel("PAGE 1. ");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Josefin Sans",Font.BOLD,20));
        add(label2);

        JLabel label3 = new JLabel("personal details ");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Josefin Sans",Font.BOLD,20));
        add(label3);

        JLabel labelname = new JLabel("NAME :");
        labelname.setFont(new Font("Josefin Sans",Font.BOLD,15));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textField = new JTextField();
        textField.setFont(new Font("Josefin Sans",Font.BOLD,15));
        textField.setBounds(300,190,450,30);
        add(textField);


        JLabel fathersname = new JLabel("FATHER'S NAME :");
        fathersname.setFont(new Font("Josefin Sans",Font.BOLD,15));
        fathersname.setBounds(100,230,200,30);
        add(fathersname);

        textField1 = new JTextField();
        textField1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        textField1.setBounds(300,230,450,30);
        add(textField1);

        JLabel dob = new JLabel("DATE OF BIRTH : ");
        dob.setFont(new Font("Josefin Sans",Font.BOLD,15));
        dob.setBounds(100,270,200,30);
        add(dob);

        date= new JDateChooser();
        date.setForeground(new Color(15, 43, 101));
        date.setBounds(300,270,450,30);
        date.setFont(new Font("Josefin Sans",Font.BOLD,15));
        add(date);

        JLabel gender = new JLabel("SEX :");
        gender.setFont(new Font("Josefin Sans",Font.BOLD,15));
        gender.setBounds(100,310,200,30);
        add(gender);

        gen = new JRadioButton("Male");
        gen.setBackground(new Color(70, 165, 189));
        gen.setFont(new Font("Josefin Sans",Font.BOLD,15));
        gen.setBounds(300,310,100,30);
        add(gen);

        gen1 = new JRadioButton("Female");
        gen1.setBackground(new Color(70, 165, 189));
        gen1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        gen1.setBounds(450,310,100,30);
        add(gen1);

        ButtonGroup group= new ButtonGroup();
        group.add(gen);
        group.add(gen1);

        JLabel mail =new JLabel("E-MAIL ID :");
        mail.setFont(new Font("Josefin Sans",Font.BOLD,15));
        mail.setBounds(100,350,100,30);
        add(mail);

        mailbox = new JTextField();
        mailbox.setFont(new Font("Josefin Sans",Font.BOLD,15));
        mailbox.setBounds(300,350,450,30);
        add(mailbox);

        JLabel maritalstatus =new JLabel("MARITAL STATUS :");
        maritalstatus.setFont(new Font("Josefin Sans",Font.BOLD,15));
        maritalstatus.setBounds(100,390,150,30);
        add(maritalstatus);

        msts = new JRadioButton("Single");
        msts.setBackground(new Color(70, 165, 189));
        msts.setFont(new Font("Josefin Sans",Font.BOLD,15));
        msts.setBounds(300,390,100,30);
        add(msts);

        msts1 = new JRadioButton("Married");
        msts1.setBackground(new Color(70, 165, 189));
        msts1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        msts1.setBounds(400,390,100,30);
        add(msts1);

        msts2 = new JRadioButton("Divorced");
        msts2.setBackground(new Color(70, 165, 189));
        msts2.setFont(new Font("Josefin Sans",Font.BOLD,15));
        msts2.setBounds(500,390,100,30);
        add(msts2);

        msts3 = new JRadioButton("Cohabiting");
        msts3.setBackground(new Color(70, 165, 189));
        msts3.setFont(new Font("Josefin Sans",Font.BOLD,15));
        msts3.setBounds(600,390,150,30);
        add(msts3);

        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(msts);
        statusgroup.add(msts1);
        statusgroup.add(msts2);
        statusgroup.add(msts3);

        JLabel place =new JLabel("ADDRESS :");
        place.setFont(new Font("Josefin Sans",Font.BOLD,15));
        place.setBounds(100,430,150,30);
        add(place);

        address = new JTextField();
        address.setFont(new Font("Josefin Sans",Font.BOLD,15));
        address.setBounds(300,430,450,30);
        add(address);

        JLabel city =new JLabel("CITY :");
        city.setFont(new Font("Josefin Sans",Font.BOLD,15));
        city.setBounds(100,470,150,30);
        add(city);

        live = new JTextField();
        live.setFont(new Font("Josefin Sans",Font.BOLD,15));
        live.setBounds(300,470,450,30);
        add(live);

        JLabel pin =new JLabel("PINCODE :");
        pin.setFont(new Font("Josefin Sans",Font.BOLD,15));
        pin.setBounds(100,510,150,30);
        add(pin);

        pincode = new JTextField();
        pincode.setFont(new Font("Josefin Sans",Font.BOLD,15));
        pincode.setBounds(300,510,150,30);
        add(pincode);

        JLabel state =new JLabel("STATE :");
        state.setFont(new Font("Josefin Sans",Font.BOLD,15));
        state.setBounds(100,550,150,30);
        add(state);

        statee = new JTextField();
        statee.setFont(new Font("Josefin Sans",Font.BOLD,15));
        statee.setBounds(300,550,450,30);
        add(statee);

        next = new JButton("NEXT");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Josefin Sans",Font.BOLD,15));
        next.setBounds(650,600,100,50);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(70, 165, 189));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno =first;
        String name = textField.getText();
        String fname= textField1.getText();
        String dob= ((JTextField)date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (gen.isSelected())
        {
            gender = "Male";
        }
        else if (gen1.isSelected()) {
            gender = "Female";
        }
        String email = mailbox.getText();
        String maritalstatus = "";
        if (msts.isSelected())
        {
            maritalstatus= "Single";
        }
        else if (msts1.isSelected())
        {
            maritalstatus="Married";
        }
        else if (msts2.isSelected())
        {
            maritalstatus="Divorced";
        }
        else if (msts3.isSelected())
        {
            maritalstatus="Cohabiting";
        }
        String place = address.getText();
        String stay = live.getText();
        String pin = pincode.getText();
        String state= statee.getText();

        try {
            if (textField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }
            else {
                config con = new config();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalstatus+"','"+place+"','"+stay+"','"+pin+"','"+state+"')";
                con.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);

            }

        }
        catch(Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new signup();
    }
}

