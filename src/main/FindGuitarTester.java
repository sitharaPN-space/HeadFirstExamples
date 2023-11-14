package main;
import java.util.Iterator;
import java.util.List;

import main.Constants.*;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec want = new GuitarSpec(Builder.COLLINGS,"Stracoster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,12);
		
		List<Guitar> matchingGuitars = inventory.search(want);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Resuslts: \n");
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getGuitarSpec();
				System.out.println("We have a \n" +
						spec.getBuilder()+ " " + spec.getModel() + " " + 
						spec.getType() + " " + " guitar: \n " + " " + 
						spec.getTopWood() + " " + " Top Wood" + " " +
						spec.getBackWood() + " " + " Back Wood \n " + " " +
						"You can have it for " + guitar.getPrice()+ "!");
			}
				
		} else {
			System.out.println("Sorry, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		
		inventory.addGuitar("V95693 ", 1499.95, new GuitarSpec(Builder.FENDER, "Stracoster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,12));
		inventory.addGuitar("V9512 ", 1549.95, new GuitarSpec(Builder.FENDER, "Stracoster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,8));
	}
}
