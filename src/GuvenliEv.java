
public class GuvenliEv extends NormalLoc{

	GuvenliEv(Player player) {
		super(player, "G�venli Ev");
	}
	public boolean getLocation() {
		player.setSaglik(player.getGercekSaglik());
		System.out.println("�yile�tiniz.");
		System.out.println("G�venli Ev'desiniz.");
		
		return true ;
	}

}
