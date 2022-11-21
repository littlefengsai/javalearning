package javase.day06;

//public class Master {
//
//	//喂养宠物
//	public void feed(Cat c){
//		c.eat();
//	}
//	public void feed(Dog d){
//		d.eat();
//	}
//}//扩展力太差，添加新的宠物，Master类就需要添加新的方法

public class Master{
	
	public void feed(Pet pet){
		pet.eat();
	}
}
