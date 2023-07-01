package string;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "ab aa ba aa ab";
		String[] arr = str.split(" ");
		String revStr="";
		for(int i=arr.length-1;i>=0;i--) 
			revStr+=arr[i]+" ";
		
		revStr = revStr.trim(); //important step
		System.out.println(str);
		System.out.println(revStr);
		if(revStr.equals(str)) 
			System.out.println("Palindrome String");
		else 
			System.out.println("Not a Palindrome String");
	}
}
