package main;

import main.Constants.Builder;
import main.Constants.Type;
import main.Constants.Wood;

public class GuitarSpec {
	 private Builder builder; 
	    private String model;
	    private Type type;
	    private Wood backWood, topWood;
	    private int numString; // lately added
	    
	    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
			this.builder = builder;
			this.model = model;
			this.type = type;
			this.backWood = backWood;
			this.topWood = topWood;
			this.numString = numString;
		}
	    
		public Builder getBuilder() { return builder; }
	    public String getModel() { return model; }
	    public Type getType() { return type; }
	    public Wood getTopWood() { return topWood; }
	    public Wood getBackWood() { return backWood; }
	    public int getNumString() { return numString;}
	    
	    public boolean matches(GuitarSpec otherSpec) {
    		if(!builder.equals(otherSpec.getBuilder())){
    			return false;
    		}
    		if(!model.equals(otherSpec.getModel())){
    			return false;
    		}
    		if(!type.equals(otherSpec.getType())){
    			return false;
    		}
    		if(!backWood.equals(otherSpec.getBackWood())){
    			return false;
    		}
    		if(!topWood.equals(otherSpec.getTopWood())){
    			return false;
    		}
    		return true;
	    }
}
