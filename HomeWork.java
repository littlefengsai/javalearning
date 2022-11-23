package javase.day08;

public class HomeWork {
	
	public static void main(String[] args){
		
		//ͨ���޲���
		Vehicle v = new Vehicle();
		v.setSpeed(0);
		v.setSize(5);
		//ͨ���в�
		Vehicle v1 = new Vehicle(120,5);
		
		//��ӡ����
		System.out.println("�ٶ�:"+v.getSpeed()+"���:"+v.getSize());
		System.out.println("�ٶ�:"+v1.getSpeed()+"���:"+v1.getSize());
		
		//���ü��ٷ���
		v.speedUp(10);
		System.out.println("speed:"+v.getSpeed());
		
		//���ü��ٷ���
		v.speedDown(10);
		System.out.println("speed:"+v.getSpeed());
		
	}
}

class Vehicle{
	
	//�ٶ�
	private int speed;
	//���
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
	
	//�����ٶ�
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//�ƶ�����
	public void move(){
		
		System.out.println("��ͨ���ߣ���������������ʻ");
	}
	
	//���ٷ���
	public void speedUp(int addSpeed){
		this.setSpeed(this.getSpeed() + addSpeed);
	}
	//���ٷ���
	public void speedDown(int subSpeed){
		//�ж�
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



