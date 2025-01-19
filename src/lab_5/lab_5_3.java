package lab_5;

public class lab_5_3 {
    public static void  printlab_5_3(String str, String target, String replace) {
        System.out.println("\nЛаб. 5-3:");
        System.out.println( "Исходный текст: \t"+ str);
        System.out.println( "Заменяемое выражение: \t"+ target);
        System.out.println( "Заменитель: \t"+ replace);
        String str_replace = str.replace(target,replace);
        System.out.println( "Измененный текст: \t"+ str_replace);
    }
}
