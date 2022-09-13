package Animals;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void say() {
        System.out.println("Я говорю");
    }

    protected void go() {
        System.out.println("Я иду");
    }

    protected void drink() {
        System.out.println("Я пью");
    }

    protected void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        int age = getAge();
        int ageLastNumber = age % 10;
        String old = "";

        if (ageLastNumber == 1)
            old = " год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = " лет";
        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
            old = " года";
        return "Привет! меня зовут " + name +
                ", мне " + age + old +
                ", я вешу - " + weight +
                " кг, мой цвет - " + color;
    }
}
