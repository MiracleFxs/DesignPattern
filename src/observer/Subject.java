package observer;

import java.util.ArrayList;
public class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void increase(Observer observer){
		observers.add(observer);
	}
	public void delete(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyVIP(){
		for(int i=0; i<observers.size(); i++){
			observers.get(i).update();
		}
	}
}
