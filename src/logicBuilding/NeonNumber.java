package logicBuilding;

public class NeonNumber {
    public static void main(String[] args) {
        int a = 9;
        int sq=a*a;
        int sum=0;
        while(sq!=0) {
            int r = sq % 10;
            sum+=r;
            sq/=10;
        }
        if(sum==a)
            System.out.println("Number is Neon Number");
    }
}
