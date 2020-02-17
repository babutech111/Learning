package new8;
interface Web
{
	static void disp1()
	{
		System.out.println("hello web");
	}
	
	default void disp2()
	{
		System.out.println("hello web");
	}
}

class A implements Web
{
	static void disp10()
	{
		System.out.println("hello web a s");
	}
	
	 public void disp2()
	{
		System.out.println("hello web a n");
	}
	
	
}

class B implements Web
{
	static void disp1()
	{
		System.out.println("hello web b s");
	}
	
	 public void disp2()
	{
		System.out.println("hello web b n");
	}
	
	
}


public class InterfaceDemo {

	public static void main(String[] args) {

		
		Web a = new A();
		Web b = new B();
		
		a.disp2();
		b.disp2();
		//a.disp10()
		//a.disp1();
		Web.disp1();
		
		A o= new A();
		o.disp10();

	}

}
