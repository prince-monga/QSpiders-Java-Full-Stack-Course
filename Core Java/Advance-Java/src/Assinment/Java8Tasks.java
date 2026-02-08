package Assinment;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Java8Tasks {

    public static void main(String[] args) {

        // Print a message using Runnable
        Runnable r = () -> System.out.println("Hello from Runnable");
        r.run();

        //  Convert a string to uppercase using Function
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println(toUpper.apply("java programming"));

        //  Check if a number is even using Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        //  Print each element of a list using Consumer
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> print = n -> System.out.print(n + " ");
        numbers.forEach(print);
        System.out.println();

        // 5️⃣ Sort a list of integers using lambda
        List<Integer> list = Arrays.asList(9, 3, 7, 1, 5);
        Collections.sort(list, (a, b) -> a - b);
        System.out.println("Sorted List: " + list);

        // 6️⃣ Filter names starting with 'A'
        List<String> names = Arrays.asList("Ajay", "Prince", "Amit", "Rahul", "Ankit");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // 7️⃣ Map integers to their squares
        List<Integer> squares =
                numbers.stream()
                       .map(n -> n * n)
                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 8️⃣ Sum of even numbers
        int sumEven =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .mapToInt(Integer::intValue)
                       .sum();
        System.out.println("Sum of even numbers: " + sumEven);

        // 9️⃣ Count words with more than 4 letters
        List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Code", "Programming");
        long count =
                words.stream()
                     .filter(w -> w.length() > 4)
                     .count();
        System.out.println("Words with more than 4 letters: " + count);
    }
}