import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
    			   int arr[]= {1,2,3,4,5,6,7};
    			   for(int i=0;i<arr.length;i++)
    			   {
    				   for(int j=i+1;j<arr.length;j++)
    				   {
    					   if(arr[i]>arr[j])
    					   {
    					       int temp=arr[i];
    						   arr[i]=arr[j];
    						   arr[j]=temp;   
    					   }    					  
    				   }
    				   
    			   }
    			   System.out.println("Elements in descending order is ");
    			   for(int i=0;i<arr.length;i++)
    				   System.out.print(arr[i]+",");
    			   System.out.println();
    			   System.out.println(Arrays.toString(arr));
    			   
    			   
}
}
    		   
    	
	
       
       
       

