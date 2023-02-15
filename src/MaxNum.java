import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		int arr[]=new int[4];
		System.out.println("Please enter the array elements");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<4;i++)
		System.out.print(arr[i]+",");
		int max=arr[0];
		for(int i=1;i<4;i++)
		{
			if (arr[i]>max)
				max=arr[i];
			 

	} 	System.out.println();
	System.out.println("Array elements are");
	    System.out.println(max);
	}

}
