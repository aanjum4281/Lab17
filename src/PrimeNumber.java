import java.util.Scanner;

public class PrimeNumber {
//Amna
	//Sasi
	public static void main(String[] args) {
		String userInput;
		Scanner scnr = new Scanner(System.in);
		do {
		System.out.println("Which prime number are you looking for? ");
		int n = scnr.nextInt();
		
		int result = getNthPrime(n); 
		System.out.println("the prime number is " + result);
		
		System.out.println("Do you want to continue? (y/n)");
		userInput = scnr.next();
		} while (userInput.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye!");
		
		
		
		
	}
	public static int getNthPrime(int n) {
	
		int num, count, i;
		num = 1; 
		count = 0;
		
		while (count < n) {
			num = num+1;
			for (i = 2; i <= num; i++) {
				if  (num % i== 0) {
					break;
				}
			}
			if (i == num) {
				count = count+ 1;
			}
		}
		
		return num;
		}
}
