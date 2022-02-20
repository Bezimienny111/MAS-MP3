import java.util.ArrayList;
import java.util.List;

public class HumanEnemy extends Enemy {

	List<String> dialogList = new ArrayList<String>();
	
	
	public HumanEnemy(String name, int hp, int level, CreepType type, int dmg,String...strings) {
		super(name, hp, level, type, dmg);
		for(String s: strings){
			this.dialogList.add(s);
		}
	}

	public String getDialog() throws Exception {
		StringBuilder sb = new StringBuilder();
		if(dialogList.isEmpty())
			throw new Exception("List is empty");
		for(String s: this.dialogList) {
			sb.append(s);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	
	public String print() throws Exception {
		if (this.CanAttack() == false)
			return this.getName() + System.lineSeparator() + this.getDialog() + System.lineSeparator()
					+ this.getNeutralMess();
		if (this.getType().equals(CreepType.MEELE))
			return this.getName() + System.lineSeparator() + this.getDialog() + System.lineSeparator()
					+ this.getMeeleDamage();
		if (this.getType().equals(CreepType.RANGE))
			return this.getName() + System.lineSeparator() + this.getDialog() + System.lineSeparator()
					+ this.getRangeDamage();
		return "";
	}
	}


