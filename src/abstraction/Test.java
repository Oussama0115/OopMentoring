package abstraction;

public class Test {
    public static void main(String[] args) {
        EngineDesign ed = new EngineDesign();
        ed.starCar();
        ed.stopCar();
        ed.brakeCar();
        System.out.println(ed.brand);
        Tesla tesla = new Tesla();
        tesla.autoLaneControl();
        tesla.cameras();
        tesla.gps();
        tesla.navigation();
        tesla.selfDrive();
        tesla.teslaCarInfo();
    }
}
