import java.util.*;
public class Naloga01{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		int[] tab = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Vensi stevilo");
			tab[i] = vhod.nextInt();
		}

		int najmanjse = tab[0];

		for(int i = tab.length - 1; i >= 0; i--){
			System.out.print(tab[i] + ", ");
			if(tab[i] < najmanjse) najmanjse = i;
		}

		System.out.println("Najmanjse stevilo je: " + najmanjse);


	}
}