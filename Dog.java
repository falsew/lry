package Number.java.util;

public class Dog extends animal implements Swim{
    @Override
    public void swim() {
        System.out.printf("狗刨");
    }

    @Override
    public void eat() {
        System.out.printf("吃屎");

    }
}
