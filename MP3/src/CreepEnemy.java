
public class CreepEnemy extends Enemy {

	private String quantity;
	public CreepEnemy(String name, int hp, int level, CreepType type, int dmg,String quatity) {
		super(name, hp, level, type, dmg);
		this.quantity = quatity;
		// TODO Auto-generated constructor stub
	}
	
	private String getQuantity() {
		return this.quantity +  "of " + this.getName();
	}
	public String print() throws Exception {
		if(this.CanAttack() == false)
			return this.getQuantity() + System.lineSeparator()  +  this.getNeutralMess();
		if(this.getType().equals(CreepType.MEELE))
			return this.getQuantity() + System.lineSeparator() +  this.getMeeleDamage();
		if(this.getType().equals(CreepType.RANGE))
			return this.getQuantity() + System.lineSeparator() +  this.getRangeDamage();
		return "";
	}
}
