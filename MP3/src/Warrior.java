
public class Warrior extends BaseActor implements IWarrior{
	private int meeleDmg;
	
	
	public Warrior(String name, int hp, int level,int dmg) {
		super(name, hp, level);
		setMeeleDmg(dmg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String attack() {
		return "Wojownik atakuje zadając :" + getMeeleDmg() + " obrażeń"; 
	}

	@Override
	public int getMeeleDmg() {
		return this.meeleDmg;
	}

	@Override
	public void setMeeleDmg(int dmg) {
		this.meeleDmg = dmg;
		
	}

}
