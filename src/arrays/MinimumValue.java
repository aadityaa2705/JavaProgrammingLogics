package arrays;

import java.util.Random;

public class MinimumValue {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = {10,1,0,-2};
        for(int i : arr)
            System.out.print(i+" ");
        int min = arr[0];
        int minIndex = 0;
        for(int i =0; i < arr.length;i++){
            if (arr[i] < arr[minIndex])
                minIndex=i;
        }
        System.out.println();
        int temp = arr[minIndex];
        arr[minIndex]=arr[0];
        arr[0] = temp;
        for(int a : arr)
            System.out.print(a+" ");
    }
}
