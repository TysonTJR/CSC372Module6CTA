package csc372module6cta;

public class Student { //class that represents a student object
	private int rollno;
	private String name;
	private String address;
	
	
	public Student(int rollno, String name, String address) { //parameterized constructor that passes student information
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	
	public int getRollno() { // getter method that returns a roll number
		return this.rollno;
	}
	
	public String getName() { //getter method that returns a name 
		return this.name;
	}
	
	public String getAddress(){//getter method that returns a address
		return this.address;
	}
	

}
