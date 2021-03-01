public class SequentialSearch {
	public static void main(String [] args) {
		int answer;
		int [] arr = {1,2,3};
		answer = seqSearch(arr,89);
		System.out.println(answer);
	}
	
	static int seqSearch(int [] arr, int n) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
