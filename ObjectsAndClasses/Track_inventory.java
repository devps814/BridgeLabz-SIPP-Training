package ObjectsAndClasses;
import java.util.Scanner;

class Item{
	int itemCode;
	String itemName;
	double price;
	
	Item(int Code,String Name,double Cost){
		itemCode = Code;
        itemName = Name;
        price =Cost;
	}
	
	void displayDetails() {
		System.out.println("ItemCode:"+itemCode);
		System.out.println("itemName:"+itemName);
		System.out.println("price:"+price);
	}
	double totalCost(int quantity){
		return price*quantity;
	}
}
public class Track_inventory {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the itemCode:");
		int Code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the itemName:");
		String Name = sc.nextLine();
		System.out.println("Enter the price:");
		double Cost = sc.nextDouble();
		
		Item item = new Item(Code,Name,Cost);
		System.out.println("Enter the Quantity:");
		int quantity = sc.nextInt();
		
		double totalCost = item.totalCost(quantity);
		System.out.println("Total Cost for"+ quantity+"in INR"+totalCost);

	}

}
