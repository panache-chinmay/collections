package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("chinmaya");
		ll.add("chinmayb");
		ll.add("chinmayc");
		ll.add("chinmayye");
		ll.add("chinmayyf");
		
		System.out.println(ll);
		
		// Adding string to first and last to ll
		ll.addFirst("chin");
		ll.addLast("chinmay");
		
		System.out.println(ll);
		
		//Removing first and last string 
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(	ll.size());
		
		// Removing by index 
		ll.remove(2);
		
		// Adding by index
		ll.add(2, "Ram");
		System.out.println(ll);
		
		//set the value 
		ll.set(2, "Ramesh");
		System.out.println(ll);
		
		for(int i = 0 ; i < ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
		// for each loop 
	System.out.println("------------------------------------------------------------");
		
	for(String ll2 :ll) {
		System.out.println(ll2);
	}
	
	System.out.println("------------------------------------------------------------");
	
	// Using iterator 
	
	Iterator<String> it = ll.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("-------------ddd-----------------------------------------------");
	
	//Using while loop 
	int num = 0;
	while(num < ll.size()) {
		System.out.println(ll.get(num));
		num ++;
	}
	System.out.println("------------------------------------------------------------");
		
	}

}
