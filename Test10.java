package javase.day10;

public class Test10 {
	
	public static void main(String[] args){
		
		System.out.println(MyMath.PI);
		
	}
}

//����ӿ�
interface A{
	
}
interface B{
	
}
interface C extends A,B{
	
}
interface MyMath{
	
	double PI = 3.1415926;
	public abstract int sum(int a,int b);//public abstract����ʡ��
	
	int sub(int a,int b);
}




