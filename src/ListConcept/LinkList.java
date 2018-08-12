package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Chinmay");
		ll.add("Chinmaye");
		ll.add("Chinmayf");
		ll.add("Chinmayg");
		
		System.out.println(ll);
		
		ll.addFirst("chinma");
		ll.addLast("Chin");
		
		System.out.println(ll);
		
		// get 
		
		System.out.println(ll.get(0));
		
		//set
		
		ll.set(0, "Qwerty");
		
		System.out.println(ll);
		
		// Remove First 
		
		ll.removeFirst();
		
		System.out.println(ll);
		
		// Remove Last 
		ll.removeLast();
		
		System.out.println(ll);
		
		//Remove with Index 
		
		ll.remove(1);
		
		System.out.println(ll);
		
		//Methods to print LinkedList 
		//For loop
		// Advanced for loop 
		// Iterator 
		//While loop 
		for(int i = 0 ; i < ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		// Advanced for loop 
		System.out.println("****************************************");
		for(String lsd:ll) {
			System.out.println(lsd);
		}
		
		System.out.println("****************************************");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("****************************************");
		
		int num = 0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num ++;
		}
		
		
		
	}

}
