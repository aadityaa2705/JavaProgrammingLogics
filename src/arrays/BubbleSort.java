package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {19,4,37,9,15,25};
        System.out.println("Before Sorting :");
        for(int a1 : arr)
            System.out.print(a1+"  ");
        System.out.println();
        System.out.println("---------------------------");

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting :");
        for (int a : arr)
            System.out.print(a+"  ");
    }
}
