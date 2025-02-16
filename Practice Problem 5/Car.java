class Car 
{
    private String owner;
    private String brand;
    private String serialNo;
    private double fuelLevel;

    public Car(String owner, String brand, String serialNo, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNo = serialNo;
        this.fuelLevel = fuelLevel;
    }

    public void start() {
        if (fuelLevel > 0) 
        {
            System.out.println("Car started.");
        } 
        else 
        {
            System.out.println("Cannot start. Fuel empty.");
        }
    }

    public void stop() 
    {
        System.out.println("Car stopped.");
    }

    public void checkFuel() 
    {
        System.out.println("Fuel level: " + fuelLevel + " liters");
    }

    public void refuel(double amount) 
    {
        fuelLevel += amount;
        System.out.println("Refueled. Current fuel level: " + fuelLevel + " liters");
    }

    public static void main(String[] args) 
    {
        Car car = new Car("John Doe", "Toyota", "123ABC", 10);
        car.checkFuel();
        car.start();
        car.stop();
        car.refuel(5);
        car.checkFuel();
    }
}
