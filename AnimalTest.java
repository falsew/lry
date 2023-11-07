package Number.java.util;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        Animal[] animals = new Animal[3];
        animals[0] = test.new Animal("liuruyi", "dying", "happy");
        animals[1] = test.new Animal("luoxiaohei", "lying", "lazy");
        animals[2] = test.new Animal("meme", "running", "activitly");
        for (Animal a : animals)
            System.out.println("name=" + a.getName() + ",action=" + a.getAction() + ",emotion=" + a.getEmotion());
    }

    class Animal {
        private String name;
        private String action;
        private String emotion;

        public Animal(String n, String a, String e) {
            name = n;
            action = a;
            emotion = e;
        }

        public String getName() {
            return name;
        }

        public String getAction() {
            return action;
        }
        public String getEmotion(){
            return emotion;

        }
    }
}
