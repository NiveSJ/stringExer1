package se.lexicon;

import java.util.Arrays;

public class Exercise09 {
    public static void ex9() {
        String Example="oil and Water";
        String [] Exam= Example.split("and");
        System.out.println("Split Example:" + " "+ Example + " "+ Arrays.toString(Exam));

    }
}
