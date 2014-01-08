
public class Address
{
	public final int AD;
	public final AddressMode MODE;
	
	Address(int ad, AddressMode mode)
	{
		AD = ad;
		MODE = mode;
	}
	
	@Override
	public String toString()
	{
		return (AD + " " + MODE.mode);
	}
}
