package csc372module6cta;

import java.util.Comparator;

public class Rollnumcomparator implements Comparator<Student> { //class that represents a roll number comparator

	public Rollnumcomparator() {//default constructor
		
	}

	@Override
	public int compare(Student o1, Student o2) {//method that compares two objects' roll numbers 
		if(o1.getRollno() > o2.getRollno()) {
			return -1;
		}else if(o1.getRollno() == o2.getRollno()) {
			return 0;
		}
		
		return 1;
		
		
	}

}
