package javase.day01;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//����ѧ������
		Student s = new Student();
		
		//����ѧ��������
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		
		s.no = 10;
		s.name = "����";
		
		//����ѧ������
		Student lisi = new Student();
		lisi.name = "����";
		System.out.println(lisi.name);
		
	}

}
