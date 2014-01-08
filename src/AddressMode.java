
public enum AddressMode
{
	IMMEDIATE ('#'),
	DIRECT ('$'),
	INDIRECT_A('*'),
	INDIRECT_B ('@'),
	INDIRECT_PREDEC_A ('{'),
	INDIRECT_PREDEC_B ('<'),
	INDIRECT_POSTDEC_A ('}'),
	INDIRECT_POSTEDEC_B('>');
	
	public final char mode;
	AddressMode(char c)
	{
		mode = c;
	}
}
