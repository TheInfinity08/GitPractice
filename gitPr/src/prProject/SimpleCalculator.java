package prProject;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------++SIMPLE CALC++--------------------");
		int a,b,result=0;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
a = sc.nextInt();
System.out.println("Enter another number: ");
b = sc.nextInt();
System.out.println("Enter operation: ");
op = sc.next().charAt(0);
switch(op) {

case '+':
	result = a+b;
break;
case '-':
	result = a-b;
	break;
case '*':
	result = a*b;
	break;
case '/':
	result = a/b;
	break;
}

System.out.println("The result is: " + result);

}

	}


