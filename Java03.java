public class Java03
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		/*
		System.out.print("���������ڼ�:");
		String dayofWeek = s.next();
		
		switch(dayofWeek)
		{
			case"����һ" :
			System.out.println(1);
			break;
			case"���ڶ�" :
			System.out.println(2);
			break;
			
			default :
			System.out.println("�Բ������ݷǷ�");
		}
			*/
			
			/*
			System.out.println("��ӭʹ�ü򵥵ļ����ϵͳ");
			System.out.println("�������һ������:");
			int num1 = s.nextInt();
			
			System.out.println("�����������:");
			String operator = s.next();
			
			System.out.println("������ڶ�������");
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
				System.out.println("���㲻֧��");
			}
			System.out.println("������Ϊ: " + num1 + operator + num2 + "=" + result);
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
			}//�԰�������
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
			}//������������
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
			}//�̳��ò������ͼ�¼�Ƿ�������
			*/
			
			
			
			
			
			
	}
}