

import java.awt.BorderLayout;
import java.awt.DisplayMode;

import javax.swing.JFrame;



public class Fwindow extends JFrame{

	/**
	 * @param args
	 */
	//DisplayMode dm;
	//Device vc;
	Fwindow(){
		super("Login Form");
		
		setSize(200,100);
		setResizable(false);
		setLocationRelativeTo(null);
		add(new Fpanel(),BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fwindow();

	}

}
