package javase.day01;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//创建学生对象
		Student s = new Student();
		
		//访问学生的属性
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		
		s.no = 10;
		s.name = "张三";
		
		//创建学生对象
		Student lisi = new Student();
		lisi.name = "李四";
		System.out.println(lisi.name);
		
	}

}
