package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dynamic array --- ArrayList 
		
	// ArrayList maintains insertion order 
	// ArrayList can be fetched from any index 
	// Can have common values 
	// Synchronized 
		
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		System.out.println(ar.size());
		ar.add(78);
		ar.add(0);
		// fetching value from index
		System.out.println(ar.get(2));
		
		for(int i = 0 ; i < ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		// Generic type array list 
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		
		// Iterating through object 
		EmployeeClass e1 = new EmployeeClass(12,"Chinmay","Marathi"); 
		EmployeeClass e2 = new EmployeeClass(123,"Chinmay2","Marathi3"); 
		EmployeeClass e3= new EmployeeClass(1234,"Chinmay3","Marathi4"); 
		
		
		ArrayList<EmployeeClass> ar3 = new ArrayList<EmployeeClass>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		Iterator<EmployeeClass> it = ar3.iterator();
		while(it.hasNext()){
			
			EmployeeClass emp = it.next();
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.sex);
			
		}
		
		// Addall concept 
		
		ArrayList ar8 = new ArrayList();
		ar8.add(0);
		
		ar8.addAll(ar);
		for(int i = 0 ; i < ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
		
		// Removeall concept 
		
		ar8.removeAll(ar);
		for(int i = 0 ; i < ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
		
		//retainall concept 
		
		
		ar8.retainAll(ar);
		for(int i = 0 ; i < ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
		
		
		
		
		
		
	}

}
