package se.lexicon;

public class Exercise11 {
    public static void ex11() {
        String Example = "ThisShouldBeConverted";
        char Arr[] = Example.toCharArray();
        System.out.println("Traversing through the char Array");
        for (char str : Arr)
            System.out.print(" " + str + " ");
        System.out.println("\n");
    }

}
