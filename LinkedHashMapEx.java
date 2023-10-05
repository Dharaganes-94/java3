package Advanced;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     LinkedHashMap<Object,Object> lhm= new LinkedHashMap<Object,Object>();
     LinkedHashMap<Object,Object> lhm1= new LinkedHashMap<Object,Object>();

		
		lhm.put(101, "java");
		lhm.put(102, "python");
		lhm.put(103, "selenium");
		lhm.put(104, 2000);
		lhm.put(null, "20");
		lhm.put(110, null);
		
		lhm1.put(108,"program");
		lhm1.put(109,1000);

		
		
		System.out.println("Default LinkedHashMap "+ lhm);
		
		lhm.remove(110);
		System.out.println("Remove "+ lhm);
		
		System.out.println("get-->"+lhm.get(102));
		
		System.out.println("IsEmpty   "+lhm.isEmpty());
		System.out.println("IsEmpty   "+lhm1.isEmpty());

        System.out.println("Contains key-->"+lhm.containsKey(105));
        
        System.out.println("contains value-->"+lhm1.containsValue(109));
        
        System.out.println("Size-->"+lhm.size());
		
		//Keys are returned in set format because both Set and keys are unique
		System.out.println("Keys-->"+lhm.keySet());
		
		System.out.println("values-->"+lhm.values());
		
		System.out.println("entryset-->"+lhm.entrySet());
	}
	

}
