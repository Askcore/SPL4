import java.util.Arrays;
import java.util.ArrayList;

public class Noten {

	public static void main(String[] args) {
		int[] noten = {1,1,3,2,4,5,5,4,4,3,2,2,1,1,3,2,4,5,4,3,2,1,4,4,3,2,1,1,5,3};
		
		
		System.out.println(Arrays.toString(noten));
		System.out.println(durchschnitt(noten));
		ArrayList<Integer> notenSpiegel = new ArrayList<Integer>();
		notenSpiegel.add(AnzahlNote(noten, 1));
		notenSpiegel.add(AnzahlNote(noten, 2));
		notenSpiegel.add(AnzahlNote(noten, 3));
		notenSpiegel.add(AnzahlNote(noten, 4));
		notenSpiegel.add(AnzahlNote(noten, 5));
		System.out.println(notenSpiegel);
	}

	
	public static double durchschnitt(int[] a) 
	{
		int b = 0;
		for(int i = 0; i<a.length;i++)
		{
			b = b+a[i];
		}
		return b/a.length;
	}
	
	public static int AnzahlNote(int [] a, int note) 
	{
		int b = 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == note)
			{
				b++;
			}
		}
		return b;
		
	}
}