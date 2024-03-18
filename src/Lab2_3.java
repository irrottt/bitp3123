import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many marks do you want to insert?: ");
		int numMarks = sc.nextInt();

		double totalMarks = 0.0;
		for (int i = 1; i <= numMarks; i++)
		{
			System.out.print("Please enter mark no " + i + " : ");
			double mark = sc.nextDouble();
			System.out.println("Mark: " + mark + "has been inserted");
			totalMarks += mark;
		}
		
		System.out.println("Total mark is: " + totalMarks);
		System.out.println("Press any key to continue...");
		sc.next();
		sc.close();
	}

}
