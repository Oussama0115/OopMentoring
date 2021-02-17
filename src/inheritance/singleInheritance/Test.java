package inheritance.singleInheritance;

public class Test {
    public static void main(String[] args) {
        Audi obj= new Audi();
        System.out.println(obj.price);
        obj.maxSpeed();
        obj.color();
        obj.carDoors();
        System.out.println(obj.Safety);
        System.out.println(obj.size);
        obj.vinNumber= 51567;
        System.out.println(obj.vinNumber);
        obj.color();





    }
}
