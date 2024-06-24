package singleton;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

	//instance;
	// static beacause static method will access only static variable
	private static Samosa samosa;
	
	//private constructor
	private Samosa() {
		if(samosa!=null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
	}
	
//	// Lazy Way of initializing single object
//	//method is static so we dont need to create object for the method
//	public static Samosa getSamosa() {
//		//object of this class
//		// if samosa is null means nothing is there then samosa object will be created
//		// so it will create only one object
//		if(samosa == null) {
//			samosa= new Samosa();
//		}
//		return samosa;
//	}
	
	// for multi threaded environment - multiple threads work on same task
	// to avoid this problem synchronized method or block is used 
	//so that only one thread can work on the task and other has to wait until he finishes the task
//	public synchronized static Samosa getSamosa() {
//		if(samosa == null) {
//			samosa= new Samosa();
//		}
//		return samosa;
//	}
	
	public static Samosa getSamosa() {
		if(samosa == null) {
			synchronized (Samosa.class) {
				if(samosa == null) {
					samosa= new Samosa();
				}
			}
		}
		return samosa;
	}
	
//	public Object readResolve() {
//		return samosa;
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();  //break singleton 
		return samosa;  // will not break
	}
}



/*
 * 1. constructor should be private so that it restrict object creation
 * 
 * 2. object create with the help of method
 * 
 * 3. create field to store object is private
 * 
 * 
 */
