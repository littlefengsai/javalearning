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
		System.out.print("�������������䣺");
		int age = s.nextInt();
		
		String str = "����";
		if(age < 0 || age > 150)
		{
			str = "����������䲻�Ϸ�";
		}
		else if(age<=5)
		{
			str = "�׶�";
		}
		else if(age<=10)
		{
			str = "����";
		}
		else if(age<=18)
		{
			str = "������";
		}
		else if(age<=35)
		{
			str = "����";
		}
		else if(age<=55)
		{
			str = "����";
		}
		System.out.println(str);
		*/
		
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�����뵱ǰ����:[1����ʾ���ꣻ0����ʾ����");
		int weather = s.nextInt();
		if(weather == 1)
		{
			System.out.print("�������Ա�[1����ʾ�У�0����ʾŮ]");
			int sex = s.nextInt();
			if(sex == 1)
			{
				System.out.println("��һ�Ѵ��ɡ");
			}
			else if(sex == 0 )
			{
				System.out.println("��һ��С��ɡ");
			}
			else
			{
				System.out.println("�Ա��������");
			}
		}
		else if(weather == 0)
		{
			System.out.print("�������������¶ȣ�");
			int temp = s.nextInt();
			if(temp > 30)
			{
				System.out.print("�������Ա�[1����ʾ�У�0����ʾŮ]");
				int sex = s.nextInt();
				if(sex == 1)
				{
					System.out.println("��ī��");
				}
				else if(sex == 0)
				{
					System.out.println("����ɹ˪");
				}
				else
				{
					System.out.println("�Ա��������");
				}
			}
			else 
			{
				System.out.println("���ĳ���");
			}
			
		}�Լ�д��
		*/
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("��ӭʹ�ñ�ϵͳ����ͨ����ϵͳ�������һЩ�򵥵��ж�");
		System.out.println("˵��1��1��ʾ���꣬0��ʾ����");
		System.out.println("˵��2��1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");
		
		//�����Ա�
		System.out.print("�������Ա�");
		int sex = s.nextInt();
		
		//����������״��
		System.out.print("�����뵱ǰ����״��");
		int weather = s.nextInt();
		
		//�ж�����״��
		if (weather == 1){
			//������
			if(sex == 1){
				System.out.println("��һ�Ѵ��ɡ");
			}else if(sex == 0){
				System.out.println("��һ�Ѵ�ɡ");
			}else{
				System.out.println("�Բ��������Ա��������");
			}
		}else if (weather == 0){
			//����
			//�����¶�
			System.out.println("�����뵱ǰ�������¶�");
			int tem = s.nextInt();
			if(tem>30){
				if(sex == 1){
					System.out.println("��ī��");
				}else if(sex == 0){
					System.out.println("����ɹ˪");
				}else{
					System.out.println("�Բ��������Ա��������");
				}
			}
		}else{
			System.out.println("�Բ��������������״��������");
		}
		
		
		
		
		
	}
}