package learnComposition;

public class Car {

	private String carModel;
	private int modelYear;
	private double price;

	public Car(String carModel, int modelYear, double price) {
		super();
		this.carModel = carModel;
		this.modelYear = modelYear;
		this.price = price;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getModelYear() {
		return modelYear;
	}

	public double getPrice() {
		return price;
	}
	

}
