package ObjectsAndClasses;
import java.util.*;

class MobilePhone{
	String brand;
	String Model;
	double price;
	
	MobilePhone(String brand,String Model,double price){
		this.brand = brand;
		this.Model = Model;
		this.price = price;
	}
	 void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + Model);
	        System.out.println("Price: ₹" + price);
	    }
	
}

public class Phone_Details {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of brand:");
		String brand = sc.nextLine();
		System.out.println("Enter the model");
		String Model = sc.nextLine();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		
		MobilePhone Phone = new MobilePhone(brand,Model,price);
		
		System.out.println("Mobile Phone details");
		Phone.displayDetails();
		
		
	}

}
