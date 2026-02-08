package com.lamdafun;

import java.util.function.Predicate;

public class EvenNum {

    // checks EVEN number
    public boolean checkEven(int c) {
        return c % 2 == 0;
    }

    public static void main(String[] args) {

        EvenNum j = new EvenNum();

        // normal method call
        System.out.println(j.checkEven(7));  // false

        
        // Predicate using lambda
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(3));  // false
        System.out.println(isEven.test(8));  // true
        
        //
    }
}
