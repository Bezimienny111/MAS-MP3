
public abstract class Item {

	private String core;
	private int baseDmg;
	
	public Item(String core, int baseDmg) {
		super();
		this.core = core;
		this.baseDmg = baseDmg;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public int getBaseDmg() {
		return baseDmg;
	}
	public void setBaseDmg(int baseDmg) {
		this.baseDmg = baseDmg;
	}

	public String toString() {
        return this.getClass().getSimpleName() + ": " + this.core + " " + this.baseDmg;
    }
}
