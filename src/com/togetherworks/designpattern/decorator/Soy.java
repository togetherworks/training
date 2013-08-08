package com.togetherworks.designpattern.decorator;
public class Soy extends CodimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescrpition() {
		// TODO Auto-generated method stub
		return "Soy "+beverage.getDescrpition();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.50+beverage.cost();
	}
}
