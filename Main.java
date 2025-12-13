
public class Main{
    public static void main(String[] args) {
        Chunk c = new Chunk();

        //passing the instruction and the line number 
        c.write(Chunk.OpCode.OP_RETURN, 1);
        c.write(Chunk.OpCode.OP_ADD, 2);
        Debug debug = new Debug();
        debug.disassemblerChunk(c, "Test 1");
    }
}