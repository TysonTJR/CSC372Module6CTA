package csc372module6cta;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>(); //this creates a student arraylist containing student objects
		
		Student newStudentOne = new Student(10, "Jeremy", "2000 new world rd"); //creates a new student
		studentList.add(newStudentOne); // adds object to list
		
		Student newStudentTwo = new Student(100, "Rob", "8888 unknown dr"); //creates a new student
		studentList.add(newStudentTwo);// adds object to list


		Student newStudentThree = new Student(300, "Tony", "8383 new york");//creates a new student
		studentList.add(newStudentThree);// adds object to list


		
		Student newStudentFour = new Student(11, "Barbara", "2777 boston ave");//creates a new student
		studentList.add(newStudentFour);// adds object to list


		Student newStudentFive = new Student(1, "Alex", "4832 new Richmond dr");//creates a new student
		studentList.add(newStudentFive);// adds object to list


		Student newStudentSix = new Student(2, "Yussif", "2000 new world rd");//creates a new student
		studentList.add(newStudentSix);// adds object to list


		Student newStudentSeven = new Student(50, "Hank", "2000 new world rd");//creates a new student
		studentList.add(newStudentSeven);// adds object to list


		Student newStudentEight = new Student(96, "Rick", "2000 new world rd");//creates a new student
		studentList.add(newStudentEight);// adds object to list


		Student newStudentNine = new Student(33, "Nate", "2000 new world rd");//creates a new student
		studentList.add(newStudentNine);// adds object to list


		Student newStudentTen = new Student(23, "Osson", "2000 new world rd");//creates a new student
		studentList.add(newStudentTen);// adds object to list


		
		SelectionSortMethod selectionsort = new SelectionSortMethod(studentList);  //creates a selectionsortmethod object that passes a list
		
		selectionsort.selectionSort(); //calls the selectionSort method from the SelectionSort class
		
		int i;
		for(i = 0; i <= studentList.size() - 1; i ++) { //this is a for loop that prints out each objects information 
			System.out.println("Roll Number:" + studentList.get(i).getRollno() + " " + "Name:" + studentList.get(i).getName() + " " + "Address:" + studentList.get(i).getAddress());
		}
		
	
		
		}

	}


