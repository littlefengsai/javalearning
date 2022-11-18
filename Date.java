package javase.day04;

public class Date {
	//����
	private int year;
	private int month;
	private int day;

	
	//���캯��
	//���󣺵�����Ա���������޲����Ĺ��췽����ʱ��Ĭ�ϴ����������ǡ�1970-1-1��
	
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
	
	//�����ṩһ���������Խ����ڴ�ӡ���������̨
	public void print(){
		System.out.println(this.year+"��"+this.month+"��"+this.day+"��");
	
	}
	
}
