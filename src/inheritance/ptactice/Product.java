package inheritance.ptactice;

public class Product {
    int pid;
    String name;
    int price;
    // Constructor
    Product(){
    }
    // To write data in Product Object we have this Method
   public void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

}
