package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14};
        System.out.println(" ");
        for(int b: arr)
            System.out.print(b+" ");
        int last = arr[arr.length-1];
        int n =3;
        while(n>0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
                n--;
            }
            arr[0]=last; // 14
            n--; // 2
        }
        System.out.println();
        System.out.println("--------------------");
        for(int a:arr)
            System.out.print(a+" ");
    }
}
