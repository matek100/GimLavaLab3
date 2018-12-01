public class Naloga05{
	public static void main(String[] args){
		int x = 2001, leto = 2001; //letnica rosjtva
		int [] tab = new int[4];
		for(int i = 3; i >= 0; i--){
			tab[i] =  x%10;
			x = x / 10;
		}
		System.out.println("Letnica rojstva: " + leto);
		System.out.println("Razclenjena letnica rojstva: ");
		for(int i = 0; i < 3; i++){
			System.out.print(tab[i]+ " - ");
		}
		System.out.print(tab[3]);

	}
}