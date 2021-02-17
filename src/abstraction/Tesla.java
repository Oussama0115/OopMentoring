package abstraction;

public class Tesla extends PowerfulCar implements Car {
    String teslaCarModel = "A3";
    double teslaCarA3Price = 120000;

    public void teslaCarInfo(){System.out.println( "tesla car Information"); }


    public void stopCar() {
        System.out.println(" tesla car has stop feature");

    }

    public void starCar() {
        System.out.println(" tesla car has start feature");
    }

    public void brakeCar() {
        System.out.println(" tesla car has brake feature");
    }

    public void navigation() {
        System.out.println(" tesla car has navigation feature");
    }

    public void engineCar() {
        System.out.println(" tesla car has Engine feature");
    }

    public void autoPark() {
        System.out.println(" tesla car has autopark feature");
    }

    public void selfDrive() {
        System.out.println(" tesla car has self Driven feature");
    }

    public void cameras() {
        System.out.println(" tesla car has cameras feature");
    }

    public void gps() {
        System.out.println(" tesla car has gps feature");
    }

    public void autoLaneControl() {
        System.out.println(" tesla car has autoLaneControl feature");
    }
}

