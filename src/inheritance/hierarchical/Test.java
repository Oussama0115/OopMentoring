package inheritance.hierarchical;


public class Test {
    public static void main(String[] args) {
        Daughter dg = new Daughter();
        System.out.println(dg.hair);
        System.out.println(dg.age);
        dg.shoping();
        Son so = new Son();
        System.out.println(so.age);
        System.out.println(so.lastName);
        so.eyesColor();

    }
}
