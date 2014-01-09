
public enum Instruction
{
		DAT, //DATA
		MOV, //MOVE
		ADD, //ADD
		SUB, //SUBTRACT
		MUL, //MULTIPLY
		DIV, //DIVIDE
		MOD, //MODULUS
		JMP, //JUMP
		JMZ, //JUMP IF ZERO
		JMN, //JUMP IF NOT ZERO
		DJN, //DECREMENT AND JUMP IF NOT ZERO
		SPL, //SPLIT
		CMP, //COMPARE
		SEQ, //SKIP IF EQUAL
		SNE, //SKIP IF NOT EQUAL
		SLT, //SKIP IF LOWER THAN
		LDP, //LOAD FROM P-SPACE
		STP, //SAVE TO P-SPACE
		NOP, //NO OPERATION
		AND, //BINARY AND
		ORR, //BINARY OR
		NOT, //UNARY NEGATION
}
