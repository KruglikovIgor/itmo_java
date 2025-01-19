package lab_5;

public class lab_5_1 {
    public static String  printlab_5_1(String str) {
        System.out.println("Лаб. 5-1:");
        String[] words = str.split(" ");
        String temp = "";
        for (String word : words) {
            if (word.length() > temp.length()) {
                temp = word;
            }
        }
        return temp;
    }
}
