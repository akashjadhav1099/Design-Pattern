package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//static method called using ClassName.methodName()
//		Samosa samosa1= Samosa.getSamosa();
//		System.out.println(samosa1.hashCode());
//		
//		Samosa samosa2= Samosa.getSamosa();
//		System.out.println(samosa2.hashCode());
//		
//		Jalebi jalebi1= Jalebi.getJalebi();
//		System.out.println(jalebi1.hashCode());
//
//		Jalebi jalebi2= Jalebi.getJalebi();
//		System.out.println(jalebi2.hashCode());

		
		/*
		 * how to break singleton pattern:
		 * 1.using reflection Api
		 * 	solution 1 : if object is there ==> throws exception from inside constructor
		 *  solution 2: use enum
		 * 
		 * 2. using Deserialization
		 * 	solution : implementing readResolve method
		 * 
		 * 3. cloning the object
		 * 
		 * 
		 * 
		 */
		
		//Samosa s1= Samosa.instance;
//		Samosa s1= Samosa.getSamosa();
//		System.out.println(s1.hashCode());
//		
//		Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
//		constructor.setAccessible(true); // it will change private constructor to public
//		Samosa s2= constructor.newInstance();
//		System.out.println(s2.hashCode());
		
		
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.ob"));
//		oos.writeObject(samosa1);
//		
//		System.out.println("Serialization Done...");
//		
//		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("abc.ob"));
//		Samosa samosa2 = (Samosa) ois.readObject();
//		System.out.println(samosa2.hashCode());
		
		
		Samosa samosa2= (Samosa) samosa1.clone();
		System.out.println(samosa2.hashCode());
	}

}
