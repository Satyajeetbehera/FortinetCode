package com.singleton;

import java.io.ObjectStreamException;

/**
 * As stated by the GoF , Singleton pattern is design pattern is a creational design pattern, which aims to provide one and only one 
 * instance of the class at any point of time and will provide a way to access all the resources of the class
 * to be access publicly
 * 
 * There are different ways to implement the Singleton design pattern and below is one of the way best practiced 
 * in the industry known as lazy instantiation and double checking
 * 
 * If the Singleton pattern is not implemented correctly there could be many ways to break the pattern,
 * I have tried here to showcase some of the blocking from access aspects such as 
 * muti-threading , cloning, reflection ,and serialization
 * 
 * 
 * So the implementation has provided  a private constructor to avoid object construct from out side and 
 * provided a public method to create the object from outside and the method has  made static so that it can be accessed
 * without instantiation of the class 
 *
 */

public class SingletonImpl {

/*
 * Object to be returned when instantiated and volatile so that it will be read from the main memory all the time 
 * from a multi-threaded environment
 */
private static volatile SingletonImpl aSingleton =null;

/*
 * Constructor is private
 */
private SingletonImpl() {
// avoid creating multiple instance in reflection	
	if(aSingleton != null) {
		throw new RuntimeException();
	}
}

/*
 * This method can be accessed outside of the class and will retrun a Singleton object
 */
public static SingletonImpl getSingleton(){
	
// avoid creating multiple instance in multi-thread with double checking, 
//create the instance if instance is null and then use synchronize with all the threads
	if (aSingleton == null) {
		synchronized(SingletonImpl.class){ 
			if (aSingleton == null) {
			aSingleton = new SingletonImpl();
			}
		}
	}
	return aSingleton;
	}

// avoid creating multiple instance in cloning
@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

// avoid creating another instance while deserialization
	private Object readResolve() throws ObjectStreamException{
		return aSingleton;
	}
	


}
