package com.array;

import java.util.Scanner;

// author : Diona Putra XI RPL 1
public class RataArray {
    public static void main(String[] args){

        int array[], i, n;
        array = new int[100];
        float rata, total=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen array: ");
        n = scan.nextInt();

        for(i = 1; i <= n; i++){
            System.out.print("Nilai Ke-"+ i +" : ");
            array[i] = scan.nextInt();
            total = total + array[i];
        }

        rata = total/n;
        System.out.println("Hasil nilai total adalah : " + total);
        System.out.println("Hasil rata-rata adalah : " + rata);

    }
}
