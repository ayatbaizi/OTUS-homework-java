package Animals.Pets;

public class Cat extends Animal {

    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }


    @Override
    protected void say() {
        System.out.println("МЯУ");

    }
}
