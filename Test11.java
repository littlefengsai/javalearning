package javase.day11;

public class Test11 {

	public static void main(String[] args){
		
//		MyMath mm = new MyMathImp();
//		int result1 = mm.sum(10,20);
//		System.out.println(result1);
//		int result2 = mm.sub(20, 10);
//		System.out.println(result2);
		
		A a = new D();
		B b = new D();
		C c = new D();
		
		B b2 = (B)a;
		b2.m2();
		
		
//		M m = new E();
//		K k = (K)m;//编译没错，运行报错
		Flyable f = new Cat();
		f.fly();
		Flyable f2 = new Pig();
		f2.fly();
		Flyable f3 = new Fish();
		f3.fly();
	}
}
class Animal{
	
}
interface Flyable{
	void fly();
}
class Cat extends Animal implements Flyable{
	public void fly(){
		System.out.println("fly!");
	}
}
class Snake extends Animal{
	
}
class Pig extends Animal implements Flyable{
	public void fly(){
		System.out.println("flying!");
	}
}
class Fish implements Flyable{
	public void fly(){
		System.out.println("fly fish");
	}
}











interface MyMath{
	double PI = 3.1415;
	int sum(int a,int b);
	int sub(int a,int b);
	
}
class MyMathImp implements MyMath{
	//接口是抽象类型，里面的方法需要实现。否则报错
	public int sum(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
}
interface A{
	void m1();
}
interface B{
	void m2();
}
interface C{
	void m3();
}
class D implements A,B,C{
	public void m1(){
		
	}
	public void m2(){
		
	}
	public void m3(){
		
	}
}

interface k{
	
}
interface M{
	
}
class E implements M{
	
}














