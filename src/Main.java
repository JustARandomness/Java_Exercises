import java.io.IOException;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void ex1() { // Проверить, является ли число степенью двойки
        Scanner in = new Scanner(System.in);
        int x = Math.abs(in.nextInt());
        boolean isPowerOfTwo = true;
        while (x != 1) {
            if (x % 2 != 0) {
                isPowerOfTwo = false;
            }
            x /= 2;
        }
        if (isPowerOfTwo) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }

    public static void ex2() { // Вывести первые 12 членов последовательности Фибоначчи
        int prev = 0;
        int curr = 1;
        System.out.print(prev + ", " + curr);
        for (int i = 0; i < 10; ++i) {
            System.out.print(", ");
            System.out.print(curr + prev);
            int temp = curr;
            curr += prev;
            prev = temp;
        }
    }

    public static boolean ex4(String s) { // Проверка на палиндром
        s = s.replaceAll("[\\s\\p{P}]", "");
        s = s.toLowerCase();
        int i = 0;
        while (i != s.length() / 2) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void ex3(int n, int[] array) { // Вывести нечетные числа из целочисленного массива
        for (int i = 0; i < n; ++i) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void ex5() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.skip(in.nextLine());// Минимальная и максимальная длина строки
        int min = 1000000000;
        int max = -1;
        for (int i = 0; i < n; ++i) {
            int l = in.nextLine().length();
            if (l < min) {
                min = l;
            }
            if (l > max) {
                max = l;
            }
        }
        System.out.print("max: " + max + "\nmin: " + min);
    }

    public static int ex6() {      // Количество слов, содержащих только символы латинского алфавита
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");
        int wordCnt = 0;
        for (String word : words) {
            int l = word.length();
            boolean hasOnlyLatinLetters = true;
            for (int i = 0; i < l; ++i) {
                if (!(((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 90) || ((int) word.charAt(i) >= 97 && (int) word.charAt(i) <= 122))) {
                    hasOnlyLatinLetters = false;
                    break;
                }
            }
            if (hasOnlyLatinLetters) {
                wordCnt++;
            }
        }
        return wordCnt;
    }

    public static boolean ex7() {       // Является ли строка корректным IP адресом
        Scanner in = new Scanner(System.in);
        String[] ip = in.nextLine().split("\\.");
        if (ip.length != 4) {
            return false;
        }
        for (int i = 0; i < ip.length; ++i) {
            for (int j = 0; j < ip[i].length(); ++j) {
                if (!(ip[i].charAt(j) >= 48 && ip[i].charAt(j) <= 57 && Integer.parseInt(ip[i]) <= 255)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Vector v = new Vector(10, 5, 4);
    }
}