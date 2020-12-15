
import java.util.Scanner;

public class Main {

	/**
	*
	* Author Wildan Muhammad Gibran
	* Instagram : @wilmg.id
	*
	*/

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] harga = {2000,5000,7000,10000,12000};
		int totalHarga = 0;

		boolean mengulang = true;

		while (mengulang) {
		clearHistory();
		System.out.println("\n======MENU======\n");
		System.out.println("Makanan");
		System.out.println("1. Nasi Goreng Rp.10000");
		System.out.println("2. Pecel Ayam Rp.12000");
		System.out.println("3. Ayam Geprek Rp.10000");
		System.out.println("\nMinuman");
		System.out.println("4. Air Putih Rp.2000");
		System.out.println("5. Es Teh Rp.5000");
		System.out.println("6. Es Jeruk Rp.7000");
		System.out.println("\nKasir");
		System.out.println("0. Bayar Pesanan");

		System.out.print("\n\nPilih Menu : ");

		String inputUser = scan.next();

		switch(inputUser) {

			case "1":
				totalHarga	+= harga[3];
				break;
			case "2":
				totalHarga	+= harga[4];
				break;
			case "3":
				totalHarga	+= harga[3];
				break;
			case "4":
				totalHarga	+= harga[0];
				break;
			case "5":
				totalHarga	+= harga[1];
				break;
			case "6":
				totalHarga	+= harga[2];
				break;
			case "0":
				System.out.printf("\n\nTotal Harga : %d\n\n",totalHarga);
				break;
			default:
				System.out.println("Pilihan Tidak Tersedia");

		}
		System.out.print("Ingin Memesan Lagi ? (y/n) : ");
		inputUser = scan.next();
		mengulang = inputUser.equalsIgnoreCase("y");
	} 
		System.out.printf("\n\nTotal Harga : %d\n\n",totalHarga);

 }

 	public static void clearHistory() { 
 		System.out.print("\033[H\033[2J");  
		System.out.flush();  
  	}

}