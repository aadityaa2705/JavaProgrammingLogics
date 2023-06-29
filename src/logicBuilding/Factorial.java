package logicBuilding;

public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
            factorial *= i;
        }
          System.out.println();
          System.out.println(factorial);
    }
}
