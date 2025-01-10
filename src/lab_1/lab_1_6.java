package lab_1;

import java.util.Scanner;

public class lab_1_6 {
    public static void printlab_1_6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лаб. 1-6: \n"+
                            "Введите целое число:");
        int b = scanner.nextInt();
        if (b % 2 == 0) {System.out.println("Число " + b + " четное");}
        else
            if (b>100) {System.out.println("Число " + b + " выходит за пределы диапазона");}
            else {System.out.println("Число " + b + " нечетное");};
    }
}
