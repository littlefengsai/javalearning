package javase.day04;

public class Chinese {
	
	//身份证号
	String id;
	
	//姓名
	String name;
	
//	//国籍
//	String country;
	//因为每个由Chinese类创建的对象国籍都一样，所以可以将country设置为静态变量
	//静态变量在类加在的时候初始化，不需要创建对象，内存就开辟了。
	//静态变量存储在方法区内存当中
	static String country = "中国";
	
	//构造函数
	public Chinese(){
		
	}
	
	public Chinese(String id,String name){
		this.id = id;
		this.name = name;
//		this.country  = country;
	}
	
	
}

