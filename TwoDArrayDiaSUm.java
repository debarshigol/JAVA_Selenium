package Practice_Problrm;

public class TwoDArrayDiaSUm {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		arrDiaSum(arr);
		arrDiaSumReverse(arr);
	}
	
	// forward diagonal sum
	public static void arrDiaSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		System.out.println(sum);
	}

	// reverse diagonal sum
	public static void arrDiaSumReverse(int[][] arrMod) {
		int summ = 0;
		int n = arrMod.length;
		for (int i = 0; i < n; i++) {
			summ += arrMod[i][n - 1 - i];
		}
		System.out.println(summ);
	}
	
}
