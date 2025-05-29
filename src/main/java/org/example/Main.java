package org.example;

import java.util.Arrays;

class Main{
    public static int[] selectionS(int[]arr){
        int inner,outer,min;
        for ( outer=0;outer< arr.length;outer++){
            min=outer;
            for (inner=outer+1;inner<arr.length;inner++){
                if (arr[min]>arr[inner]) {
                    min=inner;
                }
            }
            int temp=arr[outer];
            arr[outer]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void main(String[]args){
        int[]a={4,2,6,9,6};
        int[]ab=selectionS(a);
        System.out.println(Arrays.toString(ab));
    }
}