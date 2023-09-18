package _05_access_modifier.practice;

public class E2_StaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);

        Car c2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
class Car{
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine)
    {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getName()
    {
        return name;
    }
    public String getEngine()
    {
        return engine;
    }
}
