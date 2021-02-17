package abstraction;

public interface Car {
    //Interface: Interface is a guideline for future
    // Interface is 100% Abstract
    // in Interface we can not declare variable but we can declare and assign value during creating variable
    // we can not create method with body but we can declare a method without body.
    String carName = "Honda";
    String price = "21000";


    String brand = "Toyota";
    String seat = "4";
    String headLight ="6";
    boolean gasTank = true;
    // Method Declare : Abstract
    public void stopCar();
    public void starCar();
    public void brakeCar();
    public void navigation();
    public void engineCar();



}
