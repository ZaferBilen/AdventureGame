
public class GuvenliEv extends NormalLoc{

	GuvenliEv(Player player) {
		super(player, "Güvenli Ev");
	}
	public boolean getLocation() {
		player.setSaglik(player.getGercekSaglik());
		System.out.println("Ýyileþtiniz.");
		System.out.println("Güvenli Ev'desiniz.");
		
		return true ;
	}

}
