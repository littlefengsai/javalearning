package javase.day05;

//public class Test05 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		C c = new C();
//		c.doSome();//��B�м̳й�����doSome����
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
		
		//�����������
		Animal a = new Animal();
		a.move();
		
		//����è���׶������
		Cat c = new Cat();
		c.move();
		
		//���������ද��
		Bird b = new Bird();
		b.move();
		
		//���������ද��
		YingWu y = new YingWu();
		y.move();
	}
}










