public class Java06
{
	public static void main(String[] args)
	{
		User u = new User();
		
		//System.out.println(u.no);
		//System.out.println(u.name);
		//System.out.println(u.addr);
		
		u.no = 110;
		u.name ="jack";
		u.addr = new Address();
		u.addr.city = "����";
		u.addr.street = "����";
		u.addr.zipcode = "1111";
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.name+"��ס���ĸ�����:"+u.addr.city);
		System.out.println(u.name+"��ס���ĸ��ֵ�:"+u.addr.street);
		System.out.println(u.name+"�ʱ�:"+u.addr.zipcode);
		
	}
}