import java.util.Scanner;

public class FizzBuzz{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("====FizzBuzz====");
		System.out.print("Enter the number for Fizz Buzz iteration: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=num;i++){
			
			if(i%15==0){
				System.out.print("FizzBuzz ");
			}else if(i%3==0){
				System.out.print("Fizz ");
			}else if(i%5==0){
				System.out.print("Buzz ");
			}else{
				System.out.print(i + " ");
			}
			
		}
	}
}