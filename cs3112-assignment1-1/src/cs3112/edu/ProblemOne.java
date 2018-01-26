package cs3112.edu;

import java.util.Scanner;

//For a given positive integer n, output the first n primes.
//e.g. n=3, output: 2,3,5; n=7, output: 2,3,5,7,11,13,17.

public class ProblemOne {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive integer:");
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println("The first " + n + " primes:");
		
		int count = 0;
		int num = 2;
	
	//while count does not equal number of prime numbers entered keep searching
	while(count != n)
	{
		//determine if number is prime or not
		boolean prime = true;
		
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			//if number divides any other number it is not prime
			if(num % i == 0)
			{
				prime = false; 
				break;
			}
		}
	
		if(prime)
		{
			count++;
			System.out.println(num);
		}
		num++;
	}
}
}