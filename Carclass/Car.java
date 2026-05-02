public class Car {
    //make the fields

    private String model;
    private String brand;
    private int mileage;

    public Car(String model, String brand, int mileage) {
        this.model = model;
        this.brand = brand;
        this.mileage = mileage;

    }

    //Print model and brand
    public void getInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Brand: " + this.brand);

    }

    //Method to increase mileage by specified amount
    public void drive(int increasedMileageValue) {
        this.mileage =+ increasedMileageValue;

        System.err.println("New mileage: " + this.mileage);
    }


} 

