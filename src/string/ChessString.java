package string;

public class ChessString {
	public static void main(String[] args) {
		String str = "G8";
		int c1 = str.charAt(0)-'@';
		int c2 = str.charAt(1)-'0';
		
		if((c1+c2)%2==0)
			System.out.println("White Color !!");
		else
			System.out.println("Black Color !!");
	}
}
