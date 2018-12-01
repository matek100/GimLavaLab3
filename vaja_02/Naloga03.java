import java.util.*;
public class Naloga03{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vensi a");
		int a = vhod.nextInt();
		System.out.println("Vensi b");
		int b = vhod.nextInt();
		System.out.println("Vensi c");
		int c = vhod.nextInt();
		int vsota = a + b + c;
		double pov = vsota / 3.0;
		System.out.println("a je: " + a);
		System.out.println("b je: " + b);
		System.out.println("c je: " + c);
		System.out.println("vosta je: " +vsota);
		System.out.println("povprecna vrednost je: " + pov);
	}
}