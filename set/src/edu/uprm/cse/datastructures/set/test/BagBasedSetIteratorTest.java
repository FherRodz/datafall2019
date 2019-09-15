package edu.uprm.cse.datastructures.set.test;

import java.util.Iterator;

import edu.uprm.cse.datastructures.set.BagbasedSet;
import edu.uprm.cse.datastructures.set.Set;

public class BagBasedSetIteratorTest {
	public static void main(String[] args) {
		Set<String> s1 = new BagbasedSet<String>();
		
		s1.add("Ned");
		s1.add("Jil");
		s1.add("May");
		s1.add("Apu");
		s1.add("Ned");
		s1.add("Fher");
		s1.add("Ron");
		
		
		for(String s : s1) {
			System.out.println(s);
		}

	}
}
