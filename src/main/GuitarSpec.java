package main;

import main.Constants.Builder;
import main.Constants.Type;
import main.Constants.Wood;

public class GuitarSpec {
	 private Builder builder; 
	    private String model;
	    private Type type;
	    private Wood backWood, topWood;
	    
	    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
			this.builder = builder;
			this.model = model;
			this.type = type;
			this.backWood = backWood;
			this.topWood = topWood;
		}
	    
		public Builder getBuilder() { return builder; }
	    public String getModel() { return model; }
	    public Type getType() { return type; }
	    public Wood getTopWood() { return topWood; }
	    public Wood getBackWood() { return backWood; }
}
