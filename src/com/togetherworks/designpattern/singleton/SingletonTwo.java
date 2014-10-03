package com.togetherworks.designpattern.singleton;

public class SingletonTwo {
	//Private constructor prevents construction outside this class.
	private SingletonTwo(){
		
	}
	//Singleton with public final field
	public static final SingletonTwo INSTACNE=new SingletonTwo();
	
	
}
