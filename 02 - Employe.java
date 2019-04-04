class Employee{
	private int empid, salary;
	private static int emp_temp = 1; //assign any value for temporary ID
	private String name;
	//getter functions
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public int getEmpID(){
		return empid;                                                                                                                  
	}
	//setter functions
	public void setSalary(int sal){                                                                                                
		salary = sal;
		empid =  emp_temp++;
		
	}
	public void setName(String nme){
		name = nme;
	}	
}
//class is a template of which objects are created.    
class EmpDemo{
	public static void main(String...ykc){
		Employe o0 = new Employe();
		o0.setSalary(888);
		Employe o1 = new Employe();	//created a object of employe                           
		o1.setName("Yogesh Chhetri");	
		o1.setSalary(999999);
		System.out.println(o1.getName());
		System.out.println(o1.getSalary());
		System.out.println(o1.getEmpID()); 		
	}
}