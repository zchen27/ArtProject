import java.util.LinkedList;

public class Mars
{
	private Register[] core;
	private Warrior[] war;
	private int cycle;
	LinkedList<WarriorRun>[] queues;
	public final int CORESIZE;
	public final int MAXCYCLES;
	public final int WARRIORS;
	public final int MAXLENGTH;
	public final int MINDISTANCE;
	
	Mars(int coresize, int warriors, int maxcycles, int maxlength, int mindistance)
	{
		CORESIZE = coresize;
		core = new Register[CORESIZE];
		WARRIORS = warriors;
		war = new Warrior[WARRIORS];
		queues = new LinkedList[WARRIORS];
		MAXCYCLES = maxcycles;
		MAXLENGTH = maxlength;
		MINDISTANCE = mindistance;
	}
	
	public void loadWarriors(Warrior... load)
	{
		int k = 0;
		for(int i = 0; i < load.length; i++)
		{
			if(k >= war.length)
			{
				break;
			}
			
			if(load[i].code.length <= MAXLENGTH)
			{
				war[k] = load[i];
				k++;
			}
		}
	}
	
	public void loadMemory() throws UnsupportedOperationException
	{
		int[] warriorLengths = new int[WARRIORS];
		int[] startLocations = new int[WARRIORS];
		for(int i = 0; i < war.length; i++)
		{
			
		}
	}
        
        
}
