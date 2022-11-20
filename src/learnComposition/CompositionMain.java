package learnComposition;

import java.util.Scanner;

public class CompositionMain {

	public static void main(String[] args) {
		DealerShip ds = new DealerShip();
		
		Car hondaCivic=new Car("Honda Civic",2022,29000);
		Car corolla =new Car("Toyota Corolla",2022,29500);
		Car tesla=new Car("Tesla", 2022, 105000);
		
		Scanner sc= new Scanner(System.in);
		//Adding car to dealership
		//ds.addCarsToDealership(tesla);
		
		//System.out.println("Price of car: "+ds.getCar().getPrice());
		
		ds.addCarsToDealership(hondaCivic);
		ds.addCarsToDealership(corolla);
		ds.addCarsToDealership(tesla);
		System.out.println("Which car you want to buy? Available options are Honda Civic,Toyota Corolla and Tesla");
		String carRequested=sc.nextLine();
		System.out.println("price for the car requested is: "+ds.getRequestedCarPrice(carRequested));
		}
}
