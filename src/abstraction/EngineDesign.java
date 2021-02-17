package abstraction;

public class EngineDesign implements Car{
    String brand = " Bmw";

    String carModel = "x7";
    String modelYear = "2022";
    static double price = 500000;

    public static void carInfo(){
        System.out.println(" this is Engine Design car information");
    }

    public void stopCar() {
        System.out.println(" EngineDesign car has stop feature ");

    }

    public void starCar() {
        System.out.println(" EngineDesign car has start feature ");

    }

    public void brakeCar() {
        System.out.println(" EngineDesign car has brake feature ");
    }

    public void navigation() {
        System.out.println(" EngineDesign car has navigation feature ");
    }

    public void engineCar() {
        System.out.println(" EngineDesign car has  Engine ");
    }
}
