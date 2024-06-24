package singleton;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static method called using ClassName.methodName()
		Samosa samosa1= Samosa.getSamsosa();
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2= Samosa.getSamsosa();
		System.out.println(samosa2.hashCode());
		
		Jalebi jalebi1= Jalebi.getJalebi();
		System.out.println(jalebi1.hashCode());

		Jalebi jalebi2= Jalebi.getJalebi();
		System.out.println(jalebi2.hashCode());

	}

}
