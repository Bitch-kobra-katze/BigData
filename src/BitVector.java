import java.util.Arrays;

class BitVector1 {

    private byte[] p;

    private BitVector1(){
        p = null;
    }

    public BitVector1(int n){
        assert  n> 0;
        p = new byte[(n)];
        Arrays.fill(p, (byte) 0);
    }

    public BitVector1(int n, Arrays info){
        assert  n> 0;
        p = new byte[(n)];
        Arrays.fill(p, (byte) 0);
    }

    public void mutator(int index, int newValue ){
        int i = p.length - (index +1 );
        p[i] = (byte) newValue;
    }

    public byte accessor(int index){
        int i = p.length - (index +1 );
        return p[i];
    }

    public void print(){
        for (byte aByte : p) {
            System.out.print(aByte+ " ");
        }
        System.out.println("\n");
    }
}
