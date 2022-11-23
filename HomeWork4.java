package javase.day08;

public class HomeWork4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime t = new MyTime(3,0,30);
//		t.addHour(1);
//		t.addMinute(60*28);
//		t.addSecond(0);
//		t.display();
		t.subHour(2);
		t.subMinute(2);
		t.subSecond(32);
		t.display();
	}

}
class MyTime{
	private int hour;
	private int minute;
	private int second;
	public MyTime(){
		
	}
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void addSecond(int sec){
		int add = this.getSecond()+sec;
		int tem = 0;
		while(add>=60){
			if(add >= 60){
				tem++;
			}
			add = add-60;
		}
		this.setSecond(add);
		this.addMinute(tem);
		
	}
	public void addMinute(int min){
		int add = this.getMinute()+min;
		int tem = 0;
		while(add>=60){
			if(add >= 60){
				tem++;
			}
			add = add - 60;
		}
		this.setMinute(add);
		this.addHour(tem);
	}
	public void addHour(int hou){
		int add = this.getHour()+hou;
		while(add>=24){
			add = add - 24;
		}
		this.setHour(add);
	}
	public void subSecond(int sec){
		int tem = 0;
		if(this.getSecond()-sec<0){
			tem++;
			int sub = this.getSecond()-sec+60;
			while(sub<0){
				sub = sub + 60;
				tem++;
			}
			this.setSecond(sub);
			this.subMinute(tem);
		}
		else{
			this.setSecond(this.getSecond()-sec);
		}
	}
	public void subMinute(int min){
		int tem = 0;
		if(this.getMinute()-min<0){
			tem++;
			int sub = this.getMinute()-min+60;
			while(sub<0){
				sub = sub + 60;
				tem++;
			}
			this.setMinute(sub);
			this.subHour(tem);
		}
		else{
			this.setMinute(this.getMinute()-min);
		}
	}
	public void subHour(int hou){
		if(this.getHour()-hou<0){
			int sub = this.getHour()-hou+24;
			while(sub<0){
				sub = sub + 24;
			}
			this.setHour(sub);
		}
		else{
			this.setHour(this.getHour()-hou);
		}
	}
	public void display(){
		System.out.println("hour:"+this.getHour());
		System.out.println("Minute:"+this.getMinute());
		System.out.println("second:"+this.getSecond());
	}
	
	
}




