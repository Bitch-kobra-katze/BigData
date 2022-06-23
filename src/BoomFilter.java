import java.util.ArrayList;

public class BoomFilter {

    public BitVector1 vector;
    private Integer arraySize;
    private Integer keyCount;
    public BoomFilter( int key, int bitVectorSize){
        keyCount = key;
        arraySize = bitVectorSize;
        vector = new BitVector1(bitVectorSize);

    }

    public void addElement(String element) {
        ArrayList<Integer> hashCodes = HashGenerator.hashCodes(element, keyCount,arraySize);

        for(Integer i : hashCodes){
            vector.mutator((i % arraySize), 1);
        }
    }

    public Boolean checkIfElementExists(String element) {
        ArrayList<Integer> compareHashCodes = HashGenerator.hashCodes(element, keyCount,arraySize);
        // wird glaub nicht gebraucht
        BitVector1 compareVector = new BitVector1(arraySize);
        for(Integer i : compareHashCodes){
            compareVector.mutator((i % arraySize), 1);
        }
        // nicht gebracuht ende
        for(Integer i : compareHashCodes){
            if(vector.accessor(i) != 1){
                return false;
            }

        }
        return true;
    }
}
