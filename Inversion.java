public class Inversion{
	static int arr[] ={1,9,6,4,5};	
	static	int getInvCount(int n){
		int inv_count = 0;
		for(int i=0; i <n-1; i++){
			for (int j=i+1; j<n; j++){
				if (arr[i] > arr[j]){
					inv_count++;
				}
			}
		}
		return inv_count;
	}
}

