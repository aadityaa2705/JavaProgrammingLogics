package string;

public class DecodeChar {
	public static void main(String[] args) {
		String str = "a1c1e1";
		String s = str;
		System.out.println("Original : "+s);
		
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				int n = str.charAt(i)-'0';
				char ch = str.charAt(i-1);
				
				for(int j=0;j<n;j++)
					ch++;
				s = s.substring(0,i)+ch+s.substring(i+1);
//				System.out.println(s);
			}
		}
		System.out.println("Decoded : "+s);
   }
}