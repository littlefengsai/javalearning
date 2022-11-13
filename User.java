package javase.day01;

public class User {
	
	////年龄
	//int age;
	
	//属性私有化
	private int age;
	
	//setter
	public void setAge(int a)
	{
		if(a<0 || a>150)
		{
			System.out.println("对不起，您输入的年龄不合法");
			return;
		}
		age = a;
	}
	
	//getter
	public int getAge()
	{
		return age;
	}
}
