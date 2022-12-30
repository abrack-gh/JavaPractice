package Bitwise;

public class Bitwise {

    public static void main(String[] args) {

        // & (AND) means if when comparing two decimal values, the binary values match, the output is 1, else it's 0.
        // 1 1 = 1;
        // 0 1 = 0;
        // 1 0 = 1;

        int a = 15; // 1 1 0 0 1
        int b = 25; // 0 1 1 1 1

        // int c =     0 1 0 0 1 (=9)

        int c = a & b; //will print numeric value of binary

        System.out.println(c);


        // OR OPERATOR


        // | (OR) means if binary value is 1 or 0, the return will be 1.
        // 0 1 = 1;
        // 0 0 = 0;
        // 1 0 = 1;

        int x = 15; // 1 1 1 1
        int y = 27; // 1 1 0 1 1

        //int z =      1 1 1 1 1 (= 31)

        int z = x | y;
        System.out.println(z);


    }

    public void XOR() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 ^ value2;
        System.out.println(result);
    }
}
