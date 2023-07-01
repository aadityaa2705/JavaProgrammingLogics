package string;

public class ReplaceChar {
	public static void main(String[] args) {
		String str = "ababa"; //input
		/* Output :-
		 * str1 = "*b*b*";
		 * str2 = "*baba";
		 * str3 = "abab*";
		 * str4 = "ab*ba;
		 * str5 = "*bab*;
		 * str6 = "a**ba;
		*/
		String str1 = str.substring(0,2)+"*"+str.substring(3, 5);
		String str2 = "*"+str.substring(1,5);
		System.out.println(str1);
	}
}
