import java.util.ArrayList;
import java.util.List;

public class RuneFromSwordCore extends Item{
	private List<String> corelist = new ArrayList<String>(); 
	
	public RuneFromSwordCore(String core, int baseDmg, String nextCore) {
		super(core, baseDmg);
		this.corelist.add(core);
		this.corelist.add(nextCore);
		// TODO Auto-generated constructor stub
	}
	
	public RuneFromSwordCore(Item prevItem,String nextCore) {
		super(prevItem.getCore(), prevItem.getBaseDmg());
		this.corelist.add(prevItem.getCore());
		this.corelist.add(nextCore);
		// TODO Auto-generated constructor stub
	}


public void addCore(String core) {
	this.corelist.add(core);
}
}
