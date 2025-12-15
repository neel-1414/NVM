
public class Main{
    public static void main(String[] args) {
        Chunk c = new Chunk();

        //passing the instruction and the line number 
        int index = c.addconstant(1.2);
        c.writeCode(Chunk.OpCode.OP_CONSTANT, 1);
        c.writeByte( (byte)index,2 );

        index = c.addconstant(3.4);
        c.writeCode(Chunk.OpCode.OP_CONSTANT, 3);
        c.writeByte((byte)index, 4);

        c.writeCode(Chunk.OpCode.OP_ADD, 5);

        index = c.addconstant(5.6);
        c.writeCode(Chunk.OpCode.OP_CONSTANT, 6);
        c.writeByte((byte)index, 7);

        c.writeCode(Chunk.OpCode.OP_DIVIDE, 8);

        c.writeCode(Chunk.OpCode.OP_NEGATE, 9);

        c.writeCode(Chunk.OpCode.OP_RETURN, index);


        // Debug debug = new Debug();
        VM vm = new VM();
        Interpret p =  vm.interpret(c);
        System.out.println();
        System.out.println(p);
        // debug.disassemblerChunk(c, "Test 1");
    }
}