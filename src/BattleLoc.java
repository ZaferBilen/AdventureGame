
public abstract class BattleLoc extends Location {
	protected Canavar canavar;
	protected String itemName;
	BattleLoc(Player player,String name,Canavar canavar, String itemName) {
		super(player);
		this.canavar = canavar;
		this.name=name;
		this.itemName = itemName;
	}
	public boolean getLocation() {
		int canavarSayisi = canavar.canavarSayisi();
		System.out.println("Þu an buradasýnýz : " + this.getName());
		System.out.println("Dikkatli ol ! Burada " + canavarSayisi + " tane " + canavar.getName() + " bulunuyor.");
		System.out.println();
		System.out.println("<S>avaþ ya da <K>aç");
		String secim = veri.next();
		secim = secim.toUpperCase();
		if (secim.equals("S")) {
			if(savas(canavarSayisi)) {;
			System.out.println(this.getName() + " bölgesindeki tüm düþmanlarý temizlediniz.");	
			if (this.itemName.equals("Yemek") && player.getInventory().isYemek() == false ) {
				System.out.println(this.itemName + " kazandýnýz. ");
				player.getInventory().setYemek(true);
			}
			else if (this.itemName.equals("Su") && player.getInventory().isSu() == false ) {
				System.out.println(this.itemName + " kazandýnýz. ");
				player.getInventory().setSu(true);
			}
			else if (this.itemName.equals("Odun") && player.getInventory().isOdun() == false ) {
				System.out.println(this.itemName + " kazandýnýz. ");
				player.getInventory().setOdun(true);
			}
			
			return true;
		}
		if (player.getSaglik()<= 0 ) {
			System.out.println("Öldünüz ");
			return false ;
		}
		}
		return true;
	}
	
	public boolean savas(int canavarSayisi) {
		for (int i =0 ; i < canavarSayisi ; i++) {
			int defaultCanavarCaný= canavar.getSaglik();
			
			playerStats();
			enemyStats();
			while(player.getSaglik() > 0 && canavar.getSaglik() > 0) {
				System.out.println();
				System.out.println("<S>aldýr ya da <K>aç");
				String secim = veri.next();
				secim = secim.toUpperCase();
				if (secim.equals("S")) {
					System.out.println("Bir saldýrý gerçekleþtirdiniz.");
					System.out.println("---------------------");
					canavar.setSaglik(canavar.getSaglik()- player.gettoplamHasar());
					afterHit();
					if (canavar.getSaglik() > 0) {
					System.out.println();
					System.out.println("Canavar size vurdu.");
					System.out.println("---------------------");
					player.setSaglik(player.getSaglik()-(canavar.getHasar()-player.getInventory().getZirh()));
					afterHit();
					}
				}	
				else {
					return false ;
				}
			}
			if(canavar.getSaglik() < player.getSaglik()) {
				System.out.println(canavar.getName() + " öldürdünüz");
				player.setPara(player.getPara()+canavar.getOdul());
				System.out.println("Güncel Paranýz : " + player.getPara());
				canavar.setSaglik(defaultCanavarCaný);
				}
			else {
				return false;
			}
			System.out.println("--------------------------");
		}
		return true ;
		
		
	}
	
	public void playerStats() {
		System.out.println("Oyuncu Deðerleri \n------------------");
		
		System.out.println("Can : " + player.getSaglik());
		System.out.println("Hasar : " + player.gettoplamHasar());
		System.out.println("Para : " + player.getPara());
		if (player.getInventory().getHasar()>0) {
			System.out.println("Silah : " + player.getInventory().getSilahAdi());
		}
		if (player.getInventory().getZirh()>0) {
			System.out.println("Zýrh : " + player.getInventory().getZirhAdi());
		}
	}
	public void enemyStats() {
		System.out.println("                  ");
		System.out.println(canavar.getName() + " Deðerleri \n------------------");
		System.out.println("Can : " + canavar.getSaglik());
		System.out.println("Hasar : " + canavar.getHasar());
		System.out.println("Ödül : " +canavar.getOdul());
	}
	public void afterHit() {
		System.out.println("Oyuncu Caný : " + player.getSaglik());
		System.out.println(canavar.getName()+ " Caný : " + canavar.getSaglik());
		System.out.println();
	}
}


















