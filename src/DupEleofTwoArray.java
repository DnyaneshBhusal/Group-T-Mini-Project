
import java.util.Arrays;
import java.util.List;

public class DupEleofTwoArray {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list2=Arrays.asList(3,2,6,22,33,7);
		
		for(int a:list) {
	    	for(int i=0;i<list2.size();i++) {
	    	if(a==list2.get(i))
	    	{
	    		System.out.print(a+" ");
	    	}
	    	}
		}
	}
}
//       int arr[]= {1,2,3,4,5,6,7,8,9};
//       int arr2[]= {3,2,6,22,33,7};
//    for(int a:arr) {
//    	for(int i=0;i<arr2.length;i++) {
//    	if(a==arr2[i])
//    	{
//    		System.out.print(a+" ");
//    	}
//    	}
//    	
//    }
	

