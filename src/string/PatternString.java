package string;

public class PatternString {
	public static void main(String[] args) {
		int line = 5;
		int star = 1;
		char ch = 'V';
		for(int i=0;i<line;i++) {
			char ch2=ch;
			for(int j=0;j<star;j++) {
				System.out.print(ch2+" ");
				if(i-1==j) {
					ch2--;
				}
			}
			star++;
			ch++;
			System.out.println();
		}
	}
}
