package problems.problema3;

import problems.problema3.entities.Pair;

public class Problem3 {
    public void start(){
        Methods3 methods = new Methods3();
        methods.fillLists();
        System.out.println("****************************************************************************************");
        System.out.println("                             PROBLEM 3 - Cartesian Products");
        System.out.println("****************************************************************************************\n");

        // Cartesian Product
        System.out.println("========================================================================================");
        System.out.println("    * Set values:");
        System.out.println("        - Set A: " + methods.getSetA());
        System.out.println("        - Set B: " + methods.getSetB());
        System.out.println("    * Cartesian Product:");
        for (Pair p : methods.cartesianProduct(methods.getSetA(),methods.getSetB()))
            System.out.println("        - " + p.toString());
        System.out.println("========================================================================================\n");

        // Compare Pairs
        System.out.println("========================================================================================");
        System.out.println("    * Pairs Comparison:");
        System.out.println("        - Result between "+methods.getExample1()+" and "+methods.getExample2()+
                ": " + methods.comparePairs(methods.getExample1(),methods.getExample2()));
        System.out.println("        - Result between "+methods.getExample1()+" and "+methods.getExample3()+
                ": " + methods.comparePairs(methods.getExample1(),methods.getExample3()));
        System.out.println("        - Result between "+methods.getExample2()+" and "+methods.getExample1()+
                ": " + methods.comparePairs(methods.getExample2(),methods.getExample1()));
        System.out.println("        - Result between "+methods.getExample4()+" and "+methods.getExample5()+
                ": " + methods.comparePairs(methods.getExample4(),methods.getExample5()));
        System.out.println("        - Result between "+methods.getExample5()+" and "+methods.getExample5()+
                ": " + methods.comparePairs(methods.getExample5(),methods.getExample5()));
        System.out.println("========================================================================================\n");



    }
}
