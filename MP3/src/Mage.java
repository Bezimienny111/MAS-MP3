
public class Mage extends BaseActor {
	private int MagicPower;
	private String MagicType;
	
	
	public Mage(String name, int hp, int level, int magicPower, String magicType) {
		super(name, hp, level);
		setMagicPower(magicPower);
		setMagicType(magicType);
	}
	
	public Mage(String name, int hp, int level) {
		super(name, hp, level);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String attack() {
		return "Mag atakuje " + this.getMagicType() + " zadając " + this.getMagicPower() + " obrażeń"; 
	}

	public int getMagicPower() {
		return MagicPower;
	}

	public void setMagicPower(int magicPower) {
		MagicPower = magicPower;
	}

	public String getMagicType() {
		return MagicType;
	}

	public void setMagicType(String magicType) {
		MagicType = magicType;
	}

}
