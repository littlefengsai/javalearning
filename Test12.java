package day12;

public class Test12 {

	public static void main(String[] args){
		
		//������ʦ����--��̬
		FoodMenu cooker1 = new ChinaCooker();
		FoodMenu cooker2 = new AmericCooker();
		
		//�����˿Ͷ���
		Customer customer = new Customer(cooker1);
		Customer customer2 = new Customer(cooker2);
		
		//�˿͵��
		customer.order();
		customer2.order();
		
	}
}
interface FoodMenu{
	
	//������������
	void shiZiChaoJiDan();
	
	//������˿
	void yuXiangRouSi();
}
//�˿�
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
//�вͳ�ʦ
class ChinaCooker implements FoodMenu{
	
	public void shiZiChaoJiDan(){
		System.out.println("�вͳ�ʦ����������������");
	}
	
	public void yuXiangRouSi(){
		System.out.println("�вͳ�ʦ����������˿");
	}
}
//���ͳ�ʦ
class AmericCooker implements FoodMenu{
	
	public void shiZiChaoJiDan(){
		System.out.println("���ͳ�ʦ����������������");
		
	}
	
	public void yuXiangRouSi(){
		System.out.println("���ͳ�ʦ����������˿");
	}
}

















