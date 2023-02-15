import java.util.Scanner;

public class Addition {
	// addition of two array
	public static void main(String[] args) {
	

	  int arr1[]= {1,2,3,4,5}; 
	  int arr2[]= {5,4,3,2,1};
	   for(int i=0;i<arr1.length;i++)
	   {
	    arr1[i]=arr1[i]+arr2[i];
	   
	 System.out.print(arr1[i]+",");
	 
	   }
	}
}
