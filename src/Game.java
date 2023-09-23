import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner veri = new Scanner(System.in);
	
	
	public void login() {
		Scanner veri = new Scanner(System.in);
		System.out.println("Macera Oyununa Ho�geldiniz");
		System.out.println("Oyuna ba�lamadan �nce isminizi giriniz.");
		String oyuncuAdi = veri.nextLine();
		player = new Player (oyuncuAdi);  // burada oyunu oynayan ki�inin nicki olu�turuldu.
		player.karakterSec();     // Karakter se�me i�lemleri Player s�n�f�ndaki karakterSec() i�inde yap�l�r.
		start();
		
	}
	public void start() {
		
		while (true) {
			System.out.println();
			System.out.println("**************");
			System.out.println();
			System.out.println("Eylem ger�ekle�tirmek i�in bir yer se�iniz : ");
			System.out.println("1- G�venli Ev --> Size ait g�venli bir mekan, d��man yok.\n"
							 + "2- Ma�ara     --> Kar��n�za zombi ��kabilir.\n"
							 + "3- Orman      --> Kar��n�za vampir ��kabilir\n"	
							 + "4- Ma�ara     --> Kar��n�za ay� ��kabilir.\n"					
							 + "5- Ma�aza     --> Silah veya z�rh alabilirsiniz.");
			int locSec = veri.nextInt();
			while (locSec <= 0 || locSec >5) {
				System.out.println("L�tfen ge�erli bir yer se�iniz.");
				locSec = veri.nextInt();
			}
			switch (locSec) {
			case 1: 
				location = new GuvenliEv(player);
				break;
				default:
				location = new GuvenliEv(player);
			}
			if (!location.getLocation()) {
			System.out.println("Oyun Bitti");
			break;
			}
			case 2:
				location = new Magaza(player);
				
				
		}
	
	}


}
