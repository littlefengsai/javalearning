package javase.day02;

//public class test01 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		User u1 = new User();
//		User u2 = new User(10);
//		User u3 = new User("zhangsan");
//		User u4 = new User(10,"zhangsan");
//	}
//
//}

public class test01{
	public static void main(String[] args){
		
		//��������
		Account act1 =new Account("act-1",100);
		
		//����������Ը�ֵ
		System.out.println("�˺�"+act1.getActno());
		System.out.println("���"+act1.getBalance());
		
		Customer c1 = new Customer(1111,"zhangsan","1999-10-01");
		System.out.println(c1.getNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBirth());
		
	}
}


