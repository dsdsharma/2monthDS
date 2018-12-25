import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("==== Max Char in String ====");
        System.out.print("Enter a String: ");
        String str = input.next();
        char key;

        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		//Getting all the Characters with their count in hashmap.
        for (int i = 0; i <str.length() ; i++) {
            key = str.charAt(i);
             if(charCount.containsKey(key)){
                 charCount.put(key,charCount.get(key)+1);
             }else {
                 charCount.put(key, 1);
             }

        }
        //Getting largest value in map
        int intmax = (Collections.max(charCount.values()));
        
		// Printing largest key using foreach looping.
		for (Character c:
				charCount.keySet()) {
            if(charCount.get(c)==intmax){
                System.out.println("Most iterated character is: "+c);
            }

        }





    }

}
