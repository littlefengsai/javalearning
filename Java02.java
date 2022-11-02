public class Java02
{
	public static void main(String[] args)
	{
		//System.out.println(10+20);
		//System.out.println(10+20+30);
		//System.out.println(10+20+"30");
		//System.out.println(10+(20+"30"));
		
		//int a = 10;
		//int b = 20;
		//System.out.println(a + "+" + b + "=" + (a+b));
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的年龄：");
		int age = s.nextInt();
		
		String str = "老年";
		if(age < 0 || age > 150)
		{
			str = "您输入的年龄不合法";
		}
		else if(age<=5)
		{
			str = "幼儿";
		}
		else if(age<=10)
		{
			str = "少年";
		}
		else if(age<=18)
		{
			str = "青少年";
		}
		else if(age<=35)
		{
			str = "青年";
		}
		else if(age<=55)
		{
			str = "中年";
		}
		System.out.println(str);
		*/
		
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入当前天气:[1、表示下雨；0、表示晴天");
		int weather = s.nextInt();
		if(weather == 1)
		{
			System.out.print("请输入性别：[1、表示男；0、表示女]");
			int sex = s.nextInt();
			if(sex == 1)
			{
				System.out.println("带一把大黑伞");
			}
			else if(sex == 0 )
			{
				System.out.println("带一把小花伞");
			}
			else
			{
				System.out.println("性别输入错误");
			}
		}
		else if(weather == 0)
		{
			System.out.print("请输入天气的温度：");
			int temp = s.nextInt();
			if(temp > 30)
			{
				System.out.print("请输入性别：[1、表示男；0、表示女]");
				int sex = s.nextInt();
				if(sex == 1)
				{
					System.out.println("戴墨镜");
				}
				else if(sex == 0)
				{
					System.out.println("擦防晒霜");
				}
				else
				{
					System.out.println("性别输入错误");
				}
			}
			else 
			{
				System.out.println("开心出门");
			}
			
		}自己写的
		*/
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
		System.out.println("说明1：1表示下雨，0表示晴天");
		System.out.println("说明2：1表示男，0表示女");
		System.out.println("说明3：温度为数字");
		
		//接受性别
		System.out.print("请输入性别：");
		int sex = s.nextInt();
		
		//接受天气的状况
		System.out.print("请输入当前天气状况");
		int weather = s.nextInt();
		
		//判断天气状况
		if (weather == 1){
			//下雨天
			if(sex == 1){
				System.out.println("带一把大黑伞");
			}else if(sex == 0){
				System.out.println("带一把大花伞");
			}else{
				System.out.println("对不起，您的性别输入错误");
			}
		}else if (weather == 0){
			//晴天
			//接受温度
			System.out.println("请输入当前天气的温度");
			int tem = s.nextInt();
			if(tem>30){
				if(sex == 1){
					System.out.println("戴墨镜");
				}else if(sex == 0){
					System.out.println("擦防晒霜");
				}else{
					System.out.println("对不起，您的性别输入错误");
				}
			}
		}else{
			System.out.println("对不起，您输入的天气状况不存在");
		}
		
		
		
		
		
	}
}