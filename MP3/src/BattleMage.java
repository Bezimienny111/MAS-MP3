
public class BattleMage extends Mage implements IWarrior {
	private int meeleDmg;

	public BattleMage(String name, int hp, int level, int magicPower, String magicType, int dmg) {
		super(name, hp, level, magicPower, magicType);
		setMeeleDmg(dmg);
	}

	public BattleMage(String name, int hp, int level) {
		super(name, hp, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMeeleDmg() {
		return this.meeleDmg;
	}

	@Override
	public void setMeeleDmg(int dmg) {
		this.meeleDmg = dmg;

	}

	public String attack() {
		return "Mag bitewny atakuje " + this.getMagicType() + " zadając " + this.getMagicPower() + " obrażeń, oraz " +  getMeeleDmg() + " zwykłych obrażen"; 
	}
}
