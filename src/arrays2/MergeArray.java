package arrays2;

public class MergeArray {
	public static void main(String[] args) {
		MergeArray m1 = new MergeArray();
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {50,60,70};
		int[] arr = m1.mergeArray(arr1,arr2);
		for(int a:arr) {
			System.out.print(a+"  ");
		}
	}
	
	public int[] mergeArray(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] arr3 = new int[n1+n2];
		int idx = 0;
		for(int a:arr1)
			arr3[idx++]=a;
		for(int a: arr2)
			arr3[idx++] = a;
		return arr3;
	}
}
