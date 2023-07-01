package string;

public class StringAnagram {
	public static void main(String[] args) {
			String s1 = "MARY";
			String s2 = "ARMY";
			
			if(s1.length()==s2.length()) {
				char[] ch1 = sortArray(s1.toCharArray());
				char[] ch2 = sortArray(s2.toCharArray());
				for(int i = 0;i<ch1.length;i++) {
					if(ch1[i]==ch2[i]) {
						System.out.println("It is an Anagram String.");
						break;
					}else {
						System.out.println("It is not an Anagram String.");
						break;
					}
				}
			}
		}
	
	
	public static char[] sortArray(char[] chArr) {
		for(int i=0;i<chArr.length;i++) {
			for(int j=0;j<chArr.length-i-1;j++)
			{
				if(chArr[j]>chArr[j+1])
				{
					char temp=chArr[j];
					chArr[j] = chArr[j+1];
					chArr[j+1] = temp;
				}
			}
		}
		return chArr;
	}
}
