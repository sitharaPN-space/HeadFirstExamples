package main;

import java.util.Iterator;
import main.Constants.*;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec ) {
        Guitar guitar = new Guitar(serialNumber,price,guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); i.hasNext();) {
        	Guitar guitar = (Guitar) i.next();
        	if(guitar.getSerialNumber().equals(serialNumber)) {
        		return guitar;
        	}
        }
        
        return null; 
    }
    
    public List<Guitar> search(GuitarSpec searchSpec) {
    	List<Guitar> matchingGuitars = new LinkedList<Guitar>();
    	for(Iterator i = guitars.iterator();i.hasNext();) {
    		Guitar guitar = (Guitar) i.next();
    		// Ignore serial number and price since they are unique
    		if(guitar.getGuitarSpec().matches(searchSpec));
    			matchingGuitars.add(guitar);
    	}
    	return matchingGuitars;
    }
}
