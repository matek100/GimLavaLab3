import java.util.*;
public class Naloga04{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi a");
		double a = vhod.nextDouble();
		System.out.println("Vnesi b");
		double b = vhod.nextDouble();
		System.out.println("Vnesi c");
		double c = vhod.nextDouble();
		double vsota = a + b + c;
		double pov = vsota / 3.0;
		double produkt = a * b *c;
		System.out.println("a je: " + a);
		System.out.println("b je: " + b);
		System.out.println("c je: " + c);
		System.out.println("vosta je: " +vsota);
		System.out.println("povprecna vrednost je: " + pov);
		System.out.println("produkt je: " + produkt);
		if (b !=0){
			System.out.println("kovcient prvega in drugega stevila je: " + (a/b));
		}
		else {
			System.out.println("Deljenje z nic ni dovoljeno");
		}
	}
}