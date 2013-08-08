package com.togetherworks.designpatterns.observer;

public class ForcastDisplay implements Observer, DisplayElement {
	private float temprature;
	private float humidity;
	private Subject weatherData;

	public ForcastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

	}

	public void update(float temp, float humidity, float pressure) {
		this.temprature = temp;
		this.humidity = humidity;
		display();

	}

	public void display() {

		String msg;
		if (temprature > 15.00)
			msg = "Warm,good day";
		else
			msg = "Cold,take care of cold";
		System.out.println("FORCAST DISPlAY:" + msg);

	}
}
