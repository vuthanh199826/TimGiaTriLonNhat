package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang vao day");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu mang thu " + i + "vao day");
            array[i]=sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("phan tu lon nhat la:" + max);
    }
}
