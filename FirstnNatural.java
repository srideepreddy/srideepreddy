import java.util.Scanner;

public class FirstnNatural
	{
		public static void main(String args[])
		{
			System.out.println("Enter the total numbers: ");
			Scanner reader = new Scanner(System.in);
			int number = reader.nextInt();
			System.out.println("First n natural numbers are -------------------");
			for (int i = 1; i <= number; i++)
				{
					System.out.println(i);
				}
		}

	}

//Output:
//Enter the total numbers:
//5
//First n natural numbers are -------------------
//1
//2
//3
//4
//5
 
