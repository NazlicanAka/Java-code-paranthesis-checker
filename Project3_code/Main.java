
package question;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
	// Main method is for you to test your code
	// You will not get any points here
	public static void main(String[] args) {
		
		// Example:
		// Code that displays Fibonacci Series:
//		
//		System.out.println("can ozan konserine gidicem yazın :(");
//		System.out.println(":{");
//		String javaCode1 = "}";

//		String javaCode1 = "class Main \r\n"
//				+ "  public static void main(String[] args) {\r\n"
//				+ "\r\n"
//				+ "    int n = 10, firstTerm = 0, secondTerm = 1;\r\n"
//				+ "    System.out.println(\"Fibonacci Series till \" + n + \" terms:\");\r\n"
//				+ "\r\n"
//				+ "    for (int i = 1; i <= n; ++i) {\r\n"
//				+ "      System.out.print(firstTerm + \", \");\r\n"
//				+ "\r\n"
//				+ "      // compute the next term\r\n"
//				+ "      int nextTerm = firstTerm + secondTerm;\r\n"
//				+ "      firstTerm = secondTerm;\r\n"
//				+ "      secondTerm = nextTerm;\r\n"
//				+ "    }\r\n"
//				+ "  }\r\n"
//				+ "}";
		
//		String javaCode1 =
//				"""
//				private static void waitForNextFrame() {
//			do {
//			{
//				deltaTime += System.currentTimeMillis() - previousTime;
//				previousTime = System.currentTimeMillis();
//				StdDraw.pause(1);
//			} while (deltaTime <= MS_PER_FRAME);
//
//			deltaTime -= MS_PER_FRAME;
//				}
//			
//						""";
		
//		String javaCode1 = 
//				"""
//				private static void addPointsAndWires() {
//			double step = 1.0 / numOfPointsPerAxis;
//			for (int i = 1; i <= numOfPointsPerAxis; i++) {
//				for (int j = 1; j <= numOfPointsPerAxis; j++) {
//					spacePoints.add(new SpacePoint(i * step, j * step));
//					System.out.println(" bill gates miyala hastalığından dolayı ölmüş :(  ")
//				}
//			}
//
//			sourceWires.add(new SourceWire(0.5, 0.5));
//		}
//		
//						""";
//		
//		System.out.println(javaCode1);
		ParanthesisChecker checker = new ParanthesisChecker();
		System.out.println(checker.isCorrect(javaCode1));
		
//		System.out.println(valid("(){}"));
//		System.out.println(checkEmpty());
		
//		MyStack x = new MyStack();
//		x.push('n');
//		System.out.println(x.peek());
//		System.out.println(x.isEmpty());
//		
//		
		
//		x.push('a');
//		x.push('z');
//		x.push('l');
//		x.push('ı');
//		x.push('n');
//		x.push('a');
//		x.push('z');
//		x.push('l');
//		x.push('ı');
//		
//		System.out.println(x.isEmpty());
		
//		System.out.println(x.pop());
//		System.out.println(x.size());
//		System.out.println(x.peek());
//		
//		Character[] arr = new Character[4];
//		System.out.println(Arrays.toString(arr));
		
//		pushMain('c');
		
//		String a = "abca";
//		System.out.println(a.indexOf('a'));
//	
//		
//		String s = "System.out.println(\"can ozan konserine gidicem yazın :(\");";
//		String sNew = "";
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i) == '"') {
//				System.out.println("x");
//				for(int j=i+1; j<s.length(); j++) {
//					if(s.charAt(j) == '"') {
//						System.out.println("c");
//						for(int k=i+1; k<j; k++) {
//							sNew = s.replace(s.charAt(k), ' ');
//							System.out.println(sNew);
//						}
//					}
//				}
//			}
//		}
//		System.out.println(sNew);
//		
//		String str = "abcdDCBA123a";
//		String a = str.replace("a", "=");
//		System.out.println(a);
	}
	
	private static int valid(String s) {
		ArrayList<Character> sArr = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			sArr.add(s.charAt(i));
		}
		
		for(int i=0; i<sArr.size(); i++) {
			if(sArr.get(i) == '(' && sArr.get(i+1) == ')') {
				sArr.set(i, 'a');
				sArr.set(i+1, 'a');
			}else if(sArr.get(i) == '{' && sArr.get(i+1) == '}') {
				sArr.set(i, 'a');
				sArr.set(i+1, 'a');
			}
		}
		System.out.println(sArr);
		
		for(char e: sArr) {
			if(e != 'a') {
				return 0;
			}
		}
		return 1;
		
			
		
		

}
	private static boolean checkEmpty() {
		Character[] a = new Character[4];

		int arrLength = a.length;
		if(arrLength == 0) {
			return true;
		}
		return false;
	}
	
	private static void pushMain(char item) {
		Character[] a = new Character[4];
		a[0] = '(';
		a[1] = '{';
		a[2] = '(';
		a[3] = '(';
		a[4] = '(';
		a[5] = '{';
		a[6] = '(';
		a[7] = '(';
		int aLength = a.length;
		for(int i=0; i<aLength; i++) {
//			
			if(a[aLength-1] == null) {
				if(a[i] == null) {
					a[i] = item;
					System.out.println(Arrays.toString(a));
					break;
			}
			
			}else{
				Character[] aNew = new Character[aLength*2];
				for(int j=0; j<aLength;j++) {
					aNew[j] = a[j];
					
				}
				aLength = aNew.length;
				for(int j=0; j<aLength;j++) {
					if(aNew[j] == null) {
						aNew[j] = item;
						break;
					}
						
				}
				System.out.println(Arrays.toString(aNew));
				
				
			}
			
		
		
			
	    }
		
	}
	
	
}



