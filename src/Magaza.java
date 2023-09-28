
public class Magaza extends NormalLoc {

	Magaza(Player player) {
		super(player, "Ma�aza");
		
	}
	
	public boolean getLocation(){
		System.out.println("Para : " + player.getPara());
		System.out.println("1- Silahlar\n"
						 + "2- Z�rhlar\n"
						 + "3- ��k��" );
		System.out.println("Se�iminiz : ");
		int selTool = veri.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = silahMenu();
			buySilah(selItemID);
			
			break;
		case 2:
			selItemID = zirhMenu();
			buyZirh(selItemID);	
			break;
		case 3: 
			System.out.println("Bir �st men�ye d�n�l�yor.");
			break;
			default:
				System.out.println("Hatal� bir tu�lama yapt�n�z.");
			break;
		}
		return true;
	}
	
	public int zirhMenu() {
		System.out.println("1- Hafif Z�rh \t Para : 15 \t Hasar : 1\n"
				 		 + "2- Orta Z�rh \t Para : 25 \t Hasar : 3\n"
				 		 + "3- A��r Z�rh\t Para : 40 \t Hasar : 5\n"
				 		 + "4- ��k��");
		System.out.println("Kalkan Se�iminiz : ");
		int selZirhID = veri.nextInt();
		return selZirhID;

}
	
	public void buyZirh(int itemID) {
		int azaltma=0 , para=0;
		String zirhAdi = null;
		switch (itemID){
		case 1:
		azaltma = 1;
		zirhAdi = "Hafif Z�rh";
		para = 15;
		break;
		case 2:
			azaltma = 3;
			zirhAdi = "Orta Z�rh";
			para = 25;
			break;
		case 3:
			azaltma = 35;
			zirhAdi = "A��r Z�rh";
			para = 40;
			break;
		case 4:
			System.out.println("Bir �st men�ye d�n�l�yor.");
			break;
			default : 
				System.out.println("Ge�ersiz ��lem ");
				break;
				
		}

		if (para > 0 ) {
			if(player.getPara() >=para) {
				player.getInventory().setZirh(azaltma);
				player.getInventory().setZirhAdi(zirhAdi);;
				player.setPara(player.getPara()-para);
				System.out.println(zirhAdi + " sat�n ald�n�z.Engellenen Hasar : " + (player.getInventory().getZirh()));
				System.out.println("Kalan paran�z : " + player.getPara());
			}
			else {
				System.out.println("Bakiye yetersiz.");
			}

		}
	}
	
	public int silahMenu() {
		System.out.println("1- Tabanca \t Para : 25 \t Hasar : 2\n"
						 + "2- K�l�� \t Para : 35 \t Hasar : 3\n"
						 + "3- T�fek \t Para : 45 \t Hasar : 7\n"
						 + "4- ��k��");
		System.out.println("Silah Se�iminiz : ");
		int selSilahID = veri.nextInt();
		return selSilahID;
		
	}
	
	public void buySilah(int itemID) {
		int damage=0 , para=0;
		String silahAdi = null;
		switch (itemID){
		case 1:
		damage = 2;
		silahAdi = "Tabanca";
		para = 25;
		break;
		case 2:
			damage = 3;
			silahAdi = "K�l��";
			para = 35;
			break;
		case 3:
			damage = 7;
			silahAdi = "T�fek";
			para = 45;
			break;
		case 4:
			System.out.println("Bir �st men�ye d�n�l�yor.");
			break;
			default : 
				System.out.println("Ge�ersiz ��lem ");
				break;
				
		}

		if (para > 0 ) {
			if(player.getPara()>para && (para > 0)) {
				player.getInventory().setHasar(damage);
				player.getInventory().setSilahAdi(silahAdi);
				player.setPara(player.getPara()-para);
				System.out.println(silahAdi + " sat�n ald�n�z.�nceki Hasar�n�z : " + (player.getHasar()) +  " Yeni Hasar�n�z : "+ player.gettoplamHasar());
				System.out.println("Kalan paran�z : " + player.getPara());
			}
			else {
				System.out.println("Bakiye yetersiz.");
			}

		}
	}
	
	//public void
	


}



