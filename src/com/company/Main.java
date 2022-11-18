package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt();
        System.out.println("Заполните массив");
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt();
        }

        int[][] mat = new int[2][size];
        int j;
        int m = 0;
        int count = 0;

        for(int w = 0; w < size; w++) {
            for (int i = 0; i < mas.length; i++) {
                j = mas[count];
                if (j == mas[i]) {
                    m++;
                    mat[0][count] = m;
                    mat[1][count] = j;
                }
                if (i + 1 == size) {

                    m = 0;
                }
            }
            count++;
        }
        vevod(mat, size);

        System.out.println("-------------------------------------------");

        int[][] sArr = insertionSort(mat, size);
        vevod(sArr, size);

        System.out.println(" ");

        mas = sArr[1];
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }


    }
    public static int[][] insertionSort(int[][] arr, int size) {
        int temp;
        int temp2;
        int count = 0;
        int z;
        int y = 0;
        int[][] arr2 = new int[2][size];
        for (int j = 0; j < size - 1; j++)
        {
            for (int k = j + 1; k < size; k++)
            {
                if (arr[0][j] < arr[0][k])
                {
                        temp = arr[0][k];
                        temp2 = arr[1][k];
                        arr[0][k] = arr[0][j];
                        arr[1][k] = arr[1][j];
                        arr[0][j] = temp;
                        arr[1][j] = temp2;
                }
            }
        }

        vevod(arr, size);

        int[] arr1 = new int[size];
        arr1 = arr[1];

        for(int w = 0; w < arr1.length; w++) {
            z = arr1[count];
            for (int i = 0; i < arr1.length; i++) {
                if (z == arr1[i] && z != 0) {
                    arr2[1][y] = z;
                    arr1[i] = 0;
                    y++;
                }
            }
            count++;
        }
        return arr2;
    }

    public static void vevod(int[][] arr, int size){
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < size; y++) {
                System.out.print(" " + arr[x][y] + " ");
            }
            System.out.println();
        }
    }

}
