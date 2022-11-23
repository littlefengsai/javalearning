package javase.day08;

public class Test08 {
	
	public static void main(String[] args){
		
		//∂‡Ã¨
		AA a = new CC();
		
		if(a instanceof DD){
			DD d1 = (DD)a;
			d1.doOther();
		}
	}
}
class AA{
	public void doSome(){
		System.out.println("A`s doSome");
	}
}
class BB extends AA{
	public void doSome(){
		System.out.println("B`s doSome");
	}
}
class CC extends BB{
	public final void doSome(){
		System.out.println("C`s doSome");
	}
}
class DD extends CC{
	public void doOther(){
		System.out.println("D`s doOther");
	}
}

