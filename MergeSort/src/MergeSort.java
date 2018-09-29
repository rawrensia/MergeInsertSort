public class MergeSort{

	public static int count1;
	
	public static void mergeSort(int[] arr, int first, int last) {
		int mid = (first + last) / 2;
		
		if (first >= last) return;
		else if (first < last){	
            mergeSort(arr,first, mid);
            mergeSort(arr,mid+1, last);
        }

		merge(arr,first, mid, last);
	}

	private static void merge(int[] arr, int first, int mid, int last) {
		int[] tempList = new int[arr.length];

		for (int i = first; i <=last; i++)
			tempList[i] = arr[i];

		int l1 = first;
		int m = mid+1;
		int a = first;

		while(l1 <= mid && m <=last) {
			count1++;

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
	
}