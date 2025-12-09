/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
//System.out.println("Hello World");
//
//Activity 1
//System.out.println("What is your name?");
//System.out.print("What is your name?");
//String name = scanner.nextLine();
//System.out.println("Hello, " +  name + "!");
//
//Activity 2
System.out.print("Enter your age?");
String age = scanner.nextLine();
int intage = Integer.parseInt(age);
System.out.println("Your age as int: " +  intage);
Double  doubleage = Double.parseDouble(age);
System.out.println("Your age as double: " +  doubleage);

//Activity 3
/*
System.out.println("Enter first integer:");
int num1 = scanner.nextInt();
System.out.println("Enter second integer:");
int num2 = scanner.nextInt();
System.out.println("Sum:" + sum(num1, num2));
System.out.println("Difference:" + difference(num1, num2));
System.out.println("Product:" + product(num1, num2));

}
public static int sum(int num1, int num2) {
return num1 + num2;
}

public static int difference(int num1, int num2) {
return num1 - num2;
}

public static int product(int num1, int num2) {
return num1 * num2;
*/

// Activity 4
/*
System.out.print("Enter your age:");
int age = scanner.nextInt();

if (age >= 60) {
System.out.println("Senior");
} 
else if (age >= 18) {
System.out.println("Adult");
} else {
System.out.println("Minor");
}
*/

//Activity 5
/*
int num1 = 0;
for (int i = 1; i <= 50; i++) {
num1 += i; }
System.out.println("The sum of numbers from 1 to 50 >> " + num1);
*/
}

}


