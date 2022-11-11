/*2. Write a program that initializes a string with "Mississippi". Then replace all
"i" with "ii" and print the length of the resulting string. In that string, replace
all "ss" with "s" and print the length of the resulting string.*/


public class Mississippi {
    public static void main(String[] args) {
        String x="Mississippi";
        System.out.println(x + "\n");
        x=x.replace("i","ii");
        System.out.println("length of string = " + x.length() + "\n");
        x=x.replace("ss","s");
        System.out.println("length of string = " + x.length() + "\n");



    }
}

