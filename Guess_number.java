package javase.day08;

public class Guess_number {
	public static void main(String[] args){
		//����A����
		A a = new A(100);
		
		//����B����
		B b = new B(a);
		
		//��ʼ�²�
		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.println("������Ҫ�²������:");
			int caiCeNum = s.nextInt();//��int���ͷ���;next()���ַ������ͷ���
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
	
	//ͨ��B�²�A
	//��B��������һ��A���������
	
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
	
	//�²�ķ���
	public void cai(int caiCeNum){
		//ʵ������
		int shiJiZhi = this.getA().getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("�²�ɹ�");
			//��ֹ�����ִ��
			//�˳�JVM
			System.exit(0);
		}
		else if(shiJiZhi > caiCeNum){
			System.out.println("��С��");
		}
		else{
			System.out.println("�´���");
		}
	}
}