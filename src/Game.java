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
							 + "4- Nehir     --> Kar��n�za ay� ��kabilir.\n"					
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
			case 2:
				location = new Magara(player);
				break;
			case 3:
				location = new Orman(player);
				break;
			case 4:
				location = new Nehir(player);
				break;
				
			case 5:
				location = new Magaza(player);
				break;
				default:
				location = new GuvenliEv(player);
			}
			if(location.getClass().getName().equals("GuvenliEv")) {
				if(player.getInventory().isOdun() && player.getInventory().isYemek()&& player.getInventory().isSu()) {
					System.out.println();
					System.out.println("TEBR�KLER OYUNU KAZANDINIZ");
					break;
				}
			}
			if (!location.getLocation()) {
			System.out.println("Oyun Bitti");
			break;
			}
				
				
		}
	
	}


}
