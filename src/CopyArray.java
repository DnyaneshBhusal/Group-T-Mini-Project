
public class CopyArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6,7};
		int arr2[]= new int[arr1.length];
		 for(int i=0;i<arr1.length;i++)
		 {
			 arr2[i]=arr1[i];
		 
		 System.out.print(arr2[i]+",");
		 }
		
		
		
		
		
		
		/*int arr1[]={1,3,5,2};
		int arr2[]=new int[arr1.length];
		System.out.println("First array elements");
		for(int i=0;i<arr1.length;i++)
		 System.out.print(arr1[i]+",");
		System.out.println();
		System.out.println("second array elements");
		for(int i=0;i<arr1.length;i++)
		{
		arr2[i]=arr1[i];
		System.out.print(arr2[i]+",");
		} */
	}

}
