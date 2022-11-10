public class Java07
{
	/*
	public static void main(String[] args)
	{
		//Customer c = new Customer();
		//System.out.println(c.id);
		
		//创建对象，商品对象
		Product iphone7 = new Product();
		
		//访问实例变量的语法：引用.变量名
		System.out.println("商品的编号:"+iphone7.productNo);
		System.out.println("商品的单价:"+iphone7.price);
		
		//修改：引用.变量名 = 值
		iphone7.productNo = 111;
		iphone7.price = 6800;
		System.out.println("商品的编号:"+iphone7.productNo);
		System.out.println("商品的单价:"+iphone7.price);
	
	
	}
	*/
	/*
	public static void main(String[] args)
	{
		//先创建人
		Ren zhangsan = new Ren();
		
		zhangsan.id = "123";
		zhangsan.name = "张三";
		zhangsan.sex = true;
		zhangsan.age = 100;
		
		//再创建别墅对象
		BieShu fangZi = new BieShu();
		
		fangZi.mianji = 500;

		//让别墅有主人
		fangZi.zhuRen = zhangsan;
		
		
		//想知道房子主人的名字是什么？
		System.out.println("房子的主人:"+fangZi.zhuRen.name);
		
		//房子换主人了
		//创建一个新的主人对象
		Ren lisi = new Ren();
		lisi.name = "李四";
		
		//换主人
		fangZi.zhuRen = lisi;
		System.out.println("房子的主人:"+fangZi.zhuRen.name);
		
	}
	*/
	public static void main(String[] args)
	{
		Computer biJiBen = new Computer();
		
		biJiBen.brand = "ipad";
		biJiBen.style = "C00";
		biJiBen.color = "black";
		
		
		Student zhangsan = new Student();
		zhangsan.name = "张三";
		zhangsan.no = 123;
		zhangsan.notepad = biJiBen;
		
		System.out.println(zhangsan.name+"的笔记本的品牌是："+zhangsan.notepad.brand);
	}
	
}