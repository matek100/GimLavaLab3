import java.util.*;
public class Dn{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vensi celo stevilo");
		int a = vhod.nextInt();
		if (a%2 == 0){
			System.out.println("Stevilo je sodo");
		}
		else{
			System.out.println("Stevilo je liho");
		}
	}
}
