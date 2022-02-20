
public abstract class BaseActor {
	private String name;
	private int hp;
	private int level;
	

	public BaseActor(String name, int hp, int level) {
		super();
		this.setName(name);
		this.hp = hp;
		this.level = level;
	}

	public abstract String attack();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
