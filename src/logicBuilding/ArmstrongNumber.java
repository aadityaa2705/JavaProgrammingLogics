package logicBuilding;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a = 153;
        int sum=0;
        int stored =a;
        int count=0;
        while(stored!=0){
            count++;
            stored/=10;
        }
        while(a!=0){    //153 15
            int r = a%10; //3 5
            int pow=1; // 27
            for(int i=0;i<count;i++) { //0 1 2
                pow*=r; //3 9 27
            }
            System.out.print(pow+ " ");
            sum+=pow; //27
            a/=10;
        }
        System.out.println();
        System.out.println(sum);
//        System.out.println(197-153)
    }
}
