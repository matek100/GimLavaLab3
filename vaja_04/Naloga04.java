import java.util.*;
public class Naloga04{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi prvo stevilo");
		int st1 = vhod.nextInt();
		System.out.println("Vnesi drugo stevilo");
		int st2 = vhod.nextInt();
		System.out.println();
		
		while(st2 > 0){
			System.out.println(st1);
			--st2;
		}
	}
}