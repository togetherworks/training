package com.togetherworks.designpattern.decorator;
public class Whip extends CodimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescrpition() {
		// TODO Auto-generated method stub
		return "Whip "+beverage.getDescrpition();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.20+beverage.cost();
	}
}
