
package question;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class MyStack{
	
	private Character[] a; // array of items
	

	
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	
	// Declare the array as 4 element
	public MyStack() {
		a = new Character[4];
		
	}
	
	// Check if stack is empty
	public boolean isEmpty() {
		for(int i=0; i<size(); i++) {
			if(a[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	// Return the number of elements in the stack
	public int size() {
		int arrLength = a.length;
		return arrLength;
	}
	
	// double the size of the array without losing the elements of a
	private void resize() {
		Character[] doubleA = new Character[size()*2];
		for(int i=0; i<size(); i++) {
			doubleA[i] = a[i];
		}
		a = doubleA;
		
	}
	// Add new items to stack
	public void push(char item) {
		for(int i=0; i<size(); i++) {

			if(a[size()-1] == null) {
				if(a[i] == null) {
					a[i] = item;
					break;
				}

			}else{
				resize();
			}
		}
	}
       // Pops a character from the stack
		public char pop() {
			
				
			char removedEl = 'r';
			
			Character[] doubleA = new Character[size()];
			
			for(int i=0; i<size()-1;i++) {
				// found the last element which is not null
				if(a[i+1] == null && a[i] != null) {
					
					for(int j=0; j<size(); j++) {
						if(j == i) {
							// Hold the removed element
							removedEl = a[i];
							continue;
						}else {
							doubleA[j] = a[j];
						}
					}
					// Equalize new array and my array
					a = doubleA;
					
				}else {
					if(a[size()-1] != null) {
						for(int j=0; j<size()-1; j++) {
							doubleA[j] = a[j];
						}
						removedEl = a[size()-1];
						a = doubleA;
						// To get out of the first for loop
						// because now our last element is null and it is fit for first condition
						break;
					}
				}
			}
			
			// Return the removed element
			return removedEl;

		}
        // Return the last element without removing
		public char peek() {
			
			char lastEl = 'l';
			for(int i=0; i<size(); i++) {
				// if the element is null then not make it the last element
				if(a[i] == null) {
					continue;
				}
				lastEl = a[i];
			}
//			System.out.println(Arrays.toString(a));
			return lastEl;

		}

	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

