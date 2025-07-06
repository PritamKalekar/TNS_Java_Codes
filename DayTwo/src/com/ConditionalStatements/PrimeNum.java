package com.ConditionalStatements;

import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num<=1) {
			System.out.println(" is not a prime number");
		}
		else {
			boolean isPrime = true;
			
			for(int i=2;i <= Math.sqrt(num);i++) {
				if(num % i ==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
		sc.close();
	}

}
