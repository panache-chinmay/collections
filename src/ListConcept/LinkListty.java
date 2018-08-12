package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkListty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
	
		// Adding the values to the link list 
		ll.add("chinmayh");
		System.out.println(ll.get(0));

		ll.add("chinmayeh1");
		ll.add("chinmayee");
		ll.add("chinmayeeeh");
		ll.add("chinmayheee");
		ll.add("chinmayheeeee");
		System.out.println(ll.size());
		
		if(ll.isEmpty()) {
			System.out.println("Google");
		}
		else {
			System.out.println("Not a value ");
		}
		//remove by index
		
		ll.remove(1);
		System.out.println(ll);
		
		//for 
		// advanced for loop 
		// iterator 
		// while 
		
		
		// for loop 
		
		for(int i = 0 ; i < ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("*******************");
		
		for(String llly:ll) {
			System.out.println(llly);
		}
		System.out.println("*******************");
		
		int num = 0 ;
		
		while(ll.size() > 0) {
			
			System.out.println(ll.get(num));
			num ++;
		}
		System.out.println("*******************");
		
		// Iterator 
		
		System.out.println("*******************");
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			String emp = it.next();
			System.out.println(emp);
		}
		
		
		
		
		
	
		
		
		
		
		

	}

}
