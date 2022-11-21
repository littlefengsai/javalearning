package javase.day06;

public class Test06 {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Animal a1 = new Animal();
//		a1.move();
//		
//		Cat c1 = new Cat();
//		c1.move();
//		
//		Bird b1 = new Bird();
//		b1.move();
//		
//		Animal a2 = new Cat();//向上转型(多态)
//		a2.move();
//		
//		Cat c2 = (Cat)a2;//向下转型(多态)
//		
////		//编译通过，运行出错
////		Animal a3 = new Bird();
////		Cat c3 = (Cat)a3;
//	}
	
//	public static void main(String[] args){
//		
//		//向上转型
//		Animal a1 = new Cat();
//		Animal a2 = new Bird();
//		
//		//向下转型
//		if(a1 instanceof Cat){
//			Cat c1 = (Cat)a1;
//			
//		}
//		
//		if(a2 instanceof Bird){
//			Bird b1 = (Bird)a2;
//		}
//	}
	
	public static void main(String[] args){
		
		//创建主任对象
		Master zhangsan = new Master();
		//创建猫对象
		Cat tom = new Cat();
		//主人喂养猫
		zhangsan.feed(tom);
		//创建小狗对象
		Dog erHa = new Dog();
		//主人喂小狗
		zhangsan.feed(erHa);
		
	}
	
	

}
