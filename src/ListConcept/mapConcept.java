package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class mapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map stores the collection in the form of key value pair
		
		// Map is a interface and  HashMap and HashSet are classes 
		
		
		//Hashmap 
		
		// Hash map is a class implements map interface 
		//extends AbstractMap
		//it contains unique elements
		//stores the value in key value pair format 
		// it may be one null  key and multiple null  values 
		// it maintains no order 
		//hashMap is not synchronized -- not thread safe 
		// concurrent modification exception --> Fail - Fast Condition 
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "sameer");
		hm.put(2, "sameera");
		hm.put(3, "sameeree");
		hm.put(4, "sameerya");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		
		
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());	
		}
		
		hm.remove(1);
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());	
		}
		
		HashMap<Integer,EmployeeClass> hm1 = new HashMap<Integer,EmployeeClass>();
		
		EmployeeClass e1 = new EmployeeClass(23,"Chinmay","Male");
		EmployeeClass e2 = new EmployeeClass(24,"Chinmay2","Malea");
		EmployeeClass e3 = new EmployeeClass(26,"Chinmay23","Maleaaa");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for(Entry <Integer, EmployeeClass> m1:hm1.entrySet()) {
				 int key = m1.getKey();
				 EmployeeClass e = m1.getValue();
				 System.out.println(" Employee "+ key +" Info: ");
				 System.out.println(e.age+" "+e.name +""+ e.sex);
		 
		}

	}

}
