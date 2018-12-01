import java.util.*;
public class Naloga02{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		int i = 0;
		double vsota = 0;
		
		while(i < 10){
			System.out.println("Vnesi stevilo");
			int stevilo = vhod.nextInt();
			vsota += stevilo;
			i++;
		}
		System.out.println(i);
		System.out.println("Povprecna vrednost je" + (vsota/i));
	}
}
