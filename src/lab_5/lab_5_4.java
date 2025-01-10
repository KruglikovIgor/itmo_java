package lab_5;

public class lab_5_4 {
    public static int  printlab_5_4(String str, String str1) {
        System.out.println("\nЛаб. 5-4:");
        System.out.println( "Основной текст: \t"+ str);
        System.out.println( "Текст для поиска: \t"+ str1);
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(str1, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
}
