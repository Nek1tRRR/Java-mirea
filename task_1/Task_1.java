package ru.mirea.task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static int fact(int n){
        int res = 1;
        for (int i = 2; i <= n; ++i)
        {
            res *= i;
        }

        return res;
    }

    public static void printArray(int[] arr) {
        for (int elem: arr)
        {
            System.out.print(elem + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right){
        int left_marker = left;
        int right_marker = right;
        int pivot = arr[(left + right) / 2];
        int tmp;

        do{
            while (arr[left_marker] < pivot)
                left_marker++;

            while (arr[right_marker] > pivot)
                right_marker--;

            if (left_marker <= right_marker)
            {
                if (left_marker < right_marker)
                {
                    tmp = arr[left_marker];
                    arr[left_marker] = arr[right_marker];
                    arr[right_marker] = tmp;
                }

                left_marker++;
                right_marker--;
            }
        } while (left_marker <= right_marker);

        if (left_marker < right)
            quickSort(arr, left_marker, right);
        if (left < right_marker)
            quickSort(arr, left, right_marker);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива: ");

        size = sc.nextInt();
        int[] arr = new int[size];

        // ввод массива
        System.out.println("Введите " + size + " элемента(ов) массива: ");
        for (int i = 0; i < size; ++i){
            arr[i] = sc.nextInt();
        }

        // Сумма чисел массива. Цикл for
        int sum = 0;
        for (int i = 0; i < size; ++i)
            sum += arr[i];
        System.out.println("[for] сумма: " + sum);

        // Сумма чисел массива. Цикл while
        sum = 0;
        int i = 0;
        while (i < size)
        {
            sum += arr[i];
            i++;
        }
        System.out.println("[while] сумма: " + sum);

        // Сумма чисел массива. Цикл do while
        sum = 0;
        i = 0;
        do {
            sum += arr[i];
            i++;
        }
        while (i < size);
        System.out.println("[do while] сумма: " + sum);

        // Аргументы командной строки
        System.out.println("\nАргументы командной строки: ");
        /*for (String elem : args){
            System.out.println("\t" + elem);
        }*/

        for (i = 0; i < args.length; ++i){
            System.out.println("\t" + args[i]);
        }

        // Гармонический ряд
        System.out.print("\nГармонический ряд: ");
        double elem;
        for (i = 1; i <= 10; ++i){
            elem = 1.0 / i;
            System.out.format("%.2f ",elem);
        }

        //  Массив случайных чисел
        int min = -10;
        int max = 11;
        Random random = new Random();
        arr = new int[10];
        for (i = 0; i < 10; ++i)
        {
            if (i % 2 == 0)
                arr[i] = random.nextInt(max - min) + min;
            else
                arr[i] = (int)(Math.random() * (max - min) + min);
        }
        System.out.print("\n\nСлучайно сгенерированный массив: ");
        printArray(arr);
        quickSort(arr, 0, 9);
        System.out.print("\nОтсортированный массив: ");
        printArray(arr);

        // Факториал с помощью цикла
        System.out.print("\n\nВведите число: ");
        int n = sc.nextInt();
        System.out.print("Факториал числа " + n + "! = " + fact(n));

    }


}
