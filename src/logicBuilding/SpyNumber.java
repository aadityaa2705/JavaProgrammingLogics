package logicBuilding;

public class SpyNumber {
    public static void main(String[] args) {

                    // SpyNumber

        int count=0;
        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int addition = 0;
            int multiplication = 1;
            while (n != 0) {
                addition += n % 10;
                multiplication *= n % 10;
                n = n / 10;
            }
            if (addition == multiplication) {
                count++;
            }
        }
    }
}
