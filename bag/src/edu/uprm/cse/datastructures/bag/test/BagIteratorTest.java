package edu.uprm.cse.datastructures.bag.test;

import java.util.Iterator;

import edu.uprm.cse.datastructures.bag.Bag;
import edu.uprm.cse.datastructures.bag.DynamicBag;

public class BagIteratorTest {
	
	public static void main(String[] args) {
		Bag b1 = new DynamicBag();
		
		b1.add("Ned");
		b1.add("Phil");
		b1.add("Ron");
		b1.add("Bob");
		b1.add("May");
		b1.add("Jil");
		
		

		for(Object s : b1) {
			System.out.println(s);
		}

	}

}
