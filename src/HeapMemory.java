public class HeapMemory {

    int instanceVariable;
    public static void main(String[] args){

        // Heap>Stringe Pool

        // They are in the String pool
        // They have the same value -> They point to one value
        String cat1 = "Tom";
        String cat2 = "Tom";

        // This is in the String Pool
        // It has it's own data other than cats data
        String dog1 = "Boe";

        // This in the Heap
        // It has it's own data inside Heap
        String car = new String("BMW");
    }

}
;