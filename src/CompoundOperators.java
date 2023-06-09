public class CompoundOperators {
    public static void main(String[] args) {
        int myInt = 5;
        myInt = myInt + 5;
        // Compound operators
        myInt+=5;// 15; the same like myInt = myInt + 5;
        myInt-=5;// 10
        myInt*=3;// 30
        myInt/=3; // 10
        myInt%=5; // 0
        myInt-=1; // -1

        // Increments and Decrements
        myInt--; // postDecrement
        myInt--; // postDecrement
        myInt++; // postIncrement
        myInt++; // postIncrement
        --myInt; // preDecrement
        ++myInt; // preIncrement
        System.out.println(myInt);

        int number = 10;
        System.out.println(number);
        System.out.println("Before: "+number);
        System.out.println(++number); // 11
        System.out.println(number++); // 11
    }
}
