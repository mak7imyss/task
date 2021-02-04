package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        int x;
        long a;
        System.out.println("Выберите номер задачи(1-5):");
        switch (sc.nextInt()){
            case 1 -> {
                sc.nextLine();
                System.out.print("Введите 1 строку: ");
                str1 = sc.nextLine();
                System.out.print("Введите 2 строку: ");
                str2 = sc.nextLine();
                System.out.println(Anagram.hiddenAnagram(str1, str2));
            }
            case 2 -> {
                sc.nextLine();
                System.out.print("Введите строку: ");
                str1 = sc.nextLine();
                System.out.print("Введите число: ");
                x = sc.nextInt();
                System.out.println(Arrays.toString(Letter.collect(str1, x)));
            }
            case 3 -> {
                sc.nextLine();
                System.out.print("Введите сообщение: ");
                str1 = sc.nextLine();
                System.out.print("Введите ключ: ");
                str2 = sc.nextLine();
                System.out.println(Message.nicoCipher(str1, str2));
            }
            case 4 -> {
                sc.nextLine();
                System.out.print("Введите массив чисел через пробел: ");
                int[] data = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(data));
                System.out.print("Введите число: ");
                x = sc.nextInt();
                System.out.println(Arrays.toString(Product.twoProduct(data, x)));
            }
            case 5 -> {
                sc.nextLine();
                System.out.print("Введите число: ");
                a = sc.nextInt();
                System.out.println(Arrays.toString(Factorial.isExact(a)));
            }
        }
    }
}
