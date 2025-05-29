package org.example;

import java.util.Arrays;

class Bubble_Sort {
    public static int[] BubbleSort(int[]a){
        for (int i=0;i< a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[]args){
        int[]s=BubbleSort(new int[]{4, 2, 6, 8, 3, 9, 2});
        System.out.println(Arrays.toString(s));

    }
}