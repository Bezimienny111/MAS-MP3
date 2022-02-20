
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// klasa abstrakcyjna i polimorfizm
		System.out.println("---------------------------------------");
		System.out.println("-------------abstrakcyjna i polimorfizm---------------");
		System.out.println("---------------------------------------");
		System.out.println();
		BaseActor a1 = new Mage("Mag",100,5,100,"Ogien");
		BaseActor a2 = new Thief("Thief",100,5,100,20);
		System.out.println(a1.attack());
		System.out.println();
		System.out.println(a2.attack());
		System.out.println();
		
		
		// Overlapping
		System.out.println("---------------------------------------");
		System.out.println("-------------Overlapping---------------");
		System.out.println("---------------------------------------");
		System.out.println();
		try {
			Shield s1 = new Shield("Test",10,ShieldType.NORMAL,ShieldType.MAGIC);
			s1.setMagicDef(20);
			s1.setCounter(20);
			System.out.println(s1.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Wielodziedziczenie
		System.out.println("---------------------------------------");
		System.out.println("-------------Wielodziedziczenie---------------");
		System.out.println("---------------------------------------");
		System.out.println();
		BattleMage bm = new BattleMage("BattleMage",100,5,100,"Elektryczność",50);
		System.out.println(bm.attack());
		System.out.println();
		
		// Wieloaspektowe 
		System.out.println("---------------------------------------");
		System.out.println("-------------Wieloaspektowe---------------");
		System.out.println("---------------------------------------");
		System.out.println();
		Enemy c1 = new HumanEnemy("Elf",100,5,CreepType.RANGE,20,"Nie pokonasz mnie", "Mój łuk Cię zabije");
		Enemy c2 = new HumanEnemy("Trader",100,5,CreepType.NEUTRAL,20, "Witaj wędrowcze", "Spójrz na moje towary");
		Enemy c3 = new HumanEnemy("Ork",100,5,CreepType.MEELE,100,"Ja być silny","Ty być słaby","GIIIN!");
		
		System.out.println(c1.print());
		System.out.println();
		System.out.println(c2.print());
		System.out.println();
		System.out.println(c3.print());
		System.out.println();
		//System.out.println(c1.getMeeleDamage());
		
		Enemy c4 = new CreepEnemy("Ghost",100,5,CreepType.RANGE,20,"Dwa");
		Enemy c5 = new CreepEnemy("Slime",100,5,CreepType.NEUTRAL,20, "Kilka");
		Enemy c6 = new CreepEnemy("Wolf",100,5,CreepType.MEELE,100,"Wataha");
		
		System.out.println(c4.print());
		System.out.println();
		System.out.println(c5.print());
		System.out.println();
		System.out.println(c6.print());
		
		//System.out.println(c6.getNeutralMess());
		// dynamic 
		System.out.println("---------------------------------------");
		System.out.println("-------------dynamic---------------");
		System.out.println("---------------------------------------");
		System.out.println("-------Uzasadnienie, broń można przekuć---------");
		System.out.println("---------------------------------------");
		System.out.println();
		Item i1 = new SwordOneHanded("Ogien",20,true,20);
		System.out.println(i1);
		 i1 = new LightSword(i1,50);
		System.out.println(i1);
		i1 = new RuneFromSwordCore(i1,"Piorun");
		System.out.println(i1);
	}

}
