public class Java07
{
	/*
	public static void main(String[] args)
	{
		//Customer c = new Customer();
		//System.out.println(c.id);
		
		//����������Ʒ����
		Product iphone7 = new Product();
		
		//����ʵ���������﷨������.������
		System.out.println("��Ʒ�ı��:"+iphone7.productNo);
		System.out.println("��Ʒ�ĵ���:"+iphone7.price);
		
		//�޸ģ�����.������ = ֵ
		iphone7.productNo = 111;
		iphone7.price = 6800;
		System.out.println("��Ʒ�ı��:"+iphone7.productNo);
		System.out.println("��Ʒ�ĵ���:"+iphone7.price);
	
	
	}
	*/
	/*
	public static void main(String[] args)
	{
		//�ȴ�����
		Ren zhangsan = new Ren();
		
		zhangsan.id = "123";
		zhangsan.name = "����";
		zhangsan.sex = true;
		zhangsan.age = 100;
		
		//�ٴ�����������
		BieShu fangZi = new BieShu();
		
		fangZi.mianji = 500;

		//�ñ���������
		fangZi.zhuRen = zhangsan;
		
		
		//��֪���������˵�������ʲô��
		System.out.println("���ӵ�����:"+fangZi.zhuRen.name);
		
		//���ӻ�������
		//����һ���µ����˶���
		Ren lisi = new Ren();
		lisi.name = "����";
		
		//������
		fangZi.zhuRen = lisi;
		System.out.println("���ӵ�����:"+fangZi.zhuRen.name);
		
	}
	*/
	public static void main(String[] args)
	{
		Computer biJiBen = new Computer();
		
		biJiBen.brand = "ipad";
		biJiBen.style = "C00";
		biJiBen.color = "black";
		
		
		Student zhangsan = new Student();
		zhangsan.name = "����";
		zhangsan.no = 123;
		zhangsan.notepad = biJiBen;
		
		System.out.println(zhangsan.name+"�ıʼǱ���Ʒ���ǣ�"+zhangsan.notepad.brand);
	}
	
}