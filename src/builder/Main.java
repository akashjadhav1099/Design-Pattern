package builder;

public class Main {

	public static void main(String[] args) {
		User user = new User.UserBuilder().setUserId("123")
				.setUsername("Akash Jadhav")
				.setEmail("jadhav.aksh1999@gmail.com")
				.build();
		System.out.println(user);
		
		User user1 = new User.UserBuilder()
				.setUserId("432")
				.setUsername("Vamshi Vupulla")
				.setEmail("vamshi.vupulla@gmail.com")
				.build();
		System.out.println(user1);
	}
}
