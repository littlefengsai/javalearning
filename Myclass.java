
//��ַ��
class Address
{
	//����
	String city;
	//�ֵ�
	String street;
	//�ʱ�
	String zipcode;
}

//�û���
class User
{
	int no;//������������
	String name;//������������
	Address addr;//������������
}

//�˿���
class Customer
{
	int id;
}

class Product
{
	//���
	int productNo;
	
	//����
	double price;
	
}

class car
{
	//�ܼ�
	double zongJia;
	
	//Ʒ��
	String pinPai;
	
	//��ɫ
	String yanSe;
	
	//����
	String haoPai;
	
}

class FangWu
{
	//���
	double mianji;
	
	//����
	String huzhu;
}

class Ren
{
	//���֤��
	String id;
	
	//����
	String name;
	
	//�Ա�
	boolean sex;
	
	//����
	int age;
	
}

class BieShu
{
	//���
	double mianji;
	
	//����
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