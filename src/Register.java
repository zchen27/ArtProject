
public class Register
{
	public enum Opcode
	{
		DAT,
		MOV,
		ADD,
		SUB,
		MUL,
		DIV,
		MOD,
		JMP,
		JMZ,
		JMN,
		DJN,
		SPL,
		SEQ,
		SNE,
		CMP,
		SLT,
		NOP,
	}
	
	public enum Modifier
	{
		A,
		B,
		AB,
		BA,
		F,
		X,
		I,
	}
	
	public enum Mode
	{
		IMM,
		DIR,
		AID,
		BID,
		AIP,
		BIP,
		AIO,
		BIO,
	}
	
	private Opcode op;
	private Modifier mod;
	private Mode aMode;
	private Mode bMode;
	private int a;
	private int b;
	
	public Opcode getop()
	{
		return op;
	}
	
	public Modifier getMod()
	{
		return mod;
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public Mode getAMode()
	{
		return aMode;
	}
	
	public Mode getBMode()
	{
		return bMode;
	}
	
	public void setOp(Opcode newOp, Modifier newMod)
	{
		op = newOp;
		mod = newMod;
	}
	
	public void setA(Mode newAMode, int newA)
	{
		aMode = newAMode;
		a = newA;
	}
	
	public void setB(Mode newBMode, int newB)
	{
		bMode = newBMode;
		b = newB;
	}
}
