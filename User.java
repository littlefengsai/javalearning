package javase.day01;

public class User {
	
	////����
	//int age;
	
	//����˽�л�
	private int age;
	
	//setter
	public void setAge(int a)
	{
		if(a<0 || a>150)
		{
			System.out.println("�Բ�������������䲻�Ϸ�");
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
