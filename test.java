package javase.day04;

public class test {

	/**
	 * @param args
	 */
	//����static�ķ���
//	public static void method1(){
//		//����doSome
//		test.doSome();//test.��ʡ��
//		
//		//����doOther()
//		test t = new test();
//		t.doOther();//����ʡ��
//		
//		//����i
//		System.out.println(t.i);//����ʡ��
//		
//	}
//	
//	//û��static�ķ���
//	public void method2(){
//		//����doSome()
//		test.doSome();//��ʡ�ԣ�
//		
//		//����doOther
//		this.doOther();//this.��ʡ��
//		
//		//����i
//		System.out.println(this.i);//this.��ʡ��
//	
//	}
//	
//	//������
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//����method1
//		test.method1();//��Ϊ�ڱ����൱�����Կ���ʡ��test.
//		
//		//����method2
//		test t = new test();
//		t.method2();
//		
//	}
//		
//	//û��static�ı���
//	int i = 10;
//		
//	//����static�ķ���
//	public static void doSome(){
//		System.out.println("do some");
//	}
//		
//	//û��static�ķ���
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
//		//�����ǿ�
//		t = null;
//		t.doSome();//����static�벻��static������
//	}
//	
//	public static void doSome(){
//		System.out.println("do some");
//	}

//	public static void main(String[] args){
//		
//		//�����й��˶���1
//		Chinese zhangsan = new Chinese("1","zhangsan");
//		System.out.println(zhangsan.id + ","+zhangsan.name+","+Chinese.country);
//		
//		//�����й��˶���2
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
