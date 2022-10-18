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

        {
            while (true) {
                // поверка на совпадение введенной команды и перечеслений Commands
                String userInput = CheckInputConsole.checkingMenuCommandsInput();
                //меню commands: add, list, exit
                Commands userCommand = Commands.valueOf(userInput.toUpperCase().trim());
                switch (userCommand) {
                    case ADD:
                        System.out.println("Введите команду, какое животное добавить(cat/dog/duck)");
                        String animalType = sc.next();
                        Animal animal = null;
                        System.out.println("Какое имя у животного?");
                        String name = sc.next();
                        System.out.println("Какой возраст у животного?");
                        //проверка ввода числа на тип данных int
                        int age = CheckInputConsole.checkInt();
                        System.out.println("Какой вес животного?");
                        int weight = CheckInputConsole.checkInt();
                        System.out.println("Укажите цвет животного?");
                        String color = sc.next();
                        switch (animalType) {
                            case "cat" -> animal = new Cat(name, age, weight, color);
                            case "dog" -> animal = new Dog(name, age, weight, color);
                            case "duck" -> animal = new Duck(name, age, weight, color);
                        }
                        if (animal == null) {
                            System.out.println("Указанный тип животного не найден!");
                            break;
                        }else
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
                }
            }
        }
    }
}









