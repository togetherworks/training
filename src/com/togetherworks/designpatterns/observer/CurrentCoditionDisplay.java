package com.togetherworks.designpatterns.observer;

public class CurrentCoditionDisplay implements Observer, DisplayElement {
	private float temprature;
	private float humidity;
	private Subject weatherData;

	public CurrentCoditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

	}

	public void update(float temp, float humidity, float pressure) {
		this.temprature = temp;
		this.humidity = humidity;
		display();

	}

	public void display() {
		System.out.println("Now temprature is " + temprature + " ,humidity is "
				+ humidity);

	}

}
