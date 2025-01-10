package lab_5;

public class lab_5_3 {
    public static void  printlab_5_3(String str) {
        System.out.println("\nЛаб. 5-3:");
        System.out.println( "Исходный текст: \t"+ str);
//        String builder = str;
        String str_replace = str.replace("бяка","[вырезано цензурой]");
        System.out.println( "Измененный текст: \t"+ str_replace);
    }
}
