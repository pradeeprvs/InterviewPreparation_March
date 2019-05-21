package collections;



import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program demonstrates usage of HashMap. And also contains the examples for entryset,keyset and values 

		HashMap<String, Integer> map= new HashMap<>();
		map.put("First", 1);
		map.put("Second", 2);
		map.put("Third", 3);
		map.put("Fourth", 4);
		map.put("Fifth", 5);

		//Printing all the Map Object contents
		System.out.println(map);

		//Usage of KeySet : Retrieves all the Keys from Given Map Object
		Set<String> keys= map.keySet();
		System.out.println("Keys present in this Map Object are : "+ keys);

		//Usage of Entry Set : This will return all the Map Keys and Values in a Set format
		Set<Entry<String, Integer>> entries= map.entrySet();
		System.out.println("Key Value pairs present in this Map Object are : "+ entries);

		//Accessing individual keys and values from entryset
		for(Entry<String, Integer> entry : entries)
		{ 
			String key = entry.getKey();
			Integer value = entry.getValue(); 
			System.out.printf("key: %s, value: %d %n", key, value); 
		}
		
		//Iterate using keys
		 Iterator<String> keys2 = map.keySet().iterator();
		 while(keys2.hasNext()) {
		   String key2 = keys2.next();
		   System.out.println(key2+"\t"+map.get(key2));
		 }

		//Usage of Values : Returns the Values set from the Map
		Collection<Integer> values= map.values();
		System.out.println("Values present in this Map Object are : "+ values);
		
		
		Employee e1=new Employee("pradeep", 26, "Hyderabad");
		Employee e2=new Employee("praveen", 27, "Ongole");
		Employee e3=new Employee("Sanjeev", 25, "Bangalore");
		
		HashMap<Integer, Object> hash=new HashMap<>();
		hash.put(1, e1);
		hash.put(2,e2);
		hash.put(3,e3);
		
		Set<Entry<Integer, Object>> entries1= hash.entrySet();
		for(Entry<Integer, Object> entry1 : entries1)
		{ 
			Integer key1 = entry1.getKey();
			Employee value2 = (Employee) entry1.getValue(); 
			System.out.printf("Key : "+key1, " Value : "+ value2); 
		}
	}

}
