package stream;
import java.util.ArrayList;
import java.util.Optional;




interface Te
{
	
    int add(int a);
}

public class ArrayListDemo {

	public static void main(String[] args) {

		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajays");    
	      //Invoking arraylist object   
	      System.out.println(list);  
	      
	      
	    //  list.forEach();
	      
	      //Te t=(a)->(a+a);
	      //System.out.println(t.add(2));
	      
	     // list.forEach(x->{ if(x.equals("Vijay"))System.out.println(x);});
	      
	     // list.stream().filter(p->p.equals("Vijay")).forEach(y->System.out.println(y));
	      
	     // list.stream().filter(p->p.endsWith("y")).forEach(x->System.err.println(x));
	      
	     // Boolean v=list.stream().anyMatch(p->p.endsWith("s"));
	      //System.out.println(v);
	      
	    //System.out.println(list.stream().count());
	      
	     //  System.out.println(list.stream().noneMatch(p->p.endsWith("s")));
	     //   System.out.println(  list.stream().filter(p->p.startsWith("R")).count());
	    
	    //list.stream().map(m->m.length()).forEach(x->System.out.println(x));
	      
	      
	  // list.stream().distinct().forEach(s->System.out.println(s));
	//	   list.stream().filter(t->t.endsWith("y")).forEach(System.out::println);
	      
	      ArrayList<Integer> o = new ArrayList();
	      o.add(1);
	      o.add(112);
	      o.add(13);
	      o.add(4);
	      o.add(5);
	      
	      System.out.println(o);
	      
	   Optional<Integer> opt=o.stream().reduce((a,b)->a+b);
	   if(opt.isPresent())
	   {
		   System.out.println(opt.get());
	   }
	   
	   o.stream().sorted().forEach(x->System.out.println(x));
	   
	   System.out.println(o);
	    
	      
	  }  
	}


