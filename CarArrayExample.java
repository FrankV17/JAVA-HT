
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Car {

    int id;
    String make;
    String model;
    int yearOfManufacture;
    String color;
    double price;
    String registrationNumber;

    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public void displayCarDetails() {
        System.out.println("Car ID: " + id);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Registration Number: " + registrationNumber);
    }
}

public class CarArrayExample {

    public static void main(String[] args) {

        Car[] cars = new Car[6];

        cars[0] = new Car(1, "Toyota", "Camry", 2023, "Blue", 25000, "MH12 AB 1234");
        cars[1] = new Car(2, "Honda", "City", 2022, "Red", 18000, "MH12 CD 4567");
        cars[2] = new Car(3, "Hyundai", "Verna", 2021, "White", 16000, "MH12 EF 7890");
        cars[3] = new Car(4, "Ford", "Focus", 2016, "Red", 22000, "MH12 JK 0121");
        cars[4] = new Car(5, "Volkswagen", "Golf", 2018, "White", 30000, "MH12 DJ 1286");
        cars[5] = new Car(6, "Honda", "Civic", 2014, "Green", 20000, "MH01 B0 0010");

        
        for (Car car : cars) {
            car.displayCarDetails();
            System.out.println();
        }

       String fp = "Car_list.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fp))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();  // Write a new line after each car's details
            }

            System.out.println("Car information saved to " +  fp);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }
}


/* Answer for HT2 B) -

    String modelToFilter = "Toyota";
    int currentYear = Year.now().getValue();
    int thresholdYear = currentYear - n;

    String fp1 = "Car_List2.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(modelToFilter) && car.getYearOfManufacture() <= thresholdYear) {
                    writer.write(car.toString());
                    writer.newLine();
                }
            }
            System.out.println("Filtered car information saved to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }  */

/* Answer to HT2 C)
    int yearToFilter = X; year of manufacture
    double priceThreshold = Y; Value Threshold
    
    String filePath = "Car_List3.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == yearToFilter && car.getPrice() > priceThreshold) {
                    writer.write(car.toString());
                    writer.newLine();
                }
            }
            System.out.println("Filtered car information saved to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } */


