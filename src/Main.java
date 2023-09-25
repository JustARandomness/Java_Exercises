import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.math.*;
import java.io.File;

public class Main {
    public static void ex1() { // Проверить, является ли число степенью двойки
        Scanner in = new Scanner(System.in);
        int x = Math.abs(in.nextInt());
        boolean isPowerOfTwo = true;
        while (x != 1) {
            if (x % 2 != 0) {
                isPowerOfTwo = false;
                break;
            }
            x /= 2;
        }
        System.out.print(isPowerOfTwo);
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
            if (l == 0) {
                hasOnlyLatinLetters = false;
            }
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
        for (String s : ip) {
            for (int j = 0; j < s.length(); ++j) {
                if (!(s.charAt(j) >= 48 && s.charAt(j) <= 57 && Integer.parseInt(s) <= 255)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void ex14() {     // Считывает 5 строк и выводит самую короткую
        Scanner in = new Scanner(System.in);
        String[] ArrayList = new String[5];
        int min = 2000000;
        for (int i = 0; i < 5; ++i) {
            ArrayList[i] = in.nextLine();
            if (ArrayList[i].length() < min) {
                min = ArrayList[i].length();
            }
        }
        for (String s : ArrayList) {
            if (s.length() == min) {
                System.out.println(s);
            }
        }
    }

    public static void removeStudentsWithLowAverage(List<StudentEx15> students) {
        Iterator<StudentEx15> iterator = students.iterator();
        while (iterator.hasNext()) {
            StudentEx15 student = iterator.next();
            double avgGrade = student.getAvgScore();
            if (avgGrade < 3) {
                iterator.remove();
            }
            else {
                student.increaseYear();
            }
        }
    }

    public static void printStudents(List<StudentEx15> students, int year) {
        for (StudentEx15 s : students) {
            if (s.getYear() == year) {
                System.out.println(s.getName());
            }
        }
    }

    public static int[][] getMatrix() {
        try {
            String[] fileLines = Files.readAllLines(Paths.get("src/matrix.txt")).toArray(new String[0]);
            int size = fileLines.length;
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; ++i) {
                String[] matrixElements = fileLines[i].split("\\s");
                for (int j = 0; j < size; ++j) {
                    matrix[i][j] = Integer.parseInt(matrixElements[j]);
                }
            }

            return matrix;
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
//        System.out.print(ex7());
//        Vector v1 = new Vector(10, 5, 4);     //      Для задания 8
//        Vector v2 = new Vector(5, 5, 4);
//        System.out.println(Vector.vectorProduct(v1, v2));

//        Student student = new Student("Utin", "Fedor", 5, 4);     //      Для задания 9
//        System.out.println(student.getScholarship());
//        student.addGrade(3);
//        System.out.println(student.getScholarship());
//        PostGraduateStudent postGraduateStudent = new PostGraduateStudent("Utin", "Fedor", 5, 4);
//        System.out.println(postGraduateStudent.getScholarship());
//        postGraduateStudent.addGrade(3);
//        System.out.println(postGraduateStudent.getScholarship());

//        try {     // Для задания 11
//            ClassWithException.getException();
//        }
//        catch (MyException e) {
//            System.out.println(e.getMessage());
//        }

//        List<StudentEx15> students = new ArrayList<>();       // Для задания 15
//        List<Double> grades1 = new ArrayList<>();
//        grades1.add(3.0);
//        grades1.add(2.6);
//        grades1.add(2.8);
//
//        List<Double> grades2 = new ArrayList<>();
//        grades2.add(3.5);
//        grades2.add(4.0);
//        grades2.add(5.0);
//
//        StudentEx15 student1 = new StudentEx15("Jack", 1, 215, grades2);
//        StudentEx15 student2 = new StudentEx15("Bob", 2, 234, grades1);
//        StudentEx15 student3 = new StudentEx15("Carl", 3, 276, grades2);
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        System.out.println(students);
//
//        printStudents(students, 3);
//
//        removeStudentsWithLowAverage(students);
//
//        System.out.println(students);

//        PublicTransport v = new Tram(20);     // Для задания 10
//        System.out.println(v.getCurrentStop());
//        v.move();
//        System.out.println(v.getCurrentStop());
//        v.move();
//        System.out.println(v.getCurrentStop());
//        v.move();
//        System.out.println(v.currentStop);
//        System.out.println(v.getCurrentStop());

//        try (MyResource resource1 = new MyResource("resource1");      // Для задания 13
//             MyResource resource2 = new MyResource("resource2")) {
//            resource1.act();
//            resource2.act();
//        }
//        catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

        System.out.println(Arrays.deepToString(getMatrix()));
    }
}