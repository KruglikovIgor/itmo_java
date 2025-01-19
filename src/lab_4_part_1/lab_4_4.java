package lab_4_part_1;

import java.util.Scanner;

public class lab_4_4 {
    public static boolean printlab_4_4 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nЛаб. 4-4: \n"+
                "Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число:");
        int num3 = scanner.nextInt();

       return num2>num1&&num3>num2; }
      }
