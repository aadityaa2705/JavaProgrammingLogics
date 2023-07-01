package string;

public class ParseString {
	public static void main(String[] args) {
		String num = "12345678";
//		int n1 = Integer.parseInt(num);
		int sum=0;
//		while(n1>0) {
//			int r = n1 % 10;
//			sum+=r;
//			n1/=10;
//		}
//		System.out.println("Addition : "+sum);
		for(int i=0;i<num.length();i++) {
			int ch = num.charAt(i)-'0';
			System.out.print(ch+" ");
			sum+=ch;
		}
		System.out.println();
		System.out.println(sum);
		
	}
}
