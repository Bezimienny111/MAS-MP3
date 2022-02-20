
public class Thief extends BaseActor{
	private int dexterity;
	private int skill;

	
	
	
	public Thief(String name, int hp, int level, int dexterity, int skill) {
		super(name, hp, level);
		this.dexterity = dexterity;
		this.skill = skill;
	}

	public Thief(String name, int hp, int level) {
		super(name, hp, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String attack() {
		return "Złodziej atakuje zadając "+ this.dexterity *this.skill + " obrażeń.";
	}

}
