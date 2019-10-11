package problems.problema6;

public class Problem6 {
    public void start() {
        Methods6 methods = new Methods6();
        System.out.println("****************************************************************************************");
        System.out.println("                                    PROBLEM 6 - GCD                                     ");
        System.out.println("****************************************************************************************\n");

        // The greatest common divisor (g.c.d.)
        System.out.println("========================================================================================");
        System.out.println("    * G.C.D:");
        System.out.println("        - G.C.D of 10 and 5: " + methods.GCD(10,5));
        System.out.println("        - G.C.D of 5 and 10: " + methods.GCD(5,10));
        System.out.println("        - G.C.D of 7 and 3: " + methods.GCD(7,3));
        System.out.println("        - G.C.D of 5 and 7: " + methods.GCD(5,7));
        System.out.println("        - G.C.D of 10 and 10: " + methods.GCD(10,10));
        System.out.println("========================================================================================\n");

    }
}
