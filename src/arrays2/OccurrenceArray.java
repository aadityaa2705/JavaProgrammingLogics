package arrays2;

public class OccurrenceArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,10,40,20,30,10}; //10=3, 20=2, 30=2, 40=1
//		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}
		for(int a : arr)
			System.out.print(a+" ");
	}
}
