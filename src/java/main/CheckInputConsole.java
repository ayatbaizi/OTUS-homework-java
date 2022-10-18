package main;

import data.Commands;

import java.util.Scanner;

public class CheckInputConsole {
    public static int checkInt() {
        int number = 0;
        boolean c = false;
        Scanner sc = new Scanner(System.in);
        while (!c) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                c = true;
            } else {
                System.out.println("Неверно!!! Было введено не число, либо слишком большое число. Введите число:");
                sc.nextLine();
            }
        }
        return number;
    }
    public static String checkingMenuCommandsInput() {
        String userInputs;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            // поверка на совпадение введенной команды и перечеслений Commands
            System.out.println("Введите команду(add/list/exit): ");
            userInputs = sc.next();
            for (Commands commands : Commands.values()) {
                if (userInputs.equalsIgnoreCase(commands.name())) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Неверная команда! Введите корректную команду!");
                continue;
            }
            return userInputs;
        }
    }

}






