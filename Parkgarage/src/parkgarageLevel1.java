
public class parkgarageLevel1 {

	public static void main(String[] args) {
		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		int max = 0;
		int jetzt = 0;
		String[] parkvorgaenge = parken.split(" ");
		
		for(int i=0; i < parkvorgaenge.length; i++) 
		{
			if (Integer.parseInt(parkvorgaenge[i]) < 0)
			{
				jetzt -=1;
			}
			else
			{
				jetzt +=1;
			}
			
			if (jetzt > max)
			{
				max = jetzt;
			}
		
		}
		System.out.println(max);
	}

}
