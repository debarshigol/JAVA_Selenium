
public class ArraySum {

	public static void main(String[] args) {
		int[] arr = {6,8,11,6,7,18};
		int target = 17;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<target) {
				int index1  =i;
				int numLeft = target-arr[i];
				for(int j=0;j<arr.length;j++) {
					if(numLeft==arr[j]) {
						int index2 = j;
						System.out.println("Index of the 2 int, whose sun value equal to traget, are: "+index1+" "+index2);;
					}
				}
			}
		}
	}

}
