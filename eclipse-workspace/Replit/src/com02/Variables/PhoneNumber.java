package com02.Variables;

import java.util.Scanner;

/*
 * Write a program that asks user to input **int** values: `areaCode` and `localNumber`.

- Using concatenation put together in this format and assign to `String phoneNumber` variable:

`(222)-3334444`

- Write a print statement that displays (use the `phoneNumber` variable ): 

`Calling number (222)-3334444`
 */

public class PhoneNumber {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
	    int areaCode=scan.nextInt();
	    int localNumber=scan.nextInt();
	    
	    String phoneNumber;
	    //WRITE YOUT CODE HERE:


	    System.out.println("Calling number (" + areaCode + ")-" + localNumber );
	}

}
