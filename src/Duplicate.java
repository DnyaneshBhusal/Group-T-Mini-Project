import java.util.Arrays;

public class Duplicate {
	public static void main(String[]args) {
		
		int arr[]= {4,6,8,7,5,4,3,8,6,9,5};
		
//				for(int i=0;i<arr.length;i++)
//				{
//					for(int j=i+1;j<arr.length;j++)
//					if (arr[i]==arr[j])
//					System.out.print(arr[i]+",");
//				}
		
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr[3]);
		
		
		/*int arr[]= {1,2,3,4,4,3,5,8,8};
	System.out.println("Duplicate elements are");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
			if (arr[i]==arr[j])
				System.out.print(arr[i]+",");
	}*/

}
}
