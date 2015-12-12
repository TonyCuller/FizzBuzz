package com.company;

public class Main {

    public static void main(String[] args) {
	    String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        int fizzCount = 0;
        int buzzCount = 0;
        int fbCount = 0;

        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(fizzBuzz);
                fbCount++;
            }

            else if (i % 3 == 0){
                System.out.println(fizz);
                fizzCount++;
            }

            else if (i % 5 == 0){
                System.out.println(buzz);
                buzzCount++;
            }

            else {
                System.out.println(i);
            }

        }

        System.out.println("f :" + fizzCount + " b: " + buzzCount + " fb: " + fbCount);
    }
}
