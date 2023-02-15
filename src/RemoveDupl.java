import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDupl {

	public static void main(String[] args) {

              int arr[]= {1,2,3,4,5,6,7,6,4,2};
              ArrayList hash=new ArrayList();
              
              for(int a:arr)
              {if(hash.contains(a))
                 {
            	  System.out.print(a+" ");
                 }
              else {
            	  hash.add(a);
              }
              //
              //System.out.println(hash);          
              
              
              
//              int arr2[]=new int[arr.length];
//              for(int i=0;i<arr.length;i++) {
//            	  for(int j=i+1;j<arr.length;j++) {
//            	  if((arr[i])==arr[j]) {
//                        System.out.print(arr[i]+" ");            	  }
//            	  
//              }
              
	}//for(int k=0;k<arr2.length;k++)
  	  //System.out.print(arr2[k]+" ");
            //
          //    System.out.println(Arrays.toString(arr));
}
}
