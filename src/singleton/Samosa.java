package singleton;

public class Samosa {

	// static beacause static method will access only static variable
	private static Samosa samosa;
	
	//private constructor
	private Samosa() {
		
	}
	
	// Lazy Way of initializing single object
	//method is static so we dont need to create object for the method
	public static Samosa getSamsosa() {
		//object of this class
		// if samosa is null means nothing is there then samosa object will be created
		// so it will create only one object
		if(samosa == null) {
			samosa= new Samosa();
		}
		return samosa;
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
