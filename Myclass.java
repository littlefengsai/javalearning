
//地址类
class Address
{
	//城市
	String city;
	//街道
	String street;
	//邮编
	String zipcode;
}

//用户类
class User
{
	int no;//基本数据类型
	String name;//引用数据类型
	Address addr;//引用数据类型
}

//顾客类
class Customer
{
	int id;
}

class Product
{
	//编号
	int productNo;
	
	//单价
	double price;
	
}

class car
{
	//总价
	double zongJia;
	
	//品牌
	String pinPai;
	
	//颜色
	String yanSe;
	
	//号牌
	String haoPai;
	
}

class FangWu
{
	//面积
	double mianji;
	
	//户主
	String huzhu;
}

class Ren
{
	//身份证号
	String id;
	
	//姓名
	String name;
	
	//性别
	boolean sex;
	
	//年龄
	int age;
	
}

class BieShu
{
	//面积
	double mianji;
	
	//主人
	Ren zhuRen;
}

class Computer
{
	String brand;
	String style;
	String color;
}

class Student
{
	int no;
	String name;
	Computer notepad;
}