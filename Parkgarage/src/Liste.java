import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) 
	{
		ArrayList <Integer> warteliste = new ArrayList<Integer>();
		warteliste.add(4);
		warteliste.add(7);
		warteliste.add(1);
		System.out.println(warteliste);
		System.out.println(warteliste.size());
		
		warteliste.remove((Integer)1);
		
		int[] wl = new int[5];
		wl [0] = 10;
		wl [0] = 10;
		System.out.println(wl);

	}

}
