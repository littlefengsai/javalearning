package day12;

public class Test12 {

	public static void main(String[] args){
		
		//创建厨师对象--多态
		FoodMenu cooker1 = new ChinaCooker();
		FoodMenu cooker2 = new AmericCooker();
		
		//创建顾客对象
		Customer customer = new Customer(cooker1);
		Customer customer2 = new Customer(cooker2);
		
		//顾客点菜
		customer.order();
		customer2.order();
		
	}
}
interface FoodMenu{
	
	//西红柿炒鸡蛋
	void shiZiChaoJiDan();
	
	//鱼香肉丝
	void yuXiangRouSi();
}
//顾客
class Customer{
	private FoodMenu foodMenu;
	
	public Customer(){
		
	}
	public Customer(FoodMenu foodMenu){
		this.foodMenu = foodMenu;
	}
	public FoodMenu getFoodMenu() {
		return foodMenu;
	}
	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}
	
	public void order(){
		FoodMenu fm = this.getFoodMenu();
		fm.shiZiChaoJiDan();
		fm.yuXiangRouSi();
	}
}
//中餐厨师
class ChinaCooker implements FoodMenu{
	
	public void shiZiChaoJiDan(){
		System.out.println("中餐厨师做的西红柿炒鸡蛋");
	}
	
	public void yuXiangRouSi(){
		System.out.println("中餐厨师做的鱼香肉丝");
	}
}
//西餐厨师
class AmericCooker implements FoodMenu{
	
	public void shiZiChaoJiDan(){
		System.out.println("西餐厨师做的西红柿炒鸡蛋");
		
	}
	
	public void yuXiangRouSi(){
		System.out.println("西餐厨师做的鱼香肉丝");
	}
}

















