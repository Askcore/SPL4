
public class fizzbuzz {

	public static void main(String[] args)
	{
		int max = 100;
		
		for(int m = 1; m < max+1; m++)
		{
			if(m%3 == 0 && m%5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if(m%3 == 0)
			{
				System.out.println("Fizz");
			}
			else if(m%5 == 0)
			{
				System.out.println("Buzz");
			}
			else System.out.println(m);
			
		}

	}

}
