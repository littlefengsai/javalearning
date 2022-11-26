package javase.day09;

public class Test09 {
	
	public static void main(String[] args){
		
	}
}

abstract class Animal{
	
	//抽象方法
	public abstract void move();
}

//子类(非抽象)
class Bird extends Animal{
	//因为父类是抽象的，有一个抽象方法，而抽象方法只能出现在抽象类中
	//所以Bird继承父类的时候，会出错。
	public void move(){
		
	}
}
