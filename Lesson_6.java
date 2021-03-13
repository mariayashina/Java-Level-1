import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.*;
import java.util.PrimitiveIterator;

public class Lesson_6 extends Object {
public static void main(String[] args) throws IOException {
    try {
        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
        PrintStream ps = new PrintStream(fileOutputStream);
        ps.println("Встаньте на путь наставника\n" +
                "Наши исследования показали, что эффективность обучения увеличивается, если у студента есть наставник. Мы стремимся, чтобы каждый ученик GeekBrains получил от обучения максимум благодаря помощи сообщества.\n" +
                "\n" +
                "Чем занимается наставник\n" +
                "Помогает студенту GeekBrains осваивать программу обучения, выполнять практические задания и учебные проекты. Мы предусмотрели инструменты на сайте, которые позволят вам общаться со своими подопечными. Вам будут задавать вопросы, а вы - отвечать на них.\n" +
                "\n");
        ps.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }
    try {
        FileOutputStream fileOutputStream1 = new FileOutputStream("Test1.txt");
        PrintStream ps1 = new PrintStream(fileOutputStream1);
        ps1.println("Что получает наставник?\n" +
                "Скачoк в развитии\n" +
                "Наверняка вы слышали старый анекдот: «Говорит один преподаватель другому: «Ну и группа мне в этом году попалась! Объясняю теорему - не понимают! Объясняю второй раз - не понимают! В третий раз объясняю. Сам уже понял. А они не понимают...» В этом есть доля правды: объясняя что-то другому человеку, вы сами глубже погружаетесь в тему, смотрите на нее под другим углом и открываете новое.\n" +
                "\n" +
                "Особый статус\n" +
                "Став наставником, вы повышаете свой экспертный статус не только в GB, но и любом профессиональном комьюнити. Это привлекательно и для работодателей.");
        ps1.close();
        fileOutputStream1.flush();
        fileOutputStream1.close();
    } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }

    try {
        FileInputStream fileInputStream = new FileInputStream("Test2.txt");
        int inputData;
        while((inputData = fileInputStream.read()) != -1) {
            System.out.print((char) inputData);
        }
        fileInputStream.close();
    } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }

    concFiles (new String[]{"Test.txt", "Test1.txt"}, "Test2.txt");
}

    private static void concFiles(String[] names, String destinationName) {
        try{
            FileOutputStream fos = new FileOutputStream(destinationName);
            for (String name: names){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
