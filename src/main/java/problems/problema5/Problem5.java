package problems.problema5;

public class Problem5 {
    public void start(){
        Methods5 methods = new Methods5();
        System.out.println("****************************************************************************************");
        System.out.println("                               PROBLEM 5 - ReverseString                                ");
        System.out.println("****************************************************************************************\n");

        // Reverse with recursive
        System.out.println("========================================================================================");
        System.out.println("    * Reverse by Recursion:");
        System.out.println("        - For Hello: " + methods.reverseRecursive("Hello"));
        System.out.println("        - For World: " + methods.reverseRecursive("World"));
        System.out.println("        - For WORD: " + methods.reverseRecursive("WORD"));
        System.out.println("        - For recursivE: " + methods.reverseRecursive("recursivE"));
        System.out.println("========================================================================================\n");

        // Reverse with iteration
        System.out.println("========================================================================================");
        System.out.println("    * Reverse by Iteration:");
        System.out.println("        - For Hello: " + methods.reverseIteration("Hello"));
        System.out.println("        - For World: " + methods.reverseIteration("World"));
        System.out.println("        - For WORD: " + methods.reverseIteration("WORD"));
        System.out.println("        - For recursivE: " + methods.reverseIteration("recursivE"));
        System.out.println("========================================================================================\n");

        /*
            The iteration method is more obvious, but with the end condition of the recursive method in mind,
            doing the recursive process is more efficient and need less lines of code to get the same result.
         */
    }
}
