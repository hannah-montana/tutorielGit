package demo;

import java.util.Observable;

public class Model extends Observable {

	int count;
	
	public Model() {
		this.count = 0;
	}

	public void incrémente() {
		this.count += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.count));
	}
	
}

