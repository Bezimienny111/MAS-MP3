
public class SwordOneHanded extends Item{

	private boolean skillRequired;
	private int weaponDmg;
	public SwordOneHanded(String core, int baseDmg, boolean skillRequired, int weaponDmg ) {
		super(core, baseDmg);
		this.skillRequired = skillRequired;
		this.weaponDmg = weaponDmg;
	}
		
	public SwordOneHanded(Item prevItem, boolean skillRequired, int weaponDmg) {
			super(prevItem.getCore(), prevItem.getBaseDmg());
			this.skillRequired = skillRequired;
			this.weaponDmg = weaponDmg;	
		}
	}

