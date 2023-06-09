public class LogicOperators {
    public static void main(String[] args) {
        boolean myBoolean1 = (3 + 3) > 3 ; // true
        boolean myBoolean2 = (5+9) < 55; // true
        boolean myBoolean3 = (34+1) <= (2+3); // false
        boolean myBoolean4 = 5>=5; // true
        boolean myBoolean5 = 5 == 1; // false
        boolean myBoolean6 = 23+5!=23+5; // true

        int number = 40, divider = 9;
        boolean myBoolean7 = number % divider == 0;



        System.out.println(myBoolean1);
        System.out.println(myBoolean2);
        System.out.println(myBoolean3);
        System.out.println(myBoolean4);
        System.out.println(myBoolean5);
        System.out.println(myBoolean6);
        String result = number+" has no remainder dividing by "+divider + " " + myBoolean7;
        System.out.println(result);
    }
}
