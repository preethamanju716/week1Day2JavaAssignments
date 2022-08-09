package week1.day2.assignments;

import java.util.Arrays;

public class MissingValuesInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int count=0;

		Arrays.sort(arr);
		
	System.out.println("mismatched values");
	for(int i=0;i<arr.length;i++) {
		if (i+1!=arr[i]){
			count=count+1;
			System.out.println(arr[i]);
		}
	}
	System.out.println("*****");
	System.out.println(count + " values are mismatched");
	}
	

}


