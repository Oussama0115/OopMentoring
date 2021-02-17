package abstraction;
// Abstract class: is a restricted class that cannot be used to create objects
// Abstract method: can only be used in an abstract class
public abstract class PowerfulCar {
    String powerfulCarBrand = "Audi";
    double powerfulCarPrice = 55000;

    // Abstract method
    public abstract void autoPark();
    public abstract void selfDrive();
    public abstract void cameras();
    public abstract void gps();
    public abstract void autoLaneControl();


    public void remoteStart() {
        System.out.println( " Powerful Car has Remote start feature");
    }

}
