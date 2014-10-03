package com.togetherworks.designpattern.singleton;

public class SingletonOne {
	
	//Private constructor prevents construction outside this class.
	private SingletonOne(){
		
	}
	
	  /**
	  * Single instance created upon class loading.
	  */
	private static final SingletonOne INSTANCE=new SingletonOne();
	
	public static SingletonOne getInstance(){
		return INSTANCE;
	}
	
}
