
public class Register
{
	private Instruction instruction;
	private Modifier modifier;
	private Address aSpace;
	private Address bSpace;
	
	Register(Instruction op, Modifier mod, Address a, Address b)
	{
		instruction = op;
		modifier = mod;
		aSpace = a;
		bSpace = b;
	}
	
	public Instruction instruction()
	{
		return instruction;
	}
	
	public Modifier modifier()
	{
		return modifier;
	}
	
	public Address a()
	{
		return aSpace;
	}
	
	public Address b()
	{
		return bSpace;
	}
}
