import java.util.*;
enum Doctors{
	d1("Dr chopra", "Ortho", 789), d2("Dr Metha", "ENT", 599), d3("Dr Basu", "OPD", 799);
	String name, specialization;
	int fee;
	Doctors(String n, String sp, int f){
		name = n;
		specialization = sp;
		fee = f;
	}
	
} 	

class Main{
	public static void main(String...a){
			Scanner sc = new Scanner(System.in);
			System.out.println("\t Doctor Name");
			for(Doctors d : Doctors.values())
				System.out.println(d);
			System.out.print("Enter the doctor name : ");
			String doc = sc.next();
			Doctors d = Doctors.valueOf(doc);
			//System.out.println(d.name + "\t" + d.specialization + "\t" + d.fee);
			switch(d){
				case d1 : System.out.println(d.name + "\t" + d.specialization + "\t" + d.fee); break;
				case d2 : System.out.println(d.name + "\t" + d.specialization + "\t" + d.fee); break;
				case d3 : System.out.println(d.name + "\t" + d.specialization + "\t" + d.fee); break;
			}
	
	}
}
	