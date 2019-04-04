import java.util.*;
class Employee{
	int emp_id;
	double salary;
	String name;
	Employee(int e, double s, String n){
		emp_id = e;
		name = n;
		salary = s;
	}
} 	

class Main{
	public static void main(String ... NK){
		Scanner sc = new Scanner(System.in);
		Employee [] obj = new Employee [10];
		/*obj[1] = new Employee(1234, 51.89, "User");
		obj[5] = new Employee(1239, 521.89, "Profile");
		obj[9] = new Employee(1034, 5.189, "Petr");*/
		System.out.print("Number of Employee : ");
		int N = sc.nextInt();
		sc.next();
		int e;
		double s;
		String n;
		for ( int i = 0; i < N ; i++){
			System.out.print("Name : ");
			n = sc.nextLine();
			System.out.print("id : ");
			e = sc.nextInt();
			System.out.print("Salary : ");
			s = sc.nextDouble();
			obj[i] = new Employee(e, s, "n");
		}			
		for(Employee e1 : obj){
			if( e1 != null ){
				System.out.println("Name\t:\t" + e1.name + "\nSalary\t:\t" + e1.salary + "\nid\t:\t" + e1.emp_id);
				System.out.println("____________________________________________________");
			}
		}		
	}
}
	