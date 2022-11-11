/*3. Write a program ReplaceTester that encodes a string by replacing all letters "i"
with "!" and all letters "s" with "$". Use the replace method. Demonstrate that */

public class ReplaceTester {
    public static void main(String[] args) {
        String x="Mississippi";
        x=x.replace("i","!");
        x=x.replace("s","$");
        System.out.println(x);
       // output = M!$$!$$!pp!


    }
}
