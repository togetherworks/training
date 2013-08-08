package com.togetherworks.designpattern.decorator;
public class StarbuzzCofe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescrpition()+" $:"+beverage.cost());
		
		Beverage beverage2=new DarkRost();
		System.out.println(beverage2.getDescrpition()+" $:"+beverage2.cost());
		
		Beverage beverage3=new HouselBlend();
		
		beverage3=new Mocha(beverage3);
		beverage3=new Soy(beverage3);
		beverage3=new Whip(beverage3);
		
		System.out.println(beverage3.getDescrpition()+" $:"+beverage3.cost());
	}

}
