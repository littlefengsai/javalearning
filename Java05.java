/*
public class Java05
{
	public static void main(String[] args)
	{
		//doSome();
		int n=4;
		int retValue = method(n);
		System.out.println(retValue);
		
	}
	
	//���µĴ���Ƭ����Ȼֻ��һ��
	//���ǿ��Ա��ظ��ĵ��ã�����ֻҪ����doSome�����ͻ���ջ���·���һ���������ڴ�ռ�
	
	public static void doSome()
	{
		System.out.println("doSome begin");
		doSome();
		Systme.out.println("doSome over");
	}
	

	public static int sum(int n)
	{
		/*
		//�ǵݹ����1~n�ĺ�
		int result =0;
		for(int i=1;i<=n;i++)
		{
			result +=i;
		}
		return result;
		
		
		//�ݹ��㷨
		if(n == 1)
		{
			return 1;
		}
		return sum(n-1)+n;
	}
	public static int method(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*method(n-1);
	}
}
*/

public class Java05
{
	public static void main(String[] args)
	{
		Student s = new Student();
		int stuNo = s.no;
		String stuName = s.name;
		int stuAge = s.age;
		boolean stuSex = s.sex;
		String stuAddr = s.address;
		
		s.no=10;
		s.name = "jack";
		s.age=20;
		s.sex=true;
		s.address="����";
		
		System.out.println("ѧ��="+s.no);
		System.out.println("����="+s.name);
		System.out.println("����="+s.age);
		System.out.println("�Ա�="+s.sex);
		System.out.println("סַ="+s.address);
	}
	
}





