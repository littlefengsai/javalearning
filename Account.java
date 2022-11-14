package javase.day02;

public class Account {
	
	//’À∫≈
	private String actno;
	
	//”‡∂Ó
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
