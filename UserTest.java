package javase.day01;

public class UserTest {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		
		//����age
		//��ȡ����ֵ
		System.out.println(user.age);
		
		user.age = 20;
		
		System.out.println(user.age);
		
		user.age = -100;
		
		System.out.println(user.age);
		
		
		
		
	}
	*/
	
	//˽�����Եķ���
	public static void main(String[] args)
	{
		//����user
		User user = new User();
		
		//�޸�
		user.setAge(-100);
		
		//��ȡ
		int age = user.getAge();
		
		System.out.println(age);
	}
}
