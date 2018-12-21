import java.util.Scanner;

public class StringReverse{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("====String Reverser====");
		System.out.print("Enter a String to reverse: ");
		String string = input.next();
		String temp = " ";
		for(int i = string.lenght()-1; i >= 0; i--){
			temp += string.chatAt(i); 
		}
		
		System.out.print("The Reversed String is: "+ temp);
	}
}