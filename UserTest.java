package javase.day01;

public class UserTest {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		
		//访问age
		//读取年龄值
		System.out.println(user.age);
		
		user.age = 20;
		
		System.out.println(user.age);
		
		user.age = -100;
		
		System.out.println(user.age);
		
		
		
		
	}
	*/
	
	//私有属性的访问
	public static void main(String[] args)
	{
		//创建user
		User user = new User();
		
		//修改
		user.setAge(-100);
		
		//读取
		int age = user.getAge();
		
		System.out.println(age);
	}
}
