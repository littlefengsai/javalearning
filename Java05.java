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
	
	//以下的代码片段虽然只有一份
	//但是可以被重复的调用，并且只要调用doSome方法就会在栈内新分配一块所属的内存空间
	
	public static void doSome()
	{
		System.out.println("doSome begin");
		doSome();
		Systme.out.println("doSome over");
	}
	

	public static int sum(int n)
	{
		/*
		//非递归计算1~n的和
		int result =0;
		for(int i=1;i<=n;i++)
		{
			result +=i;
		}
		return result;
		
		
		//递归算法
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
		s.address="北京";
		
		System.out.println("学号="+s.no);
		System.out.println("姓名="+s.name);
		System.out.println("年龄="+s.age);
		System.out.println("性别="+s.sex);
		System.out.println("住址="+s.address);
	}
	
}





