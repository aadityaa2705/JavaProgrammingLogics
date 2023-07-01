package string;

public class RotateString {
	public static void main(String[] args) {
		String str = "PROGRAM";
		System.out.println("ORIGINAL : "+str+"\n"
						 + "=====================");
		int line = str.length();
		int star = str.length();
		int ch1=0;
		for(int i=0;i<line;i++) {
			String rotateStr = "";
			int ch2 = ch1;
			for(int j=0;j<star;j++) {
				rotateStr += str.charAt(ch2++);
				if(ch2 == str.length())
					ch2=0;
			}
			System.out.println(rotateStr);
			ch1++;
		}
	}
}
