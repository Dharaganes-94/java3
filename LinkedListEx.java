package Advanced;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		
		ll2.add("java");
		ll2.add("selenium");
		
		ll.add("java");
		ll.add(200);
		ll.add(3.2);
		ll.add(true);
		ll.add('D');

		
		System.out.println("The LinkedList values   "+ll);
		
		ll.set(0,"python");

		System.out.println("set at index 0  "+ll);
		
		ll.add(1,"java");
		System.out.println("add at index 1  "+ll);
		
		ll.getFirst();
	
		System.out.println("first element in the linkedList  "+ll.get(2));
		
		ll.remove(4);
		System.out.println("remove at index 4  "+ll);
		
		ll.getLast();
		
		System.out.println("getlast element  in the linkedList  "+ll.get(4));
		
	    ll.addFirst("selenium");

		System.out.println("first added ekement in the linkedList  "+ll);
		
		ll.addLast(true);

		System.out.println("last added ekement in the linkedList  "+ll);
		
		System.out.println(ll.isEmpty());
		System.out.println(ll2.isEmpty());
		
		System.out.println(ll.contains("java"));
		System.out.println(ll2.contains("selenium"));
		
		ll2.retainAll(ll);
		
		System.out.println("Retainall  "+ll);

		
		

		



		
		

		

		

	}

}
