public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println(111%3);
        System.out.println(55%52);
        System.out.println(1%5);
        System.out.println((double)5); // result is 5.0
        System.out.println((double)5 / 2); // result 2.5
        System.out.println(8.0 % 3); // result is 2.0
        // 6 / 3 * 2 * 10 / (double)(10-5) % 3 -> result is 2.0
        System.out.println(6 / 3 * 2 * 10 / (double)(10-5) % 3); // result is 2.0

        String myString = "Hello Batch3"+ 5; // Hello Batch35
        System.out.println("1 + 2 = " + 3 + 6); // result is 1 + 2 = 36
        System.out.println("6 + 3 = " + (3 + 6)); // result is 1 + 2 = 9
        System.out.println(1 + 2 + "abc"); // result is 3abc
        System.out.println("abc" + 1 + 2); // result is 12

    }
}
