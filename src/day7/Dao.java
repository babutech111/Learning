package day7;

public class Dao {
	
	public String insert(Employee e)
	{
		String sql="insert into empdetails values("+e.getId() +",'"+e.getName()+"','"+e.getDept()+"')";
		return sql;
		
	}

}
