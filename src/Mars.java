
public class Mars
{
	public Register[] core;
	public final int CORESIZE;
	public final int MAXCYCLES;
	public final int WARRIORS;
	public final int MAXLENGTH;
	public final int MINDISTANCE;
	
	Mars(int coresize, int warriors, int maxcycles, int maxlength, int mindistance)
	{
		CORESIZE = coresize;
		core = new Register[coresize];
		WARRIORS = warriors;
		MAXCYCLES = maxcycles;
		MAXLENGTH = maxlength;
		MINDISTANCE = mindistance;
	}
}
