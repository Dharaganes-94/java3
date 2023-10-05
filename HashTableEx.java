package Advanced;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Object,Object> ht1 = new Hashtable<Object,Object>();
		
		Hashtable<Integer,String> ht2 = new Hashtable<Integer,String>();
		
		Hashtable ht3 = new Hashtable(100); 
		
		Hashtable hs4= new Hashtable(100,(float)0.90);

		//initial capacity is 11 and fill ratio of 0.75
        
		//no null key is allowed
		
		ht1.put(101, "guvi");
		ht1.put(103, "java");
		ht1.put(105, 2000);
		ht1.put(104, "selenium");
		//ht1.put(null, 200); //null key is not allowed

		System.out.println("Default hashtable"+ht1);
		
		ht1.remove(105);
		System.out.println("remove "+ht1);
		
		System.out.println("get  "+ht1.get(104));

		System.out.println("Is empty-->"+ht1.isEmpty());
		System.out.println("Is empty-->"+ht2.isEmpty());
		
		System.out.println("contains key-->"+ht1.containsKey(1));
		System.out.println("contains key-->"+ht2.containsKey(100));
		
		System.out.println("contains value-->"+ht1.containsValue("python"));
		System.out.println("contains value-->"+ht2.containsValue("c"));
		
		System.out.println("Size-->"+ht1.size());
		
		//Keys are returned in set format because both Set and keys are unique
		System.out.println("Keys-->"+ht1.keySet());
		
		System.out.println("values-->"+ht1.values());
		
		System.out.println("entryset-->"+ht1.entrySet());
		
		ht2.clear();
		System.out.println("Ht2 after clear-->"+ht2);
		
        Set s= ht1.entrySet();
		
		//iterator
		Iterator itr= s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		 



	}

}
