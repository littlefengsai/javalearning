package javase.day04;

public class test {

	/**
	 * @param args
	 */
	//带有static的方法
//	public static void method1(){
//		//调用doSome
//		test.doSome();//test.可省略
//		
//		//调用doOther()
//		test t = new test();
//		t.doOther();//不可省略
//		
//		//访问i
//		System.out.println(t.i);//不可省略
//		
//	}
//	
//	//没有static的方法
//	public void method2(){
//		//访问doSome()
//		test.doSome();//可省略；
//		
//		//调用doOther
//		this.doOther();//this.可省略
//		
//		//访问i
//		System.out.println(this.i);//this.可省略
//	
//	}
//	
//	//主方法
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//调用method1
//		test.method1();//因为在本身类当中所以可以省略test.
//		
//		//调用method2
//		test t = new test();
//		t.method2();
//		
//	}
//		
//	//没有static的变量
//	int i = 10;
//		
//	//带有static的方法
//	public static void doSome(){
//		System.out.println("do some");
//	}
//		
//	//没有static的方法
//	public void doOther(){
//		System.out.println("do other");
//	}

//	public static void main(String[] args){
//		
//		test.doSome();
//		doSome();
//		test t = new test();
//		t.doSome();
//		
//		//引用是空
//		t = null;
//		t.doSome();//理解带static与不带static的区别
//	}
//	
//	public static void doSome(){
//		System.out.println("do some");
//	}

//	public static void main(String[] args){
//		
//		//创建中国人对象1
//		Chinese zhangsan = new Chinese("1","zhangsan");
//		System.out.println(zhangsan.id + ","+zhangsan.name+","+Chinese.country);
//		
//		//创建中国人对象2
//		Chinese lisi = new Chinese("2","lisi");
//		System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
//		
//	}
	
	public static void main(String[] args){
		
		CreditAccount act = new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000);
		act.setCredit(0.99);
		
		System.out.println(act.getActno()+","+act.getBalance()+","+act.getCredit());
		
	}
	
	
	
}
