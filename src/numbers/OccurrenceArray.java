package numbers;

public class OccurrenceArray {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,5,8};
        int[] arr2 = {1,2,4,5,7,8};
        int[] arr3 = {1,2,3,6,8};
        int[] mergedArray = mergeArray(arr1,arr2,arr3);
        bubbleSort(mergedArray);
        int count =0;
        for (int i=0; i< mergedArray.length-2; i++){
            if (mergedArray[i]==mergedArray[i+1] && mergedArray[i]==mergedArray[i+2]){
                System.out.print(mergedArray[i]+" ");
            }
        }
    }

    public static int[] mergeArray(int[] arr1,int[] arr2,int[] arr3){
        int n = arr1.length;
        int n2 = arr2.length;
        int n3=arr3.length;
        int[] result = new int[n+n2+n3];
        int idx = 0;
        for(int a1 : arr1)
            result[idx++]=a1;
        for(int a2 : arr2)
            result[idx++]=a2;
        for(int a3 : arr3)
            result[idx++] = a3;
        return result;
    }
    
    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-1;i++) {
            for (int j=0; j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
