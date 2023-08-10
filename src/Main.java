public class Main {
    public static void main(String[] args)
    {
Car car=new Car();
Motorcycle motorcycle=new Motorcycle();
car.start();
car.stop();
motorcycle.start();
motorcycle.stop();
    }
}
class Vehicle
{
    void start()
    {

    }
    void stop()
    {

    }
}
class Car extends Vehicle
{
    @Override
    void start() {
        System.out.println("Car Started");
    }

    @Override
    void stop() {
        System.out.println("Car Stopped");
    }
}
class Motorcycle extends Vehicle
{
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped.");
    }
}