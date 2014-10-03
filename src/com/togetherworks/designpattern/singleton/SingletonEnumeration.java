package com.togetherworks.designpattern.singleton;

/** Preferred style for singletons. */
public enum SingletonEnumeration {
	INSTANCE;
	
	 /**Add some behavior to the object. */
	  public void distributePresents(){
	    //elided    
	  }
	  
	  /** Demonstrate use of SingletonEnumeration. */
	  public static void main(String args[]){
		  SingletonEnumeration se = SingletonEnumeration.INSTANCE;
		  se.distributePresents();
	    
	    
	  }
}
