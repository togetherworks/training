package com.togetherworks.designpattern.decorator;


public abstract class Beverage {
	String description="Unkonw beverage";
	public String getDescrpition(){
		return description;
	}
    public abstract double cost();
}
