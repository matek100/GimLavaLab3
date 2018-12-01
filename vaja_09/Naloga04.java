public class Naloga04{
	public static void main(String[] args){
		int[] tab = new int[10];
		int desetice;
		for(int i = 0; i < 10; i++){
			tab[i] = (int)(Math.random()*401)+100;
			System.out.println(tab[i]); 
		}

		System.out.println();

		for(int i = 0; i < 10; i++){
			desetice = (tab[i]/10)%10;
			if(desetice == 5){
				tab[i] = tab[i] * (-1);
			}
			System.out.println(tab[i]);
		}


	}
}