//6. WAP for various sorting algorithm (bubble, selection, insertion, quick sort)

public class BubbleSort {
	public static void main(String [] args) {
		BubbleSort obj = new BubbleSort();
		int arr [] = {1,9,0,4,2,3,1,2};
		obj.bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	void bubbleSort(int arr[]) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
	}

}
