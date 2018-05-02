
public class parkgarageLevel1 {

	public static void main(String[] args) {
		int parkplaetze = 100;
		int cars = 20;
		String parken = "19 -19 11 -11 1 -1 17 -17 10 7 -10 -7 3 14 -14 -3 13 -13 4 12 20 18 6 16 -18 -12 -16 5 -5 -20 -6 -4 8 15 -8 2 -15 9 -2 -9";
		int max = 0;
		int now = 0;
		String[] parkvorgaenge = parken.split(" ");
		
		for(int i=0; i < parkvorgaenge.length; i++) 
		{
			if (Integer.parseInt(parkvorgaenge[i]) < 0)
			{
				now -=1;
			}
			else
			{
				now +=1;
			}
			
			if (now > max)
			{
				max = now;
			}
		
		}
		System.out.println(max);
	}

}
