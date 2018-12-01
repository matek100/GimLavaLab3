import java.util.*;
public class Naloga01{
	public static void main(String[] args){
		Scanner vhod = new Scanner (System.in);
		System.out.println("Vnesi celo stevilo");
		int stevilo = vhod.nextInt();
		if (stevilo < 13){
			System.out.println("Stevilo je manjse od 13");
		}
		else{
			if (stevilo % 13 == 0){
				System.out.println("Stevilo je deljivo z 13");
			}
			else{
				System.out.println("Stevilo ni deljivo z 13");
			}
		}
		
	}
}