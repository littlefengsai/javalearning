package javase.day06;

//public class Cat extends Animal{
//
//	//重写父类中继承过来的方法
//	public void move(){
//		System.out.println("猫在走猫步");
//	}
//	
//	//不是从父类中继承过来的方法
//	//子类对象特有的行为
//	public void CatchMouse(){
//		System.out.println("猫抓老鼠");
//	}
//}

public class Cat extends Pet{
	public void eat(){
		//小猫爱吃鱼
		System.out.println("小猫正在吃鱼");
		
	}
}

