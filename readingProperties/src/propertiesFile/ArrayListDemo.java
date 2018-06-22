package propertiesFile;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>(); 
		// by default its 10. if more than it auto re-allocate. 
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
		
	}

}
