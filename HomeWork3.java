package javase.day08;

public class HomeWork3 {

	public static void main(String[] args){
		
		Person p1 = new Person();
		p1.setName("zhangsan");
		p1.setAge(20);
		p1.display();
		Person p2 = new Person("lisi",30);
		p2.display();
	}
}
class Person{
	private String name;
	private int age;
	public Person(){
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display(){
		System.out.println("ĞÕÃû:"+this.getName());
		System.out.println("ÄêÁä:"+this.getAge());
	}
	
}
