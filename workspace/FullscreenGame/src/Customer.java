import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;


public class Customer extends JFrame{
	Customerpanel cp;
	GraphicsDevice gd;
	GraphicsEnvironment env;
	public Customer(){
		cp= new Customerpanel();
		add(cp);
		add(new Customerpanel());
		gd=env.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	}
	public void setfullscreen(DisplayMode dm){
		
		
		
		try{
			this.setUndecorated(true);
			this.setResizable(false);
			gd.setFullScreenWindow(this);
			if(dm!=null && gd.isDisplayChangeSupported()){
				gd.getDisplayMode();
			}
			
		}catch(Exception ex){
			
		}
		
	}
	
}
