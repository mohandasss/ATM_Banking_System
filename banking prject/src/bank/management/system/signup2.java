package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    String formno;
    JTextField pann,aacard;
    JComboBox comboBox,combobox1,combobox2,comboBox3,comboBox4;
    JRadioButton sen,sen1,exacc,exacc1;
    JButton next;
    signup2(String formno)
    {
        super("APPLICATION FORM");

        ImageIcon  image = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image image2=image.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image1 = new JLabel(image3);
        image1.setBounds(100,0,300,300);
        add(image1);


        this.formno=formno;

        JLabel label = new JLabel("PAGE 2 :");
        label.setFont(new Font("Josefin Sans",Font.BOLD,25));
        label.setBounds(380,110,600,40);
        add(label);

        JLabel adetails = new JLabel("ADDITONAL DETAILS :");
        adetails.setFont(new Font("Josefin Sans",Font.BOLD,22));
        adetails.setBounds(380,150,600,40);
        add(adetails);


        JLabel religion = new JLabel("RELIGION :");
        religion.setFont(new Font("Josefin Sans",Font.BOLD,15));
        religion.setBounds(250,220,600,40);
        add(religion);

        String relg[]={"Hindu","Muslim","Christian","Sikh","others"};
        comboBox= new JComboBox(relg);
        comboBox.setFont(new Font("osefin Sans",Font.BOLD,15));
        comboBox.setBackground(new Color(0xFBCF4C));
        comboBox.setBounds(380,220,300,40);
        add(comboBox);

        JLabel category = new JLabel("CATEGORY :");
        category.setFont(new Font("Josefin Sans",Font.BOLD,15));
        category.setBounds(250,280,600,40);
        add(category);

        String[] caste={"General","OBC","SC","ST","others"};
        combobox1= new JComboBox(caste);
        combobox1.setBackground(new Color(0xFBCF4C));
        combobox1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        combobox1.setBounds(380,280,300,40);
        add(combobox1);

        JLabel income = new JLabel("INCOME :");
        income.setFont(new Font("Josefin Sans",Font.BOLD,15));
        income.setBounds(250,340,600,40);
        add(income);

        String[] money={"NULL","<1,50,000","<2,50,000","<5,00,000","Above 10,00,000"};
        combobox2= new JComboBox(money);
        combobox2.setBackground(new Color(0xFBCF4C));
        combobox2.setFont(new Font("Josefin Sans",Font.BOLD,15));
        combobox2.setBounds(380,340,300,40);
        add(combobox2);

        JLabel edu = new JLabel("EDUCATION :");
        edu.setFont(new Font("Josefin Sans",Font.BOLD,15));
        edu.setBounds(250,400,600,40);
        add(edu);

        String[] education={"Non-Graduate","Graduate","Post-Graduate","Others"};
        comboBox3= new JComboBox(education);
        comboBox3.setBackground(new Color(0xFBCF4C));
        comboBox3.setFont(new Font("Josefin Sans",Font.BOLD,15));
        comboBox3.setBounds(380,400,300,40);
        add(comboBox3);

        JLabel ocu = new JLabel("OCUPATION :");
        ocu.setFont(new Font("Josefin Sans",Font.BOLD,15));
        ocu.setBounds(250,460,600,40);
        add(ocu);


        String[] ocupation={"Self-ZEmployed","Bussiness","Employee","Freelancer","Retired"};
        comboBox4= new JComboBox(ocupation);
        comboBox4.setBackground(new Color(0xFBCF4C));
        comboBox4.setFont(new Font("Josefin Sans",Font.BOLD,15));
        comboBox4.setBounds(380,460,300,40);
        add(comboBox4);

        JLabel pan = new JLabel("PAN NUMBER :");
        pan.setFont(new Font("Josefin Sans",Font.BOLD,15));
        pan.setBounds(250,520,600,40);
        add(pan);


        pann = new JTextField();
        pann.setFont(new Font("Josefin Sans",Font.BOLD,15));
        pann.setBackground(new Color(0xFBCF4C));
        pann.setBounds(380,520,300,40);
        add(pann);

        JLabel acard = new JLabel("AADHAR NO :");
        acard.setFont(new Font("Josefin Sans",Font.BOLD,15));
        acard.setBounds(250,580,600,40);
        add(acard);


        aacard = new JTextField();
        aacard.setFont(new Font("Josefin Sans",Font.BOLD,15));
        aacard.setBackground(new Color(0xFBCF4C));
        aacard.setBounds(380,580,300,40);
        add(aacard);

        JLabel senior = new JLabel("SENIOR CITIZEN :");
        senior.setFont(new Font("Josefin Sans",Font.BOLD,15));
        senior.setBounds(250,640,600,40);
        add(senior);

        sen = new JRadioButton("YES");
        sen.setFont(new Font("Josefin Sans",Font.BOLD,15));
        sen.setBackground(new Color(0xFBCF4C));
        sen.setBounds(450,640,70,40);
        add(sen);

        sen1 = new JRadioButton("NO");
        sen1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        sen1.setBackground(new Color(0xFBCF4C));
        sen1.setBounds(520,640,90,40);
        add(sen1);

        ButtonGroup g = new ButtonGroup();
        g.add(sen);
        g.add(sen1);

        JLabel xtable = new JLabel("EXISTING ACCOUNT :");
        xtable.setFont(new Font("Josefin Sans",Font.BOLD,15));
        xtable.setBounds(250,700,600,40);
        add(xtable);

        exacc = new JRadioButton("YES");
        exacc.setFont(new Font("Josefin Sans",Font.BOLD,15));
        exacc.setBackground(new Color(0xFBCF4C));
        exacc.setBounds(450,700,70,40);
        add(exacc);

        exacc1 = new JRadioButton("NO");
        exacc1.setFont(new Font("Josefin Sans",Font.BOLD,15));
        exacc1.setBackground(new Color(0xFBCF4C));
        exacc1.setBounds(520,700,90,40);
        add(exacc1);

        ButtonGroup e = new ButtonGroup();
        e.add(exacc);
        e.add(exacc1);

        JLabel form = new JLabel("Form No :");
        form.setFont(new Font("Josefin Sans",Font.BOLD,12));
        form.setBounds(750,10,80,30);
        add(form);



        JLabel form1 = new JLabel(formno);
        form1.setFont(new Font("Josefin Sans",Font.BOLD,12));
        form1.setBounds(810,10,100,30);
        add(form1);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Josefin Sans",Font.BOLD,18));
        next.setBounds(600,750,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String rel= (String)comboBox.getSelectedItem();
            String cast=(String)combobox1.getSelectedItem();
            String inc=(String)combobox2.getSelectedItem();
            String edu=(String)comboBox3.getSelectedItem();
            String ocu=(String)comboBox4.getSelectedItem();
            String pan=pann.getText();
            String acrad= aacard.getText();
            String senior = "";
            if(sen.isSelected())
            {
                System.out.println("Yes");
            }
            else if (sen1.isSelected())
            {
                System.out.println("No");
            }
        String exac = "";
            if (exacc.isSelected())
            {
                System.out.println("Yes");
            }
            else if (exacc1.isSelected())
            {
                System.out.println("No");
            }


          try {
              if (pann.getText().equals("") && aacard.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"fill all the fields");
              }
              else {
                  config conp = new config();
                  String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cast+"','"+inc+"','"+edu+"','"+ocu+"','"+pan+"','"+acrad+"','"+senior+"','"+exac+"')";
                  conp.statement.executeUpdate(q);
                  new signup3(formno);
                  setVisible(false);

              }




          }
          catch (Exception k)
          {
              k.printStackTrace();
          }


    }

    public static void main(String[] args) {
        new signup2("");

    }
}
