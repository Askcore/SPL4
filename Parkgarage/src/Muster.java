public class Muster {

	public static void main(String[] args) {
		
		for(int i = 8; i>0; i--)
		{
			for(int j = 1; j<2; j++)
			{
				switch(j)
				{
				case 1: System.out.print(" A"+i);
				case 2: System.out.print(" B"+i);
				case 3: System.out.print(" C"+i);
				case 4: System.out.print(" D"+i);
				case 5: System.out.print(" E"+i);
				case 6: System.out.print(" F"+i);
				case 7: System.out.print(" G"+i);
				case 8: System.out.print(" H"+i);
				}
			}
			System.out.println("\n");
		}
	}

}