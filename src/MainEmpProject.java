import java.util.*;
public class MainEmpProject {

	public static void main(String[] args) {
		
		HashMap<Employee,Project> map=new HashMap<Employee, Project>();
		
		Employee e1=new Employee(1001,"Jack","DBA",40000);
		Employee e2=new Employee(1001,"Jack","DBA",40000);
		
		//Employee e2=new Employee(1002,"Jill","Developer",50000);
		Employee e3=new Employee(1003,"Tom","Tester",40000);
		Employee e4=new Employee(1004,"Jerry","DBA",40000);
 
		Project p1=new Project(501,"AAA","6 Months","IBM");
		Project p2=new Project(502,"BBB","7 Months","TSS");
		Project p3=new Project(503,"CCC","8 Months","WIPRO");
		Project p4=new Project(504,"DDD","9 Months","HSB");
	
	     map.put(e1, p1);
	     map.put(e2, p2);
	     map.put(e3, p3);
	     map.put(e4, p4);
	     
	      System.out.println(map);
		
	}

}
