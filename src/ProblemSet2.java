import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	public static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		
		in.close();
	}
	
	public void sayHello() {
		
		
		System.out.println("What is your first name?");
		String first = in.nextLine();
		
		System.out.println("What is your last name?");
		String last = in.nextLine();
		
		System.out.println("Hello, " + first + " " + last + "!");
		System.out.println();
		
	
	}
	
	public void gradeMe() {
		
		System.out.println("What is your grade on homework 1?");
		double homework1 = in.nextDouble();
		
		System.out.println("What is your grade on homework 2?");
		double homework2 = in.nextDouble();
		
		System.out.println("What is your grade on homework 3?");
		double homework3 = in.nextDouble();
		
		System.out.println("What is your grade on quiz 1?");
		double quiz1 = in.nextDouble();
		
		System.out.println("What is your grade on quiz 2?");
		double quiz2 = in.nextDouble();
		
		System.out.println("What is your grade on quiz 3?");
		double quiz3 = in.nextDouble();
		
		System.out.println("What is your grade on test 1?");
		double test1 = in.nextDouble();
		
		System.out.println("What is your grade on test 2?");
		double test2 = in.nextDouble();
		
		System.out.println("What is your grade on test 3?");
		double test3 = in.nextDouble();
		
		double homeavg = (homework1 + homework2 + homework3) / 3;
		double quizavg = (quiz1 + quiz2 + quiz3) / 3;
		double testavg = (test1 + test2 + test3) / 3;
		
		
		double totalavg = (homeavg * 0.15) + (quizavg * 0.3) + (testavg * 0.55);
		
		DecimalFormat decimal = new DecimalFormat("000.00");
		
		System.out.println("Your total average is: " + decimal.format(totalavg));
		System.out.println();
		
		// eat extra character
		in.nextLine();
		
	}
	
	public void groupUs() {
		System.out.println("How many students on the trip?");
		int students = in.nextInt();
		System.out.println("How many teachers on the trip?");
		int teachers = in.nextInt();
		int total = students + teachers;
		int busses = (total + 46 )/ 47;
		
		
		System.out.println("You will need " + busses + " busses!");
		System.out.println("The first " + (busses - 1) + " busses will have 47 people, and the last bus has "+ (((total + 46) % 47)+1)  + " people. ");
		System.out.println();
		
		// eat extra character
		in.nextLine();
	}
	
	public void info() {
		System.out.println("What is your first name?");
		String first = in.nextLine();
		
		System.out.println("What is your last name?");
		String last = in.nextLine();
		
		System.out.println("What is your grade?");
		String grade = in.nextLine();
		
		System.out.println("What is your age?");
		String age = in.nextLine();
		
		System.out.println("What is your hometown?");
		String hometown = in.nextLine();
		
		System.out.println("NAME\t\t: " + first + " " + last);
		System.out.println("GRADE\t\t: " + grade);
		System.out.println("AGE\t\t: " + age);
		System.out.println("HOMETOWN\t: " + hometown);
		System.out.println();
		
		
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		String first = in.nextLine();
		
		System.out.print("Please enter your middle name: ");
		String middle = in.nextLine();
		
		System.out.print("Please enter your last name: ");
		String last = in.nextLine();
		
		System.out.println();
		System.out.println("Your initials are " + first.charAt(0) + middle.charAt(0) + last.charAt(0) + ".");
		System.out.println();
	}
}