package main;

import main.Constants.*;

public class Guitar{
    private String serialNumber; 
    private Builder builder; 
    private String model;
    private Type type;
    private Wood backWood, topWood;
    private double price; 

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood ) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() { return serialNumber; }
    public Builder getBuilder() { return builder; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;}
    public String getModel() { return model; }
    public Type getType() { return type; }
    public Wood getTopWood() { return topWood; }
    public Wood getBackWood() { return backWood; }

}