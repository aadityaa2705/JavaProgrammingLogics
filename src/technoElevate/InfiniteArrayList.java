package technoElevate;
import java.util.ArrayList;

public class InfiniteArrayList {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;

        ArrayList<Integer> infiniteList = new ArrayList<>();
        infiniteList.add(firstNumber);
        infiniteList.add(secondNumber);

        int currentIndex = 2;
        System.out.print(firstNumber+" ");
        System.out.print(secondNumber+" ");
        while (true) {
            int sum = 0;
            for (int i = 0; i < currentIndex; i++) {
                sum += infiniteList.get(i);
            }

            infiniteList.add(sum);
            System.out.print(sum+" ");

            currentIndex++;
            if (sum < 0)
                break;
        }
    }
}
