package Encapsuatlion;

public class Test {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println(iphone.name);
        iphone.setPrice(1200);
        System.out.println(iphone.getPrice());
        iphone.setCamera(3);
        System.out.println(iphone.getCamera());
        iphone.setColor("black");
        System.out.println(iphone.getColor());
        iphone.setInStock(true);
        System.out.println(iphone.getinStock());
        iphone.setStorage(256);
        System.out.println(iphone.getStorage());

    }
}
