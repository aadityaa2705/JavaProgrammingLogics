package arrays2;

public class MaxMinNumber {
	public static void main(String[] args) {
		int[][] arr = {
				{10},
				{11,99,23},
				{44,42},
				{55,6,61,67},
		};
		for(int[] a1 : arr) {
			for(int a : a1)
				System.out.print(a+"  ");
			System.out.println();
		}
		System.out.println("--------------------");
		int max = arr[0][0];
		int min = arr[1][0];
		for (int[] ints : arr) {
			for (int anInt : ints) {
				if (anInt > max)
					max = anInt;
				if (anInt < min)
					min = anInt;
			}
		}
		System.out.println("Max Value : "+max);
		System.out.println("Min Value : "+min);
	}
}
