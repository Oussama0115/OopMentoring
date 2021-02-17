package inheritance.multiLevel;

public class Test {
    public static void main(String[] args) {
        Son obj = new Son();
        System.out.println(obj.sport);
        obj.swim();
        obj.fishing();
        obj.hiking();
        obj.tellStories();
        obj.tellStories();
        System.out.println(obj.id);
        obj.dancing();
        obj.playGame();
        obj.jump();
        obj.loveAnimals();

    }
}
