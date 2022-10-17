package main;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

//menu commands: add, list, exit
        {
            while (true) {
                boolean check = false;
                System.out.println("Введите команду(add/list/exit): ");
                String userInput = sc.next();
                for (Commands commands : Commands.values()) {
                    if (userInput.equalsIgnoreCase(commands.name())) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Неверная команда! Введите корректную команду!");
                } else {
                    Commands userCommand = Commands.valueOf(userInput.toUpperCase().trim());
                    switch (userCommand) {
                        case ADD:
                            System.out.println("Какое животное(cat/dog/duck) добавить?");
                            String animalType = sc.next();
                            Animal animal = null;
                            System.out.println("Какое имя у животного?");
                            String name = sc.next();
                            System.out.println("Какой возраст у животного?");
                            int age = sc.nextInt();
                            System.out.println("Какой вес животного?");
                            int weight = sc.nextInt();
                            System.out.println("Укажите цвет животного?");
                            String color = sc.next();
                            switch (animalType) {
                                case "cat" -> animal = new Cat(name, age, weight, color);
                                case "dog" -> animal = new Dog(name, age, weight, color);
                                case "duck" -> animal = new Duck(name, age, weight, color);
                            }
                            animal.say();
                            animals.add(animal);
                            if (animal instanceof Duck) {
                                ((Duck) animal).fly();
                            }
                            break;
                        case LIST:
                            for (Animal anim : animals) {
                                System.out.println(anim);
                            }
                            break;
                        case EXIT:
                            System.out.println("Программа заверешена");
                            System.exit(0);
//                    default:
//                        System.out.println("Неверная команда, используйте add, list, exit");

                    }
                }
            }

        }
    }
}









