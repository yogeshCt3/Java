import java.util.*;
interface Person{
	abstract Employee.VoterID getVoterID();
}


class Employee implements Person{
	static int uid = 0;
	class VoterID{
		VoterID(String s){
			name = s;
			id = ++uid;
		}
		String name;
		int id;
		
		void display(){
			System.out.println("Name : " + name +"\nID : " + id);
		}
	}	

	public VoterID getVoterID(){
		System.out.print("Enter Name : ");
		Scanner sc= new Scanner (System.in);
		String s = sc.next();
		return new VoterID(s);
	}	

}

class Main{
	public static void main(String ... lko){
		Employee e1 = new Employee();
		Employee.VoterID p1 = e1.getVoterID();
		Employee e2 = new Employee();
		Employee.VoterID p2 = e2.getVoterID();		
		p1.display();
		p2.display();
	}
	
}