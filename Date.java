package javase.day04;

public class Date {
	//属性
	private int year;
	private int month;
	private int day;

	
	//构造函数
	//需求：当程序员调用以下无参数的构造方法的时候，默认创建的日期是“1970-1-1”
	
	public Date() {
		//this.year = 1970;
		//this.month = 1;
		//this.day = 1;
		this(1970,1,1);
	}
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//setter and getter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}	
	
	//对外提供一个方法可以将日期打印输出到控制台
	public void print(){
		System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
	
	}
	
}
