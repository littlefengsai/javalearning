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
//		Animal a2 = new Cat();//����ת��(��̬)
//		a2.move();
//		
//		Cat c2 = (Cat)a2;//����ת��(��̬)
//		
////		//����ͨ�������г���
////		Animal a3 = new Bird();
////		Cat c3 = (Cat)a3;
//	}
	
//	public static void main(String[] args){
//		
//		//����ת��
//		Animal a1 = new Cat();
//		Animal a2 = new Bird();
//		
//		//����ת��
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
		
		//�������ζ���
		Master zhangsan = new Master();
		//����è����
		Cat tom = new Cat();
		//����ι��è
		zhangsan.feed(tom);
		//����С������
		Dog erHa = new Dog();
		//����ιС��
		zhangsan.feed(erHa);
		
	}
	
	

}
