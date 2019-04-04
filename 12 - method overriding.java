class Person{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;	
		this.age = age;
	}
	void showDetails(){
		System.out.println(name + "\n" + age);
	}
}

class Student extends Person{
	double cgpa;
	Student(int age, String name,double cgpa){
		super(name, age);
		this.cgpa = cgpa;
	}
	void showDetails(){
		System.out.println(name + "\n" + cgpa + "\n" + age);
	}
}
class PartTimeStudent extends Student{
	PartTimeStudent(int age, String name, double cgpa){
		super(age, name, cgpa);
	}
	void getResult(){
		System.out.println(cgpa);
	}
}
class Driver{
	public static void main(String ... ykc){
		Student[] obj = new Student[5];
		obj[0] = new Student(20, "Yogesh", 9.8);
		obj[1] = new PartTimeStudent(18, "Bharat", 8.9);
		obj[2] = new Student(24, "User", 8.8);
		obj[3] = new PartTimeStudent(78, "Old", 3.1);
		obj[4] = new Student(9, "Kid", 8);
		for(Student s : obj){
			if(s instanceof PartTimeStudent){
				PartTimeStudent k = (PartTimeStudent) s;
				k.getResult();
			}
			else
				s.showDetails();
			System.out.println("\n__________________________\n");
		}		
	}
}