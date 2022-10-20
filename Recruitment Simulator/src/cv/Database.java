package cv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Database<T> implements Iterable<T> {
	
	private ArrayList<T> contents; 
	
	public Database() {
		contents = new ArrayList<>();
	}
	
	public T draw() {
		
		T drawnItem = null;
		
		if (!contents.isEmpty()) {
			Random randomizer = new Random();
			int which = randomizer.nextInt(contents.size());
			drawnItem = contents.remove(which);
		}
		
		return drawnItem;
	}
	
	public void put(T item) {
		contents.add(item);
	}

	public boolean find(T item) {
		return contents.contains(item);
	}

	public Iterator<T> iterator() {
		return contents.iterator();
	}
	
	public boolean isEmpty() {
		return contents.isEmpty();
	}
}
