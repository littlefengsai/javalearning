package javase.day02;

public class Account {
	
	//�˺�
	private String actno;
	
	//���
	private double balance;

	public Account(String s,double d){
		actno = s;
		balance = d;
	}
	
	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
