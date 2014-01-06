
public enum AddressMode
{
	IMMEDIATE ('#'),
	DIRECT ('$'),
	INDIRECT ('@'),
	INDIRECT_PREDEC ('<');
	
	public final char mode;
	AddressMode(char c)
	{
		mode = c;
	}
}
