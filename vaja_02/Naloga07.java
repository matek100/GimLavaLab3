import java.util.*;
public class Naloga07{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi spremenjlivko a");
		int a = vhod.nextInt();
		System.out.println("vnesi spremenjlivko b");
		int b = vhod.nextInt();
		int b_temp = b;
		b = a;
		a = b_temp;
		System.out.println("Vrednost spremenljivke a je:" + a + "Vrednost spremenljivke b je:" + b);
	}
}