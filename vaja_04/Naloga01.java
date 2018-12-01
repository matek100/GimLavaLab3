import java.util.*;
public class Naloga01{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi prvo stevilo");
		int st1 =  vhod.nextInt();
		System.out.println("Vnesi drugo stevilo");
		int st2 = vhod.nextInt();
		
		if (st1 > st2){
			int temp = st2;
			st2 = st1;
			st1 = temp;
		}
		
		while(st1 < st2-1){
			st1++;
			System.out.println(st1);
		}
	}
}