package day7;

public class UI {

	public static void main(String[] args) {

		
		Employee e = new Employee();
		e.setId(1);
		e.setName("x");
		e.setDept("hr");
		
		Dao o = new Dao();
		Service s = new Service();
		s.setO(o);
		
		//s.EmployeeFetch(e);
		System.out.println(s.EmployeeFetch(e));
		
		
	}

}
