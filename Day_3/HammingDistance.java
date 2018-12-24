import java.util.Scanner;

public class HammingDistance{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str1, str2;
		int result=0;
		System.out.println("====Hamming Distance====");
		
		System.out.print("Enter the First String: ");
		str1= input.next();
		System.out.print("Enter the Second String: ");
		str2 = input.next();
		
		if(str1.length() != str2.length()){
			System.out.println("Entered Strings are not equal in length.");
			System.exit(-1);
		}else{
			for(int i=0; i < str1.length(); i++){
				if(str1.charAt(i) != str2.charAt(i)){
					result++;
				}
			}
			System.out.println("The Hamming Length for two strings is: "+result);
		}
	}
	
	
}