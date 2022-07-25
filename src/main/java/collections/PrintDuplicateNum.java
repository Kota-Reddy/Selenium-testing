package collections;

import java.util.ArrayList;

public class PrintDuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,5,7,5,2,2,7,6};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int k=0;
			if(!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						k++;
					}
				}
				
				System.out.println(arr[i]+" repeats : "+k+" times.");
				
				
			}
			if(k==1) {
				System.out.println(arr[i]+" is a unique number.");
			}
			else if(k>1) {
				System.out.println(arr[i]+" is duplicate number");
			}
		}
	}

}
