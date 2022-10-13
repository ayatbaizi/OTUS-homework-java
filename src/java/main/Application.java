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
                System.out.println("������� �������(add/list/exit): ");
                Commands userCommand = Commands.valueOf(sc.next().toUpperCase().trim());
                switch (userCommand) {
                    case ADD:
                        System.out.println("����� ��������(cat/dog/duck) ��������?");
                        String animalType = sc.next();
                        if (animalType.equals("cat")) {
                            inputAnimalParametrs();
                            System.out.println("����� ��� � ���������?");
                            String name = sc.next();
                            System.out.println("����� ������� � ���������?");
                            int age = sc.nextInt();
                            System.out.println("����� ��� ���������?");
                            int weight = sc.nextInt();
                            System.out.println("������� ���� ���������?");
                            String color = sc.next();
                            Cat animal = new Cat(name, age, weight, color);
                            animal.say();
                            animals.add(animal);
                        } else if (animalType.equals("dog")) {
                            System.out.println("����� ��� � ���������?");
                            String name = sc.next();
                            System.out.println("����� ������� � ���������?");
                            int age = sc.nextInt();
                            System.out.println("����� ��� ���������?");
                            int weight = sc.nextInt();
                            System.out.println("������� ���� ���������?");
                            String color = sc.next();
                            Dog animal = new Dog(name, age, weight, color);
                            animal.say();
                            animals.add(animal);
                        } else if (animalType.equals("duck")) {
                            System.out.println("����� ��� � ���������?");
                            String name = sc.next();
                            System.out.println("����� ������� � ���������?");
                            int age = sc.nextInt();
                            System.out.println("����� ��� ���������?");
                            int weight = sc.nextInt();
                            System.out.println("������� ���� ���������?");
                            String color = sc.next();
                            Duck animal = new Duck(name, age, weight, color);
                            animal.say();
                            animal.fly();
                            animals.add(animal);
                        }
                        break;
                    case LIST:
                        for (Animal animal : animals) {
                            System.out.println(animal);
                        }
                        break;
                    case EXIT:
                        System.out.println("��������� ����������");
                        System.exit(0);
                    default:
                        System.out.println("�������� �������, ����������� add, list, exit");
                }
            }
        }

    }

    public static void inputAnimalParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("����� ��� � ���������?");
        String name = sc.next();
        System.out.println("����� ������� � ���������?");
        int age = sc.nextInt();
        System.out.println("����� ��� ���������?");
        int weight = sc.nextInt();
        System.out.println("������� ���� ���������?");
        String color = sc.next();
    }
}

