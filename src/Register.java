
public class Register
{
	//Opcodes
	public static final byte DAT = 0x00;
	public static final byte MOV = 0x01;
	public static final byte ADD = 0x02;
	public static final byte SUB = 0x03;
	public static final byte JMP = 0x04;
	public static final byte JMZ = 0x05;
	public static final byte JMN = 0x06;
	public static final byte CMP = 0x07;
	public static final byte SLT = 0x08;
	public static final byte DJN = 0x09;
	public static final byte SPL = 0x0A;
	
	//Access Modes
	public static final byte IMMEDIATE = 0x00;
	public static final byte DIRECT = 0x01;
	public static final byte INDIRECT = 0x02;
	
	//Actions
	public static final byte NONE = 0x00;
	public static final byte DECREMENT = 0x01;
	
	public byte op;
	public byte mod;
	public byte aMod;
	public byte bMod;
	public int aFld;
	public int bFld;
	
	public Register()
	{
		op = DAT;
		aMod = DIRECT;
		bMod = DIRECT;
		aFld = 0;
		bFld = 0;
	}
	
	public void copy(Register r)
	{
		op = r.op;
		mod = r.mod;
		aMod = r.aMod;
		bMod = r.bMod;
		aFld = r.aFld;
		bFld = r.bFld;
	}
	
	public boolean equals(Register reg)
	{
		if((this.op != reg.op) || (this.mod != reg.mod)
			|| (this.aMod != reg.aMod) || (this.bMod != reg.bMod)
			|| (this.aFld != reg.aFld) || (this.bFld != reg.bFld))
		{
			return false;
		}
		return true;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Register)
		{
			equals((Register) obj);
		}
		return false;
	}
	

}
