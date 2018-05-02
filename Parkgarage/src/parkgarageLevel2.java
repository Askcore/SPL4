import java.util.ArrayList;

public class parkgarageLevel2 {

	public static void main(String[] args) {
		int parkplaetze = 2;
		int autos = 4;
		String parken ="1 2 -1 3 4 -3 -4 -2";
		int max = 0;
		int jetzt = 0;
		int maxWarten = 0;
		
		String[] parkChar = parken.split(" ");
		ArrayList<String> parkWarten = new ArrayList<String>();
		ArrayList<String> parking = new ArrayList<String>();
		
		
		
		for(int i = 0; i< parkChar.length;i++) 
		{
			if(parkChar[i].indexOf("-") > 0) 
			{
				jetzt --;
				parking.remove((String) parkChar[i]);
				
				// warteliste??
				
				if(parkWarten.size() > 0)
				{
					parking.add(parkWarten.get(0));
					parkWarten.remove(0);
					
				}
				
			}
			else if(parking.size() < parkplaetze)
			{
				jetzt ++;
				parking.add((String) parkChar[i]);

			if (parking.size() == parkplaetze) 
			{
					parkWarten.add(parkChar[i]);
			}
				
			}
			
			
			if(jetzt > max) 
			{
				max = jetzt;
			}
			
			
			if(maxWarten < parkWarten.size()) 
			{
				maxWarten = parkWarten.size();
			
			}
		
		}
		System.out.println(max);
		System.out.println(maxWarten);
	}

}