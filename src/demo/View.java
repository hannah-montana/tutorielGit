package demo;

import java.awt.Button;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

public class View extends Button implements Observer {
	
	public View() {

		super();
		this.setLabel("0");
		this.setPreferredSize(new Dimension(120,60));
                
                int z = 10;
                int t = 15;
                int m = z +t;
                String  word = "This is the first demo";
                String binh = "be binh";
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setLabel((String)arg);
	}

}
