package problems.problema7;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public void start(){
        Methods7 methods = new Methods7();
        List<Integer> weights = new ArrayList<>();
        weights.add(1);
        weights.add(3);

        System.out.println("****************************************************************************************");
        System.out.println("                          PROBLEM 7 - Old-Fashioned Measuring                           ");
        System.out.println("****************************************************************************************\n");

        System.out.println("========================================================================================");
        System.out.println("    * Examples of weights:");
        System.out.println("        - for 4 ounces: " + methods.isMeasurable(4,weights));
        System.out.println("        - for 2 ounces: " + methods.isMeasurable(2,weights));
        System.out.println("        - for 5 ounces: " + methods.isMeasurable(5,weights));

        System.out.println("========================================================================================\n");
    }
}
