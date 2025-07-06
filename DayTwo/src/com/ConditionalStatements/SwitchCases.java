package com.ConditionalStatements;

public class SwitchCases {

	public static void main(String[] args) {
		char x='L';
		
		switch(x)
		{
		
		case 'l':
			System.out.println("This code contains letters");
			break;
		case 'd':
			System.out.println("This code contains digits");
			break;
		case 's':
			System.out.println("This code contains symbols");
			break;
		case 'w':
			System.out.println("This code contains whitespaces");
			break;
		default:
			System.out.println("This code doesn't contain any leters,digits,symbols,whitespaces");
		}
	}

}
