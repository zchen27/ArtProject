import java.util.LinkedList;
import java.util.Random;

public class Mars
{

	public final int CORESIZE;
	public final int MAXCYCLES;
	public final int MAXLENGTH;
	public final int MINDISTANCE;
	private Register[] core;
	private Warrior[] warrior = new Warrior[2];
	private int cycle;
	LinkedList<WarriorRun>[] queues;
	
	Mars(int coresize, int warriors, int maxcycles, int maxlength, int mindistance)
	{
		CORESIZE = coresize;
		core = new Register[CORESIZE];
		queues = new LinkedList[2];
		MAXCYCLES = maxcycles;
		MAXLENGTH = maxlength;
		MINDISTANCE = mindistance;
		cycle = 0;
	}
	
	public void loadWarriors(Warrior load0, Warrior load1)
	{
		warrior[0] = load0;
		warrior[1] = load1;
	}
	
	public void loadMemory() throws Exception
	{
		int[] lengths = {warrior[0].code.length, warrior[1].code.length};
		if(lengths[0] + lengths[1] + MINDISTANCE > CORESIZE)
		{
			throw new Exception("OVERSIZED");
		}
		
		Random r = new Random();
		int distance;
		distance = MINDISTANCE + r.nextInt(CORESIZE - lengths[0] - lengths[1/ 
			]);
	}
        
        
}
