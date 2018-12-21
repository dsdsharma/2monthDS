import java.util.Scanner;

public class StringPalindrome{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("==== String Palindrome Checker ====");
		System.out.print("Enter a String: ");
		
		String str = input.next();
		char first,last;
		int flag =1;
		
		for(int i = 0; i<=(str.length()-1)/2; i++){
			first = str.charAt(i);
			last = str.charAt(str.length()-1-i);
			
			if(first !=last){
				flag = 0;
				break;
			}
		}
		
		if(flag==1){
			System.out.print(str + " is in palindrome.");
		}else{
			System.out.print(str + " is not in palindrome.");
		}
	}
	
}