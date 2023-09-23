
public abstract class BattleLoc extends Location {
	Canavar canavar;
	BattleLoc(Player player,String name,Canavar canavar) {
		super(player);
		this.canavar = canavar;
		this.name=name;
	}
	public boolean getLocation() {
		return true;
	}
	

}
