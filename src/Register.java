
public class Register
{
	public final Instruction instruction;
	public final Address aSpace;
	public final Address bSpace;
	
	Register(Instruction op, Address a, Address b)
	{
		instruction = op;
		aSpace = a;
		bSpace = b;
	}
}
