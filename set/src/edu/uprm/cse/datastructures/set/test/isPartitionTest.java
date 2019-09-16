package edu.uprm.cse.datastructures.set.test;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;
import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class isPartitionTest {

	public static void main(String[] args) {
		Set<String> B = new ArraySet<String>();
		B.add("Joe");
		B.add("Ned");
		B.add("Amy");
		B.add("Pol");
		
		Set<String> s1 = new ArraySet<String>();
		Set<String> s2 = new ArraySet<String>();
		Set<String> s3 = new ArraySet<String>();
		
		s1.add("Ned");
		s2.add("Joe");
		s3.add("Amy");
		s3.add("Pol");
		@SuppressWarnings("unchecked")
		Set<String>[] sets = (Set<String>[])new Object[3];
		sets[0] = s1;
		sets[1] = s2;
		sets[2] = s3;
		
		System.out.println(isPartition(sets, B);
		
	}

	public  boolean isPartition(Set<String>[] sets, Set<String> B){
		
	return true;
	}
	

}
