package javase.day03;

//public class test01 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int i =10;
//		add(i);
//		System.out.println("main -->"+i);
//	}
//	public static void add(int i){
//		i++;
//		System.out.println("add -->"+i);
//	}
//
//}

//public class test01{
//	public static void main(String[] args){
//		User u = new User(20);
//		add(u);
//		System.out.println("main -->"+u.age);//21
//		
//	}
//	public static void add(User u){
//		
//		u.age++;
//		System.out.println("add -->"+u.age);//21
//	}
//}
//
//class User{
//	
//	//ʵ������
//	int age;
//	
//	//���췽��
//	public User(int i){
//		age = i;
//	}
//}

//public class test01{
//	public static void main(String[] args){
//		
//		//����customer����
//		Customer c1 = new Customer();
//		c1.name = "zhangsan";
//	
//		//�ٴ���
//		Customer c2 = new Customer();
//		c2.name = "lisi";
//		
//	}
//}

public class test01{
	public static void main(String[] args){
		
		//����dosome
		test01.doSome();
		doSome();
		
		//����doOther
		//ʵ���������ñ����ж���Ĵ���
		//���´����ʾ�ĺ��壺���õ�ǰ�����doOther����
		//��������main������û��this���������·������ܵ���.
		//doOther();//���뱨��
		//this.doOther();//���뱨��
		test01 tt = new test01();
		tt.doOther();
		
	}
	
	//��static
	public static void doSome(){
		System.out.println("do some");
	}
	
	//ʵ������
	public void doOther(){
		System.out.println("do oher");
	}
	
	//ʵ������
	public void run(){
		//run���Ƿ���������run������һ�����ж���ġ�
		//һ�����ȴ����˶�����ܵ���run����
		//�ڴ������еĴ���ִ�й��̵���һ���Ǵ��ڡ���ǰ���󡱵ġ�
		//Ҳ����˵����һ���С�this����
		System.out.println("run execute");
		//doOther��һ��ʵ��������ʵ���������ñ����ж���Ĵ��ڡ�
		//��run�����ĵ��ÿ϶���һ���ж�����ڣ�����������Ե��á�
		doOther();
	}
}








