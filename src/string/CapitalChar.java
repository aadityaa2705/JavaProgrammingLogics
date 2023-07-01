package string;

public class CapitalChar {
	public static void main(String[] args) {
		String str = "CoreJava";
		for(int i = 0;i<str.length();i++) {
		 int a = str.charAt(i);
		 if(a<97)
			 System.out.print((char)a+" ");
		}
	}
}
