import java.util.*;

class Selection_sort{
	public static void main(String args[]){
		int arr[] = {7, 8, 3, 1, 2, 10, 6};
		int small = 0;
		for(int i = 0; i < arr.length; i++){
			small = i;
			
			//loop for finding the smallest number from the array			
	
			for(int j = i; j < arr.length; j++){	
				if(arr[small] > arr[j]){
					small = j;
				}
			}
	
			//putting the smallest number in the begining of the array		
	
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
		
		//Printing the sorted array

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}