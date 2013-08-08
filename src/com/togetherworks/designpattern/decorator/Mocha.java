package com.togetherworks.designpattern.decorator;
public class Mocha extends CodimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescrpition() {
		// TODO Auto-generated method stub
		return "Mocha "+beverage.getDescrpition();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20+beverage.cost();
	}

}
