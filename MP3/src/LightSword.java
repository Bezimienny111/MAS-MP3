
public class LightSword extends Item{
	private int critMultiplier;
	
	public LightSword(String core, int baseDmg, int critMultiplier) {
		super(core, baseDmg);
		this.critMultiplier = critMultiplier;
	}

	public LightSword(Item prevItem,int critMultiplier) {
		super(prevItem.getCore(), prevItem.getBaseDmg());
		this.critMultiplier = critMultiplier;
	}

}
