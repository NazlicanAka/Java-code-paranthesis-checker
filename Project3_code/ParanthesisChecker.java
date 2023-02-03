
package question;

import java.util.Arrays;

public class ParanthesisChecker {
	

	public boolean isCorrect(String javaCode) { 
		
		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		MyStack x = new MyStack();
		
		for(int i=0; i<javaCode.length(); i++) {
			
			if(javaCode.charAt(i) == '"') {
//				System.out.println("tırnak var");
				i++;
				while(javaCode.charAt(i) != '"') {
//					System.out.println("whiledayım");
					i++;
				}
				
			}
			
			
			// If parenthesis are open push them in the array
			else if(javaCode.charAt(i) == '(' || javaCode.charAt(i) == '{') {
//				System.out.println("pushlama");
				
				x.push(javaCode.charAt(i));
				// If parenthesis are closed, then check if the last element of the array and the closed complete each other 	
			}else if(javaCode.charAt(i) == ')') {
				if(x.peek() == '(')
//				System.out.println("poplama");
				x.pop();
				else if(x.isEmpty()) {
					return false;
				}
				
				
			}else if(javaCode.charAt(i) == '}') {
				if(x.peek() == '{')
//				System.out.println("poplama");
				x.pop();
				else if(x.isEmpty()) {
					return false;
				}
			}
			
			
		}
		
		
		return x.isEmpty();

		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
		
	}
	
}

////If the first element is closed, return false
//if(x.isEmpty()) {
//	return false;
//}
