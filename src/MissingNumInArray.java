import java.util.Arrays;
import java.util.HashSet;

public class MissingNumInArray {

	public static void main(String[] args) {
      int arr[]= {5, 7,8,10,12,13,14};
      Arrays.sort(arr);
      int length = arr.length-1;
      int k = arr[0];
//      System.out.println(arr[length]);
      int j = arr[length];
      
      HashSet hashset=new HashSet();
      for(int a:arr) {
    	  hashset.add(a);
      }
      for(int i=k;i<=j;i++)
      {
    	  if(!hashset.contains(i))
    	  {
    		  System.out.print(i+ " ");
    	  }
      }
	}

}
