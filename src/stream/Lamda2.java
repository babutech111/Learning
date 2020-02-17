package stream;

@FunctionalInterface
interface My
{
	int add(int a);
}

class Test implements My
{

	public int add(int a) {
		System.out.println("hello ");
		return a+10;
	}
	
}
public class Lamda2 {

	public static void main(String[] args) {

	Test t = new Test();
  My m=t::add;
  System.out.println(m.add(3));
  
 
		
	}

}
