import java.util.EnumSet;

enum ShieldType {SHIELD,NORMAL,MAGIC,COUNTER}

public class Shield {
	private String name;
	private int base;
	private int defStat;
	private int magicDef;
	private int counter;
	private EnumSet<ShieldType> type = EnumSet.of(ShieldType.SHIELD);
	
	public Shield(String name,int base,ShieldType... shieldTypes) throws Exception {
		super();
		this.name = name;
		this.base = base;
		for(ShieldType s: shieldTypes) {
			if(this.type.contains(s))
				throw new Exception("Error, same shield type");
			this.type.add(s);
		}
	}

	public void setDefStat(int defStat) throws Exception {
		if(type.contains(ShieldType.NORMAL)) {
		this.defStat = defStat;
		return;
		}
		throw new Exception("This is not normal shield");
		
	}

	public void setMagicDef(int magicDef) throws Exception {
		if(type.contains(ShieldType.MAGIC)) {
		this.magicDef = magicDef;
		return;
		}
		throw new Exception("This is not magic shield");
	}

	public void setCounter(int counter) throws Exception {
		if(type.contains(ShieldType.COUNTER)) {
		this.counter = counter;
		return;
		}
		throw new Exception("This is not counter shield");
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("This Shield stats: ");
		sb.append("Base def: " + this.base + " ; ");
		if(type.contains(ShieldType.MAGIC))
			sb.append("Magic def: " + this.magicDef + " ; ");
		if(type.contains(ShieldType.COUNTER))
			sb.append("Counter dmg: " + this.counter + " ; ");
		if(type.contains(ShieldType.NORMAL))
			sb.append("On hit def: " + this.defStat + " ; ");
		return sb.toString();
	}
	
	
	
}
