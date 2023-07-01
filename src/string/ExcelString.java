package string;

import java.util.List;
import java.util.ArrayList;

public class ExcelString {
	public static void main(String[] args) {
		String str = "D1:E5";
		List<String> rows = selectedRows(str);
		System.out.println(rows);
//		System.out.println(ExcelString.selectedRows(str));
		
	}
	
	public static List<String>selectedRows(String str)
	{
		 List<String> ans = new ArrayList<>();
		 char st = str.charAt(0);
		 char ed = str.charAt(3);
		 
		 while(st<=ed) {
			 char nst = str.charAt(1);
			 char ned = str.charAt(4);
			 while(nst<=ned)
			 {
				 ans.add(st+""+nst);
				 nst++;
			 }
			 st++;
		 }
		 
		 return ans;
	}
}
