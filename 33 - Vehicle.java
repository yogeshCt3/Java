import java.util.Scanner;
class Vehicle{
	Car obj;
	double mileage, price;
	double fuel;
	Vehicle(double m, double p, double s){
		mileage = m;
		price = p;
		fuel = s;
		System.out.print("Enter name of car : ");
		Scanner sc = new Scanner (System.in);
		String temp = sc.next();
		obj = new Car(temp);
	}
	double getFuel(){
		return fuel;
	}

	public void addFuel(double var){
		fuel += var;
	}
	class Car{
		String car_name;
		Car(String name){
			car_name = name;
		}
		void showName(){
			System.out.println("Name : " + car_name);
		}
	}

	void displayResult(){
		System.out.println("Mileage : " + mileage + "\nPrice : " + price + "\nFuel : " + fuel);
		obj.showName();
	}
	
}


class Demo{
	public static void main(String ... lko){
		Scanner sc = new Scanner(System.in);
		double f, p, m;
		System.out.print("Enter mileage : ");
		m = sc.nextDouble();
		System.out.print("Enter price : ");
		p = sc.nextDouble();
		System.out.print("Enter inital Fuel : ");
		f = sc.nextDouble();
		Vehicle v = new Vehicle (m, p, f);

		System.out.print("Enter the amount of fuel to be added  : ");
		f = sc.nextDouble();
		
		v.displayResult();
	}

}