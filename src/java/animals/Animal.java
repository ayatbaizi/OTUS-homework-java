package animals;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;


    public Animal(String name, int age, int weight, String color) {
        inputAnimalParametr();
        this.name = getName();
        this.age = getAge();
        this.weight = getWeight();
        this.color = getColor();

        //System.out.println(name, age, weight, color);
    }
    public void inputAnimalParametr() {
        Scanner sc = new Scanner(System.in);
       /* name = sc.next();
        age = sc.nextInt();
        weight = sc.nextInt();
        color = sc.next();*/
        setName(name = sc.next());
        setAge(age = sc.nextInt());
        setWeight(weight = sc.nextInt());
        setColor(color = sc.next());
    }



   /* public void inputAnimalParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое имя у животного?");
        String name = sc.next();
        System.out.println("Какой возраст у животного?");
        int age = sc.nextInt();
        System.out.println("Какой вес животного?");
        int weight = sc.nextInt();
        System.out.println("Укажите цвет животного?");
        String color = sc.next();
    }*/


    /*public static void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое имя у животного?");
        String name = sc.next();
        System.out.println("Какой возраст у животного?");
        int age = sc.nextInt();
        System.out.println("Какой вес животного?");
        int weight = sc.nextInt();
        System.out.println("Укажите цвет животного?");
        String color = sc.next();

    }*/
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

    public void say() {
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

