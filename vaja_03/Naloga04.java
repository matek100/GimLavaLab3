import java.util.*;
public class Naloga04{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi leto");
		int leto = vhod.nextInt();
		if ((leto % 400 == 0) || ((leto % 4 == 0)&&(leto%100 != 0))){
			System.out.println("Leto je prehodno");
		}
		else {
			System.out.println("Leto ni prehodno");
		}
	}
}