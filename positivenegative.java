public class PositiveNegative{
	public static void main(String args[])
		{
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = reader.nextInt();
			if(number > 0)
				{
					System.out.println("Entered number " + number + " is a postive number");
				}
			else
				{
					System.out.println("Entered number " + number + " is a negative number");
				}

		}

}

//output:
// Enter the number:
//2
//Entered number 2 is a postive number
