import java.util.*;
class Employee{
	String name;	
	int emp_id, salary;	
	void getEmployee(String name){
		System.out.print("Emp ID : " + e.emp_id + "\nSalary : " + e.salary);
	}
}

class Caller{
	public static void main(String ... ag){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of members : ");
		int N = sc.nextInt();
		ArrayList<Employee> obj = new ArrayList<>(N);

		
		for(int i = 0 ; i < N ; i++){
			Employee temp = new Employee();
			System.out.print("Detail for Employee : " + (i+1) +"\n");
			System.out.print("Name : ");
			temp.name = sc.next();
			System.out.print("ID : ");
			temp.emp_id = sc.nextInt();
			System.out.print("Salary : ");
			temp.salary = sc.nextInt();
			obj.add(temp);
		}


		
		System.out.print(obj);


		System.out.print("Enter name to be searched : ");
		String name_search = sc.next();
		

	/*	for(Employee e : obj){
			if( e.getEmployee(name_search) == true){
				System.out.print("Emp ID : " + e.emp_id + "\nSalary : " + e.salary);
				
			}
		}*/

		
	}	
}