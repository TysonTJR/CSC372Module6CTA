package csc372module6cta;

import java.util.Comparator;

public class Namecomparator implements Comparator<Student> { // this class represents a comparator that compares objects' names
	
	
	public Namecomparator() { //default constructor of a Namecomparator class
		
	}

	@Override
	public int compare(Student o1, Student o2) { //method that compares two objects' names 
		return o1.getName().compareTo(o2.getName());
		
	}

}
