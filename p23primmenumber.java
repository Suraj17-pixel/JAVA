package jDemos1;
import java.util.Scanner;
public class p23primmenumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter number => ");
					int num = sc.nextInt();
					
					boolean isprime = true;

					if (num <= 1) {
					    System.out.println("The number " + num + " is not prime (neither prime nor composite).");
					} else {
					    for (int i = 2; i <= Math.sqrt(num); i++) {
					        if (num % i == 0) {
					            isprime = false;
					            break; 
					        }
					    }

					    if (isprime) {
					        System.out.println("The number " + num + " is prime.");
					    } else {
					        System.out.println("The number " + num + " is not prime.");
					    }
					}
				}
		    }

		

	}