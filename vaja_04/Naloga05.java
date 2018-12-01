import java.util.*;
public class Naloga05{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vensi zgornjo mejo stevil");
		int meja = vhod.nextInt();
		int vsota = 0;
		int i = 2;
		while( i <=  meja){
			vsota  += i;
			i += 2;
		}
		System.out.println("Vsota ja:" + vsota);
	}
}