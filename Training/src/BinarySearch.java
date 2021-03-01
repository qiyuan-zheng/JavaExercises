//8. WAP for binary search

public class BinarySearch {

	public static void main(String[] args) {
		int answer;
		int [] arr = {1,2,3,7,9,10};
		answer = binarySearch(arr,10,0,arr.length-1);
		System.out.println(answer);
		
	}
	//assumes list is sorted
	static int binarySearch(int [] arr, int n, int left, int right) {
		int mid = (int) (left+right)/2;
		if(right>=left) {
			if(arr[mid]==n) {
				return mid;
			}
			if(arr[mid]>n) {
				return binarySearch(arr,n,left,mid-1);
			}
			return binarySearch(arr,n,mid+1,right);
		}
		return -1;
	}

}
