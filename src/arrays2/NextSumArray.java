package arrays2;

public class NextSumArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;

        int currentIndex = 0;
        boolean status = true;
        while (status) {
            System.out.print(arr[currentIndex]+ " ");

            int nextIndex = (currentIndex + 1) % 3;
            int sum = arr[currentIndex] + arr[nextIndex];
            arr[(nextIndex + 1) % 3] = sum;

            currentIndex = nextIndex;

            if (arr[currentIndex] < 0){
                status=false;
            }
        }
    }
}
