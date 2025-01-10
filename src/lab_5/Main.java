package lab_5;

import static lab_5.lab_5_1.printlab_5_1;
import static lab_5.lab_5_2.printlab_5_2;
import static lab_5.lab_5_3.printlab_5_3;
import static lab_5.lab_5_4.printlab_5_4;
import static lab_5.lab_5_5.printlab_5_5;

public class Main {
    public static void main(String[] args) {
        String text1="Разнообразный и богатый опыт говорит нам, что начало повседневной работы по формированию позиции однозначно фиксирует необходимость поэтапного и последовательного развития общества. Высокий уровень вовлечения представителей целевой аудитории является четким доказательством простого факта: повышение уровня гражданского сознания напрямую зависит от позиций, занимаемых участниками в отношении поставленных задач.";
        System.out.println("Самое длинное слово в тексте: "+printlab_5_1(text1));

        String text2="Live not on evil";
        System.out.println("Текст является палиндромом: "+printlab_5_2( text2));

        String text3=" Ах! Я - маленькая бяка! " +" Ах! Я - маленькая дрянь! "+"Ах! Я - маленькая бяка! " +" Ах! Я - маленькая дрянь! ";
        printlab_5_3(text3);

       System.out.println("Результат: "+printlab_5_4(text3,"бяка"));

       String text4="Это тестовое сообщение";
       printlab_5_5(text4);
    }
}
