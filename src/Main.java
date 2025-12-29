public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Akzhan", "ID777");
        Driver driver2 = new Driver("Ivan", "ID123");

        Car myCar = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle myBike = new Motorcycle("BMW", 2023, false);
        Truck myTruck = new Truck("Volvo", 2020, 15.5, 3);

        myCar.setDriver(driver1);
        myBike.setDriver(driver2);
        myTruck.setDriver(driver1);

        Vehicle[] vehicles = {myCar, myBike, myTruck};

        for (Vehicle v : vehicles) {
            v.displayInfo();
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }
            v.startEngine();
            v.stopEngine();
            System.out.println("--------------------");
        }
    }
}