import java.util.*;
class Employe{
	double cgpa;
	String name;
	long phone_number;
	void showDetails(){
		System.out.println(name + "\n" + cgpa + "\n" + phone_number);
	}	
}
class Main{
	public static void main(String [] user){
		Employe obj = new Employe();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : ");
		obj.name = sc.nextLine();
		System.out.println("CGPA: ");
		obj.cgpa = sc.nextDouble();
		System.out.println("Phone Number: ");
		obj.phone_number = sc.nextLong();
		obj.showDetails();
	}
}