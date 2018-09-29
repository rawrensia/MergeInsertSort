
public class IntegSort {
	
	private static int temp;
	public static long count = 0;
	
	public static void mergeSort(int[] arr, int first, int last, int S) {
		if ((last - first) > S) {
			int mid = (first + last) /2;
			mergeSort(arr, first, mid, S);
			mergeSort(arr, mid+1, last, S);
			merge(arr, first, mid, last);
		}
		else insertionSort(arr, first, last);
	}
		
	private static void merge(int[] arr,int first, int mid, int last) {
		int[] tempList = new int[arr.length];
		
		for (int i = first; i <=last; i++)
	         tempList[i] = arr[i];
			
		int l1 = first;
		int m = mid+1;
		int a = first;
		
		while(l1 <= mid && m <=last) {
			count++;
			
			if (tempList[l1]<tempList[m]) {
				arr[a] = tempList[l1];
				l1++;
				a++;
			}
			else if (tempList[l1]>tempList[m]) {
				arr[a] = tempList[m];
				m++;
				a++;
			}
			else {
				arr[a] = tempList[l1];
				l1++;
				a++;
				
				arr[a] = tempList[m];
				m++;
				a++;
			}	
		}
		
		while (l1 <= mid) {
           arr[a] = tempList[l1];
           a++;
           l1++;
       	}
	}		
	
	private static void insertionSort(int[] arr, int first, int last) {
		
		for (int i=first+1; i<=last; i++) {
			for (int j = i; j > first; j--) {
				count++;
				
				if (arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else break;
			}
		}
	}

}