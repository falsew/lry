package Number.java.util;

public class Frog extends animal implements Swim{
    @Override
    public void swim() {
        System.out.printf("青蛙在吃蚊子");

    }

    @Override
    public void eat() {
        System.out.printf("chi");

    }
}
