

public class Debug {
    public void disassemblerChunk(Chunk chunk, String name)
    {
        System.out.println("=== " + name + " ===");

        for(int offset = 0; offset < chunk.code.size();)
        {
            offset = disassembleInstructions(chunk , offset);
        }
    }
    int disassembleInstructions(Chunk chunk, int offset)
    {
        System.out.printf("%04d ",offset);
        byte instruction = chunk.code.get(offset);
        //byte -> unsigned int -> enum
        Chunk.OpCode opCode = Chunk.OpCode.values()[Byte.toUnsignedInt(instruction)];
        
        switch (opCode) {
            case Chunk.OpCode.OP_RETURN -> {
                return simpleInstruction("OP_RETURN", offset);
            }

            default -> {
                System.out.println("Unknown Opcode: "+opCode);
                return offset+1;
            }
        }
    }
    int simpleInstruction(String name, int offset)
    {
        System.out.println(name);
        return offset+1;
    }
}
