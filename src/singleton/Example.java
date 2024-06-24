package singleton;

import java.lang.reflect.Constructor;

public class Example {

	public static void main(String[] args) throws Exception{
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
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Samosa s1= Samosa.getSamosa();
		System.out.println(s1.hashCode());
		
		Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true); // it will change private constructor to public
		Samosa s2= constructor.newInstance();
		System.out.println(s2.hashCode());
	}

}
