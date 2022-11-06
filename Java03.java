public class Java03
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		/*
		System.out.print("请输入星期几:");
		String dayofWeek = s.next();
		
		switch(dayofWeek)
		{
			case"星期一" :
			System.out.println(1);
			break;
			case"星期二" :
			System.out.println(2);
			break;
			
			default :
			System.out.println("对不起，数据非法");
		}
			*/
			
			/*
			System.out.println("欢迎使用简单的计算机系统");
			System.out.println("请输入第一个数字:");
			int num1 = s.nextInt();
			
			System.out.println("请输入运算符:");
			String operator = s.next();
			
			System.out.println("请输入第二个数字");
			int num2 = s.nextInt();
			
			int result = 0;
			
			switch(operator)
			{
				case "+":
				result = num1 + num2;
				break;
				case "-":
				result = num1 - num2;
				break;
				case "*":
				result = num1 * num2;
				break;
				case "/":
				result = num1 / num2;
				break;
				case "%":
				result = num1 % num2;
				break;
				default:
				System.out.println("运算不支持");
			}
			System.out.println("运算结果为: " + num1 + operator + num2 + "=" + result);
			*/
			
			/*
			for(int i = 1;i<10;i++)
			{
				int j = 1;
				for(j=1;j<=i;j++)
				{
					System.out.print(i+"*"+j+"="+i*j+" ");
				}
				System.out.println();
			}
			*/
			
			/*
			int i = 0;
			for(i=1;i<=100;i++)
			{
				int j=1;
				int k = i / 2;
				for(j=2;j<=k;j++)
				{
					if(i%j == 0)
					{
						break;
					}
				}
				if(j > k && i != 1)
				{
					System.out.print(i+" ");
				}
			}//对半找素数
			*/
			/*
			int i = 0;
			for(i=1;i<=100;i++)
			{
				int j=1;
				for(j=2;j<i;j++)
				{
					if(i%j == 0)
					{
						break;
					}
				}
				if(i == j)
				{
					System.out.print(i+" ");
				}
			}//挨个除找素数
			*/
			/*
			for(int i=2;i<=100;i++)
			{
				boolean isSuShu = true;
				for(int j=2;j<i;j++)
				{
					if(i%j == 0)
					{
						isSuShu = false;
						break;
					}	
				}
				if(isSuShu)
				{
					System.out.print(i+" ");
				}
			}//教程用布尔类型记录是否是素数
			*/
			
			
			
			
			
			
	}
}