package string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "N I T I N";
		String revStr = "";
		System.out.println("Original String : \n"
						+  str+"\n"
						+  "=================\n"
						+  "Reversed String : ");
		for(int i = str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);		
			}
		System.out.println(revStr);
		
		if(str.equals(revStr))
			System.out.println("Palindrome String");
		else
			System.out.println("Not a Palindrome String");
	}
}
