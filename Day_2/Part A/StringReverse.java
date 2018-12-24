import java.util.Scanner;
/*
	* First take each character from last and add it to a temporary variable.
	* In each iteration charAt will take last char and add it to temp.
*/


public class StringReverse{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("====String Reverser====");
		System.out.print("Enter a String to reverse: ");
		String str = input.next();
		String temp = " ";
		for(int i = str.length()-1; i >= 0; i--){
			temp += str.charAt(i); 
		}
		
		System.out.print("The Reversed String is: "+ temp);
	}
}