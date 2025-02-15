package csc372module6cta;

import java.util.ArrayList;

public class SelectionSortMethod { //this class represents a class that handles a selection sort method
	ArrayList<Student> studentList; //creating a arraylist attribute
	Namecomparator nameComparator = new Namecomparator(); //creating a namecomparator object as an attribute
	Rollnumcomparator rollNumComparator = new Rollnumcomparator(); //creating a rollnumcomparator object has an attribute
	int minNum;
	
	public SelectionSortMethod(ArrayList<Student> studentList) { //Default constructor for the selectionsortmethod
		this.studentList = studentList;
		
	}
	
	public void selectionSort() {// this is a method that handles a selection sorting algorithm
		int j;//counter variable for inner loop
		int i;//counter variable for outer loop
		
	
		
		for(i = 0; i <= studentList.size() - 1; i ++) { //outer for loop that acts as a base index for the sorting algorithm
			
			for(j = i; j <= studentList.size() - 1; j++) { //inner loop that acts a search for the min number compared to the base num
				if(rollNumComparator.compare(studentList.get(i), studentList.get(j)) ==  -1) { //if ob1 is greater than ob2
					this.minNum = studentList.get(j).getRollno();//assigns the minNum attribute to the current index's roll number
					
					Student tempVar = studentList.get(i); //creating a temporary variable for the base index
					studentList.set(i, studentList.get(getMinNumIndex()));//sets the base index to the min index's element
					studentList.set(getMinNumIndex(), tempVar); //assigns the minnum's index to the original base element
				}

			
			}
		
		}
		
		int h; //counter variable for outer loop
		int u;//Counter variable for inner loop
		
		for(h = 0; h <= studentList.size() -1; h++) {//this is for the base variable h as the base index
			for(u = h; u <= studentList.size() - 1; u++) {//inner loop that searches for when ob1 is greater than ob2
				if(nameComparator.compare(studentList.get(h), studentList.get(u)) == 1) { //if ob1 is greater than ob2
					Student tempVar = studentList.get(h); //creates a temporary variable for the base index h
					studentList.set(h, studentList.get(u)); //sets the base index to the u element
					studentList.set(u, tempVar);//sets the u element to the base element
				}
			}
		
		}
	}
	
	public int getMinNumIndex() { //Method that returns the min numbers index
		int i;
		for(i = 0; i <= studentList.size() - 1; i ++ ) {
			if(studentList.get(i).getRollno() == minNum) {
				return i;
			}
		}
		
		return -1;
	
	}
	
		
		
	}


