public class Lesson_2 {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] == 1 ? 0 : 1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        //Задание 2
        System.out.println("Задание 2");
        int[] myArray2 = new int[8];
        for (int i = 0, j = -2; i < myArray2.length; i++) myArray2[i] = j += 3;
        for (int x : myArray2) System.out.print(x + " ");
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] < 6) myArray3[i] *= 2;
            System.out.print(myArray3[i] + " ");
        }
        System.out.println();
        //Задание 4
        System.out.println("Задание 4");
        int[] myArray4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = myArray4[0], max = myArray4[0], indMax = 0, indMin = 0;
        for (int i = 0; i < myArray4.length; i++) {
            if (myArray4[i] > max) {
                max = myArray4[i];
                indMax = i;
            }
            if (myArray4[i] < min) {
                min = myArray4[i];
                indMin = i;
            }
            }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
    }
}

