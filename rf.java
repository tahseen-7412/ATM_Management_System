import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class RegistrationForm extends JFrame implements ItemListener
{
	static JFrame f;
	static JLabel l; 
	// combobox 
	static JComboBox c1; 
    public static void main(String [] args) throws Exception
    {
        f=new JFrame();
        Container c;
        JLabel title,name,mno,gender,add,res;
        JTextField tname,tmno;
        JRadioButton male,female;
        ButtonGroup gengp;
        JTextArea tadd,resadd,tout;
        JCheckBox term;
        JButton sub,reset;
        f.setTitle("RegistrationForm");
        f.setBounds(200,80,1150,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        c=f.getContentPane();
        c.setLayout(null);
 
 
 
        //label-title
        title=new JLabel("  Registration Form ");
        title.setFont(new Font("Baskerville Old Face",Font.BOLD,30));
        title.setSize(400,30);
        title.setLocation(420,20);
        c.add(title);
       
        //label-name
        name=new JLabel("Name");
        name.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        name.setSize(300,30);
        name.setLocation(50,70);
        c.add(name);
   
   
        //label-mno
        mno=new JLabel("ID Number");
        mno.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        mno.setSize(300,30);
        mno.setLocation(50,120);
        c.add(mno);

//TextField-name
tname=new JTextField();
tname.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
tname.setSize(200,40);
tname.setLocation(275,70);
c.add(tname);
   
   
        //TextField-mno
        tmno= new JTextField();
        tmno.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        tmno.setSize(200,40);
        tmno.setLocation(275,120);
        c.add(tmno);
       
        //Label-Gender
        gender= new JLabel("Gender");
        gender.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        gender.setSize(300,40);
        gender.setLocation(50,170);
        c.add(gender);
       
       
        //RadioButton-male
        male=new JRadioButton("Male");
        male.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        male.setSelected(true);
        male.setSize(100,30);
        male.setLocation(255,170);
        c.add(male);
       
       
        //RadioButton-female
        female=new JRadioButton("Female");
        female.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        female.setSelected(true);
        female.setSize(200,30);
        female.setLocation(395,170);
        c.add(female);
       
       
        //ButtonGroup
        gengp=new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
       
       
        //Label address
        add=new JLabel("Address");
        add.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        add.setSize(3500,30);
        add.setLocation(50,230);
        c.add(add);
     
     
        //TextArea-address
        tadd=new JTextArea();
        tadd.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        tadd.setSize(300,30);
        tadd.setLocation(275,230);
        tadd.setLineWrap(true);
        c.add(tadd);
   
   
        //Checkbox- terms and conditionn
        term= new JCheckBox("Accept Terms and conditions");
        term.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        term.setSize(450,20);
        term.setLocation(110,320);
        c.add(term);
       
       
        //Button-Reset
        reset=new JButton("Reset");
        reset.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        reset.setSize(150,30);
        reset.setLocation(470,410);
        c.add(reset);
		
		
       
//Button-submit
sub=new JButton("Submit");
sub.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
sub.setSize(150,25);
sub.setLocation(100,410);
c.add(sub);



        //Label-result
        res=new JLabel("");
        res.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        res.setSize(500,30);
        res.setLocation(50,515);
        c.add(res);
     //TextArea- result
        
	
	    resadd=new JTextArea();
        resadd.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        resadd.setSize(100,30);
        resadd.setLocation(275,510);
        
        
        c.add(resadd);
		
        //Printing details
		tout=new JTextArea();
        tout.setFont(new Font("Baskerville Old Face",Font.PLAIN,20));
        tout.setSize(450,500);
        tout.setLocation(650,80);
        tout.setLineWrap(true);
        tout.setEditable(false);
		f.setVisible(true);
        c.add(tout);
        

        //ActionListener for submit button
        sub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(term.isSelected())
                {
                    String data,data1,data2,data3;
                    data="1. Name :- "+tname.getText() + "\n" + "2. ID Number :- "+tmno.getText() + "\n";
					if(male.isSelected())
						
						
                    data1="3. Gender :- "+male.getText() + "\n";
					else
						 data1="3. Gender :- "+female.getText() + "\n";
                    data2="4. Address :- "+tadd.getText()+"\n";
					data3="5. Sports :- "+c1.getSelectedItem();
                    tout.setText(data+data1+data2+data3);
                    tout.setEditable(false);
                    res.setText("Registration successfully done!!!");
                }
                else
                {
                    
                   // resadd.setText("null");
                    tout.setText("*-*-*-* Please accept the terms and conditions *-*-*-*");
                }
        }});
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tname.setText("");
                tadd.setText("");
                tmno.setText("");
                res.setText("");
                tout.setText("");
                term.setSelected(false);
                //resadd.setText("");
            }
        }); 
		RegistrationForm s = new RegistrationForm(); 

		// array of string contating games : Basketball, Volleyball, Badminton, Tennis, Table tennis
		String s1[] = { "Basket Ball", "Badminton", "Volley Ball", "Cricket","Tennis", "Hockey", "Table Tennis" }; 

		// create checkbox 
		c1 = new JComboBox(s1); 

		// add ItemListener 
		c1.addItemListener(s); 

		// create labels 
		l = new JLabel("Select your game:-> "); 

		// set color of text 
		l.setForeground(Color.BLUE); 

		f.add(l); 

		// add combobox to panel 
		f.add(c1); 

        l.setSize(200,25);
        l.setLocation(150,450);
	    c1.setSize(200,25);
        c1.setLocation(150,470);
	}
	public void itemStateChanged(ItemEvent e) 
	{ 
	} 
}