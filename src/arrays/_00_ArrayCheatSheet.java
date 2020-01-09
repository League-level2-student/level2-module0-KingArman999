package arrays;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random ran = new Random();
		
		//1. make an array of 5 Strings
		String[] names = new String[5];
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names [2]= "John";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//6. make an array of 50 integers
		int [] integers = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i = 0; i < integers.length; i++) {
			integers[i]= ran.nextInt(50);
			System.out.println(integers[i]);
		}
		int Smallest = integers[0];
		for (int i = 0; i < integers.length; i++) {
		if (integers[i]<Smallest) {
				Smallest = integers[i];
		}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(Smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		for (int i = 0; i < integers.length; i++) {
			integers[i]= ran.nextInt(50);
			System.out.println(integers[i]);
		}
		int largest = integers[0];
		for (int i = 0; i < integers.length; i++) {
			if (integers[i]>largest) {
				largest = integers[i];
		}
		}
		System.out.println(largest);
		}
	}
