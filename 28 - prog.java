import java.io.*;
import java.util.*;
class Car implements Serializable{
	String name;
	double mileage, price;
	Car(String n, double m, double p){
		name = n;
		mileage = m;
		price = p;
	}
	void show(){
		System.out.println("Name : " + name + "\nMileage : " + mileage + "\nPrice : " + price + "\n___________________________\n");
	}	
}

class Main{
	public static void main(String ... yogesh) throws IOException, ClassNotFoundException{
		Car c1 = new Car("Centro", 23.9, 98712.10), c2 = new Car("Alto", 17.9, 89123.13), c3 = new Car("Scorpio", 5.6, 1000000.3);
		Car c4 = new Car("BMW", 0.4, 9999999.12), c5 = new Car("Custom", 7.8, 999121.313);
		FileOutputStream fout = new FileOutputStream("mycar.doc", true);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(c1);	
		out.writeObject(c2);
		out.writeObject(c3);
		out.writeObject(c4);
		out.writeObject(c5);
		
		FileInputStream fin = new FileInputStream("mycar.doc");
		ObjectInputStream ok = new ObjectInputStream(fin);
	
		System.out.print("Enter mlg : ");
		Scanner sc  = new Scanner (System.in);
		double z= sc.nextDouble();

		Car n1 = (Car) ok.readObject();
		if(n1.mileage > z)
			n1.show();

		Car n2 = (Car) ok.readObject();
		if(n2.mileage > z)
			n2.show();


		Car n3 = (Car) ok.readObject();
		if(n3.mileage > z)
			n3.show();

		Car n4 = (Car) ok.readObject();
		if(n4.mileage > z)
			n4.show();

		Car n5 = (Car) ok.readObject();
		if(n5.mileage > z)
			n5.show();
		
	}
}