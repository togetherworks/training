package com.togetherworks.designpatterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();

	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);

	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer o = (Observer) observers.get(i);
			o.update(temp, humidity, pressure);
		}

	}

	public void mesurementChanged() {
		notifyObservers();
	}

	public void setMesurement(float t, float h, float p) {
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		mesurementChanged();
	}

}
