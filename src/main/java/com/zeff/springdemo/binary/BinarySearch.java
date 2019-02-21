package com.zeff.springdemo.binary;

public class BinarySearch {

    public static int search(int[] arr,int value){
        int start = 0;
        int end = arr.length;

        while (end > start){
            int index = start + ( end - start ) / 2;
            if (arr[index] > value){
                end = index;
            }else if (arr[index] < value){
                start = index+1;
            }else{
                return index;
            }
        }

        return -1;
    }
}
