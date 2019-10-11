package problems.problema4;

public class Problem4 {
    public void start(){
        Methods4 methods = new Methods4();

        System.out.println("****************************************************************************************");
        System.out.println("                                PROBLEM 4 - Cannonballs                                 ");
        System.out.println("****************************************************************************************\n");

        // Cartesian Product
        System.out.println("========================================================================================");
        System.out.println("    * Number of cannonballs per layers:");
        System.out.println("        - For 4 layers: " + methods.countCannonball(4));
        System.out.println("        - For 3 layers: " + methods.countCannonball(3));
        System.out.println("        - For 2 layers: " + methods.countCannonball(2));
        System.out.println("        - For 1 layers: " + methods.countCannonball(1));
        System.out.println("        - For 0 layers: " + methods.countCannonball(0));
        System.out.println("========================================================================================\n");
    }
}
