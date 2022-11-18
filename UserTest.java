package javase.day04;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(100,"zhangsan");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		u1.setName("lisi");
		System.out.println(u1.getName());
	}

}
