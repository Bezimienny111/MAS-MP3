enum CreepType {MEELE,RANGE,NEUTRAL}

public class Enemy extends BaseActor {
	private int meeleDmg;
	private int rangeDmg;
	private boolean canAttack = true;;
	private CreepType type; 
	
	public Enemy(String name, int hp, int level,CreepType type,int dmg) {
		super(name, hp, level);
		if(type == CreepType.MEELE)
			this.setMeeleDmg(dmg);
		if(type == CreepType.RANGE)
			this.setRangeDmg(dmg);
		if(type == CreepType.NEUTRAL)
			this.setCanAttack(false);
		this.setType(type);
		// TODO Auto-generated constructor stub
	}


	public String getRangeDamage() throws Exception {
		if(!this.getType().equals(CreepType.RANGE))
			throw new Exception(this.getName() + "is not a range enemy");
		return "Wróg atakuje dystansowo : " + this.getRangeDmg();
	}
	
	public String getMeeleDamage() throws Exception {
		if(!this.getType().equals(CreepType.MEELE))
			throw new Exception(this.getName() + "is not a meele enemy");
		return "Wróg atakuje : " + this.getMeeleDmg();
	}
	
	public String getNeutralMess() throws Exception {
		if(this.CanAttack() == true)
			throw new Exception(this.getName() + "is not neutral");
		return "Ten NPC jest neutralny i nie może atakować";
	}
	
	@Override
	public String attack() {
		return null;
	}

	public String print() throws Exception {
		return null;
	}
	
	
	public boolean CanAttack() {
		return canAttack;
	}

	public void setCanAttack(boolean canAttack) {
		this.canAttack = canAttack;
	}

	public CreepType getType() {
		return type;
	}

	public void setType(CreepType type) {
		this.type = type;
	}

	public int getMeeleDmg() {
		return meeleDmg;
	}

	public void setMeeleDmg(int meeleDmg) {
		this.meeleDmg = meeleDmg;
	}

	public int getRangeDmg() {
		return rangeDmg;
	}

	public void setRangeDmg(int rangeDmg) {
		this.rangeDmg = rangeDmg;
	}

}
