package app;

import java.util.Scanner;

import system.Calculation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner sc = new Scanner(System.in);
	  char q = 'y';
	  
	  while(q == 'y') {
		  
		  System.out.println("Weight");
		  Double weight = sc.nextDouble();
		  System.out.println("Height");
		  Double height = sc.nextDouble();
		  Calculation calculation = new Calculation(weight,height);
		  calculation.toString();
		  System.out.println("do you want to continue?(y/n)");
		  q = sc.next().charAt(0);
		  
		  
		  
	  }
	  
	  
	  sc.close();
	  
	
	}
	

}
