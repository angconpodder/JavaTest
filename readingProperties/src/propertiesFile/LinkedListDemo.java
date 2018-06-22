package propertiesFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>(); 
		// Array List - {0,1,2...}
		// -- Adds it in the end, getting it fast. Remove from anywhere but takes time to re-allocate
		//Linked List - [0] <> [1] <> [2] .. linked to prev and next
		// -- here re-allocation is not issue because the pointer changes instead of the value shifting
		names.add("AP");
		names.add("Tom");
		names.add("Joy");
		names.add("AP");
		names.add("Tom");
		names.add("Joy");
		names.add("AP");
		names.add("Tom");
		names.add("Joy");
		names.add("AP");
		names.add("Tom");
		names.add("last");
		
		System.out.println(names.size() + names.get(0));
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.remove(0);
		
		// Relocation will happen; because AP is removed from 0, so TOM will be 0 now
		// this takes time when you have remove lot of things, for that us linked list
		System.out.println(names.size() + names.get(0));
		
		for (String name : names) {
			System.out.println(name);
		}
		
		//List interface, you can declare it like this as well.
		List<Integer> lList = new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();
		
		aList.add(10);
		aList.add(1, 100);
		
	}

}
