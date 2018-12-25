import java.util.Scanner;

public class StringVowels{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.println("==== Vowels in a String ====");
		System.out.print("Enter a String: ");
		str = input.next();
		
		str = str.lowerCase();
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				count++;
			}
		}
		
		System.out.print("Number of vowels in "+str+" is: "+count);
		
	}
	
}