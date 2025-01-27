package lab_6_5;

import java.util.Scanner;

public class Human {

    protected int Age;
    protected Scanner scanner;

    public Human()
    {
        scanner = new Scanner(System.in);
    }

    public void inputAge() {
        System.out.print("Class Human. \nВведите возраст пользователя: ");
        Age = scanner.nextInt();
        System.out.println("Возраст пользователя= : " + Age);
    }
}

