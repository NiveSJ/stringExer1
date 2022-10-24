package se.lexicon;

import java.util.Arrays;

public class Exercise10 {
    public static void ex10() {

        String Example="Carl,Susie,Fredrick,Bob,Erik";
        String[] str=Example.split(",");
        System.out.println("original String:"+ " "+ Example);
        System.out.println("String Split and Display"+ " "+ Arrays.toString(str) );

    }
}
