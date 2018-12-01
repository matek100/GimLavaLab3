import java.util.*;
public class Naloga05{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vensi stevilo");
		double st = vhod.nextDouble();
		int st_celi = (int)st;
		double st_decimalni = ((int)((st - st_celi)*100))/100.0;
		System.out.println("Stevilo je: " + st + " Celi del stevila je:" + st_celi + " Decimalni del je: " + st_decimalni);
	}
}