import java.util.Arrays;

//6. WAP for various sorting algorithm (bubble, selection, insertion, quick sort)

public class SelectionSort {
	public static void main(String [] args) {
		SelectionSort obj = new SelectionSort();
		int [] arr = {3,2,4,5,2,1,3,4,3};
		obj.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	void selectionSort(int arr[]) { 
        int n = arr.length; 
          for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
        } 
	}
}
