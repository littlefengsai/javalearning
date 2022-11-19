package javase.day05;

//public class Test05 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		C c = new C();
//		c.doSome();//从B中继承过来的doSome方法
//		
//	}
//	
//}
//
//class A{
//	public void doSome(){
//		System.out.println("do some");
//	}
//}
//class B extends A{
//	
//}
//class C extends B{
//	
//}

public class Test05{
	public static void main(String[] args){
		
		//创建动物对象
		Animal a = new Animal();
		a.move();
		
		//创建猫科雷动物对象
		Cat c = new Cat();
		c.move();
		
		//创建飞禽类动物
		Bird b = new Bird();
		b.move();
		
		//创建鹦鹉类动物
		YingWu y = new YingWu();
		y.move();
	}
}










