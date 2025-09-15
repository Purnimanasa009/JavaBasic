/*Write a program to create a class Car with constructor initializing model and price.
Create two objects with different values and print them*/
package Practice.MethodAndConstructor.BasicConstructor;

public class Car {
    String model;
    int price;

    Car(String carModel, int carPrice)

    {
      model = carModel;
      price = carPrice;
    }
    public static void main(String[]args)
    {
        Car bmwrange = new Car("BMW", 500000);
        Car taslarange = new Car("Tasla", 900000);
        System.out.println("BMD Range: " +bmwrange.model + " Price: "  + bmwrange.price );
        System.out.println("Tasla Range: " +taslarange.model + " Price: " + taslarange.price );

    }
}
