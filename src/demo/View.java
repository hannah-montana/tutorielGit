package tuto_git;

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
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setLabel((String)arg);
	}

}
