import java.util.HashMap;

public class CountDuplicate {
	public static void main(String[] args) {
		
	
	int arr[]= {1,2,3,4,5,6,5,4,3};
	
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	map.put(1,1);
	map.put(2,1);
	map.put(3,1);
	map.put(4,1);
	map.put(5,10);
	map.put(2,1);
	
	
	for(int a:arr) {
		if(map.containsKey(a))
		{
			map.put(a, map.get(a)+1);
		}
		else
		{
			map.put(2, 1);
		}
		
	
	}map.forEach((k,v)->System.out.println("key is "+k+" value is "+v));
	}
}
