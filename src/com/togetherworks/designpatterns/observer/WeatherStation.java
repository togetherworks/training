package com.togetherworks.designpatterns.observer;

public class WeatherStation {
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentCoditionDisplay currentDisplay = new CurrentCoditionDisplay(weatherData);
		ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
		
		weatherData.setMesurement(10, 20, 30);
		weatherData.setMesurement(60, 20, 30);
	}
}
