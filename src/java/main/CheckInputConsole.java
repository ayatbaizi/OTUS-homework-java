package main;

import data.Commands;

import java.util.Scanner;

public class CheckInputConsole {
   public static int checkInt(Scanner sc) {
      int number = 0;
      sc.nextLine();
      boolean isInt = false;
      while (!isInt) {
         if (sc.hasNextInt()) {
            number = sc.nextInt();
            isInt = true;
         } else {
            System.out.println("Неверно!!! Было введено не число, либо слишком большое число. Введите число:");
            sc.nextLine();
         }
      }
      return number;
   }

   public static String checkingMenuCommandsInput(Scanner sc) {
      String userInputs;
      boolean check = false;
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






