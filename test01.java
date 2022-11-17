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
//	//实例变量
//	int age;
//	
//	//构造方法
//	public User(int i){
//		age = i;
//	}
//}

//public class test01{
//	public static void main(String[] args){
//		
//		//创建customer对象
//		Customer c1 = new Customer();
//		c1.name = "zhangsan";
//	
//		//再创建
//		Customer c2 = new Customer();
//		c2.name = "lisi";
//		
//	}
//}

public class test01{
	public static void main(String[] args){
		
		//调用dosome
		test01.doSome();
		doSome();
		
		//调用doOther
		//实例方法调用必须有对象的存在
		//以下代码表示的含义：调用当前对象的doOther方法
		//但是由于main方法中没有this，所以以下方法不能调用.
		//doOther();//编译报错
		//this.doOther();//编译报错
		test01 tt = new test01();
		tt.doOther();
		
	}
	
	//带static
	public static void doSome(){
		System.out.println("do some");
	}
	
	//实例方法
	public void doOther(){
		System.out.println("do oher");
	}
	
	//实例方法
	public void run(){
		//run是是方法，调用run方法的一定是有对象的。
		//一定是先创建了对象才能调用run方法
		//在大括号中的代码执行过程当中一定是存在“当前对象”的。
		//也就是说这里一定有“this”的
		System.out.println("run execute");
		//doOther是一个实例方法，实例方法调用必须有对象的存在。
		//而run方法的调用肯定了一定有对象存在，所以这里可以调用。
		doOther();
	}
}








