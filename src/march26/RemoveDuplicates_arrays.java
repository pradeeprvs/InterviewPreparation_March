package march26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer arr[] = {10,20,20,30,30,40,50,50}; 
		 List<Integer> a= Arrays.asList(arr);
		 Set<Integer> hs= new HashSet<>();
		 hs.addAll(a);
		 System.out.println(hs);
	}

}
