package logicBuilding;

public class Fibonacci {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        for(int i=0;;i++) {
            System.out.print(num1+" ");
            int a = num1 + num2;
            num1 = num2;
            num2 = a;
            if(num1 < 0)
                break;
        }
    }
}
