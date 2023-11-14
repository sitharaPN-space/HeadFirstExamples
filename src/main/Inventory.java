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
    		GuitarSpec guitarSpec = guitar.getGuitarSpec();
    		if(searchSpec != null && (!searchSpec.equals("") && (!searchSpec.getBuilder().equals(guitarSpec.getBuilder())))){
    			continue;
    		}
    		String model = guitarSpec.getModel();
    		if(model != null && (!model.equals("") && (!model.equals(searchSpec.getModel())))){
    			continue;
    		}
    		Type type = guitarSpec.getType();
    		if(type != null && (!type.equals("") && (!type.equals(searchSpec.getType())))){
    			continue;
    		}
    		Wood backWood = guitarSpec.getBackWood();
    		if(backWood != null && (!backWood.equals("") && (!backWood.equals(searchSpec.getBackWood())))){
    			continue;
    		}
    		Wood topWood = guitarSpec.getTopWood();
    		if(topWood != null && (!topWood.equals("") && (!topWood.equals(searchSpec.getTopWood())))){
    			continue;
    		}
    		matchingGuitars.add(guitar);
    	}
    	return matchingGuitars;
    }
}
