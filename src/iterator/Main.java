package iterator;

public class Main {

	public static void main(String[] args) {

		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("Durgesh", "14"));
		userManagement.addUser(new User("Akash", "23"));
		userManagement.addUser(new User("Vamshi", "65"));
		userManagement.addUser(new User("Jayesh", "77"));
		userManagement.addUser(new User("Shubham", "54"));
		
		
		MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext()) {
			User user = (User) myIterator.next();
			System.out.println(user.getUserId()+" "+ user.getUsername());
		}

	}

}
