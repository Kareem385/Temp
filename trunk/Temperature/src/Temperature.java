import java.util.*;

public class Temperature 
{
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);  //user input
		
		double [] temps = new double[7];
		String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
				
		double average, sum = 0;
		
		System.out.println("Enter daily high temps for the week");
		
		for(int i=0; i<temps.length; i++)
		{
			temps[i] = in.nextDouble();
		}//getting input
		
		for(int i=0; i<temps.length; i++)
		{
			sum = sum + temps[i];
		}//computing sum

		average = sum / 7;
		
		System.out.println("Entered daily temps: ");
		for(int i=0; i<temps.length; i++)
		{
			System.out.println(days[i] + " " + temps[i]);
		}//output
		
		System.out.println("Average temp is: " + average);
		double largest = temps[0];
		for(int i = 0; i < temps.length; i++)
		{
		if(temps[i] > largest)
		{
		largest = temps[i];
		}
		}System.out.println("Max temp is" +largest);
		
		for(int i = 0; i < temps.length; i++)
		{
		if(temps[i] < largest)
		{
		largest = temps[i];
		}
		}System.out.println("Min temp is" +largest);
	}//main
	
}//class
