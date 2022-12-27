package Recursion;

public class Recursion {
    public static void main(String[] args) {
        sayHi(1000); //will call sayHi() 3 times.
    }

    private static void sayHi(int count){
        System.out.println("Hi!");

        if(count <= 1 ){
            return;
        }

        //Count is x (as defined in main method), so skips above conditional loop

        sayHi(count - 1); //calls recurisvely with count parameter of 2.
    }
}