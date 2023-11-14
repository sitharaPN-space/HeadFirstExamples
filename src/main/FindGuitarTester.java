package main;
import main.Constants.*;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar want = new Guitar("", 0, Builder.FENDER,"Stracoster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		
		Guitar guitar = inventory.search(want);
		
		if(guitar != null) {
			System.out.println("Resuslts: \n" + 
				guitar.getBuilder()+ " " + guitar.getModel() + " " + 
				guitar.getType() + " " + " guitar: \n " + " " + 
				guitar.getTopWood() + " " + " Top Wood" + " " +
				guitar.getBackWood() + " " + " Back Wood \n " + " " +
				"You can have it for " + guitar.getPrice()+ "!");
		} else {
			System.out.println("Sorry, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693 ", 1499.95, Builder.FENDER, "Stracoster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512 ", 1549.95, Builder.FENDER, "Stracoster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
