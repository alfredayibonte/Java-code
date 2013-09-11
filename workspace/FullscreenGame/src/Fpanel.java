import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Fpanel extends JPanel{
	JLabel User, password;
	JTextField t1;
	JPasswordField p;
	JButton b;
	DisplayMode dm=new DisplayMode(1366,768,32,DisplayMode.REFRESH_RATE_UNKNOWN);
	//Customerpanel window= new Customerpanel();
	public void initialize(){
		User = new JLabel("User :");
		t1= new JTextField(20);
		password= new JLabel("password :");
		p= new JPasswordField();
		b=new JButton("login");
	}
	public void addstaff(){
		add(User);
		add(t1);
		add(password);
		add(p);
		b.addActionListener(new Listener());
		add(b);
		
	}

	Fpanel(){
		initialize();
		setBackground(Color.GREEN);
		setLayout(new GridLayout(3,2));
		addstaff();
		
	}
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(true){
				//Open customer form
				
				Customer customer=new Customer();
				try{
				customer.setfullscreen(dm);
				}catch(Exception ex){}
				
			}else{}
			
		}
		
	}

}
