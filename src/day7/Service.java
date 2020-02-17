package day7;

public class Service {

	Dao o;
	
	
	
	public void setO(Dao o) {
		this.o = o;
	}



	public String EmployeeFetch(Employee e)
	{
		
		return o.insert(e);
		
	}
}
