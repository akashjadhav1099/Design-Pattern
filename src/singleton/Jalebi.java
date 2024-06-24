package singleton;

public class Jalebi {

	//Eager way of creating singleton object
	//object is created before the default constructor will call as static load first.
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
