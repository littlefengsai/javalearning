package javase.day08;

public class HomeWork {
	
	public static void main(String[] args){
		
		//通过无参数
		Vehicle v = new Vehicle();
		v.setSpeed(0);
		v.setSize(5);
		//通过有参
		Vehicle v1 = new Vehicle(120,5);
		
		//打印属性
		System.out.println("速度:"+v.getSpeed()+"体积:"+v.getSize());
		System.out.println("速度:"+v1.getSpeed()+"体积:"+v1.getSize());
		
		//调用加速方法
		v.speedUp(10);
		System.out.println("speed:"+v.getSpeed());
		
		//调用减速方法
		v.speedDown(10);
		System.out.println("speed:"+v.getSpeed());
		
	}
}

class Vehicle{
	
	//速度
	private int speed;
	//体积
	private int size;
	
	public Vehicle(){
		
	}

	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}
	
	//设置速度
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//移动方法
	public void move(){
		
		System.out.println("交通工具：公共汽车，起步行驶");
	}
	
	//加速方法
	public void speedUp(int addSpeed){
		this.setSpeed(this.getSpeed() + addSpeed);
	}
	//减速方法
	public void speedDown(int subSpeed){
		//判断
		int oldSpeed = this.getSpeed();
		int speed = oldSpeed - this.getSpeed();
		if(speed < 0){
			this.setSpeed(0);
		}
		else{
			this.setSpeed(speed);
		}
	}
	
}



