package animals.birds;

public class Duck extends animals.Animal implements animals.birds.Flying {
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public void say() {
        System.out.println("КРЯ");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
