package javase.day08;

public class Guess_number {
	public static void main(String[] args){
		//创建A对象
		A a = new A(100);
		
		//创建B对象
		B b = new B(a);
		
		//开始猜测
		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.println("请输入要猜测的数字:");
			int caiCeNum = s.nextInt();//以int类型返回;next()以字符串类型返回
			b.cai(caiCeNum);
		}
	}
}

class A{
	
	private int V;
	public A(){
		
	}
	public A(int V){
		this.V = V;
	}
	
	public void setV(int V){
		this.V = V;
	}
	public int getV(){
		return V;
	}
	
}

class B{
	
	//通过B猜测A
	//在B对象中有一个A对象的引用
	
	private A a;
	
	public B(){
		
	}
	public B(A a){
		this.a = a;
	}
	public void setA(A a){
		this.a = a;
	}
	public A getA(){
		return a;
	}
	
	//猜测的方法
	public void cai(int caiCeNum){
		//实际数字
		int shiJiZhi = this.getA().getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("猜测成功");
			//终止程序的执行
			//退出JVM
			System.exit(0);
		}
		else if(shiJiZhi > caiCeNum){
			System.out.println("猜小了");
		}
		else{
			System.out.println("猜大了");
		}
	}
}