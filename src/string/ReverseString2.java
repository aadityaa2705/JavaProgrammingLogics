package string;

public class ReverseString2 {
	public static void main(String[] args) {
		String str = "This is Programming Batch";
		System.out.println("String : "+str);
		String[] split = str.split(" ");
		String rev = "";
		
		for(int i=split.length-1;i>=0;i--) {
			rev+=split[i]+" ";
		}
		System.out.println("Reverse String : "+rev);
	}
}
