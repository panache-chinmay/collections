package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [] = new int [3];
		
		//staic array as array sized is fixed 
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add("Chinmay");
		ar.add(true);
		// Array list - Dynamic array 
		//We can store same type of data
		// We can retrieve data by index
		// Maintain insertion order
		// Data is synchronized 
		// Size is not fixed 
		//---------------------------->
		// two ways to retrieve data 
		// by for loop 
		// by using iterator 
		System.out.println(ar.size());
		
		for(int i = 0 ; i < ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("******************************************");
		
		
		// Generic and non generic type of array list 
		// For generic type of array list we store same type of data 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		// We can only store integer type of data in ArrayList ar1 
		//ar1.add("Chinmay"); This is not application as generic ArrayList of type integer
		
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		ar1.add(7);
		ar1.add(8);
		
		for(int i = 0 ; i < ar1.size() ; i++) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("******************************************");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		// We can only store integer type of data in ArrayList ar1 
		//ar1.add("Chinmay"); This is not application as generic ArrayList of type integer
		
		ar2.add("Chinmay");
		ar2.add("Chinmay11");
		ar2.add("Chinmay31");
		ar2.add("Chinmay14");
		ar2.add("Chinmay143");
		ar2.add("Chinmay123");
		ar2.add("Chinmay123");
		ar2.add("Chinmay12222");
		ar2.add("Chinmay1123456");
	
		for(int i = 0 ; i < ar2.size() ; i++) {
			System.out.println(ar2.get(i));
		}
		
		EmployeeClass e1 = new EmployeeClass(23,"Chinmay","Male");
		EmployeeClass e2 = new EmployeeClass(23,"Chinmay2","Malea");
		EmployeeClass e3 = new EmployeeClass(23,"Chinmay23","Maleaaa");
		
		ArrayList <EmployeeClass>  emp = new ArrayList<EmployeeClass>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator <EmployeeClass> it = emp.iterator();
		while(it.hasNext()) {
			EmployeeClass emp1 = it.next();
			System.out.println(emp1.age);
			System.out.println(emp1.sex);
			System.out.println(emp1.name);
		}
		
		//addAll --> add elements of right array list to left list array 
		//removeAll --> remove all elements of right ArrayList
		//retainAll --> retainAll will give the common elements between the array
		
		System.out.println("***************************");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		// We can only store integer type of data in ArrayList ar1 
		//ar1.add("Chinmay"); This is not application as generic ArrayList of type integer
		
		ar4.add("Chinmay");
		ar4.add("Chinmay11f");
		ar4.add("Chinmay31f");
		ar4.add("Chinmay14f");
		ar4.add("Chinmay143f");
		ar4.add("Chinmay123f");
		ar4.add("Chinmay12f3");
		ar4.add("Chinmay122f22");
		ar4.add("Chinmay112f3456");
		
//		ar2.addAll(ar4);
//		
//		for(int i = 0 ; i < ar2.size() ; i++) {
//			System.out.println(ar2.get(i));
//		}
//		
//		ar2.removeAll(ar4);
//		for(int i = 0 ; i < ar2.size() ; i++) {
//			System.out.println(ar2.get(i));
//		}
//		System.out.println("***");
		ar2.retainAll(ar4);
		
		for(int i = 0 ; i < ar2.size() ; i++) {
			System.out.println(ar2.get(i));
		}
		
		
		

	}

}
