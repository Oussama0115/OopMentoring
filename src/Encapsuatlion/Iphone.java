package Encapsuatlion;

public class Iphone {
   public String name = "Iphone12";
   private int price ;
   private int storage ;
   private String color ;
    private int camera;
   private boolean inStock ;
   // Default Constructor
public Iphone (){

}
//parameterized
public Iphone (int price){
    this.price = price;
}
public Iphone (int price,int storage){
    this.storage = storage;
}
public Iphone (int price, int storage, String color){
    this.color = color;
}
public Iphone (int price , int storage, String color, int camera) {
    this.camera = camera;
}
    public Iphone (int price , int storage, String color, int camera, boolean inStock ){
        this.inStock = inStock;
    }
    // getter method is a return type method
    //  setter method is non return method
// getter
    public int getPrice() {
        return price;
    }
// setter
    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
    public boolean getinStock(){
    return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
