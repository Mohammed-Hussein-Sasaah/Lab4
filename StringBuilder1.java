/*5. The StringBuilder class has a method for reversing a string. In a ReverseTester
class, construct a StringBuilder from a given string (such as "desserts"), call
the reverse method followed by the toString method, and print the result. Also
print the expected value*/


public class StringBuilder1 {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("desserts");

        System.out.println("String = " + str.toString());

        StringBuilder reverseStr = str.reverse();

        System.out.println("Reverse String = " + reverseStr.toString());
    }

}

