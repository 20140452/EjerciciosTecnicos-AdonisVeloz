package problems.problema8;

public class Problem8 {
    public void start(){
        Methods8 methods = new Methods8();

        methods.fillMap();

        System.out.println("****************************************************************************************");
        System.out.println("                               PROBLEM 8 - List Mnemonics                               ");
        System.out.println("****************************************************************************************\n");

        System.out.println("========================================================================================");
        System.out.println("    * List of Mnemonics:");
        System.out.println("        - Mnemonics of 723: ");
        methods.printMnemonics(methods.listMnemonics("723"));
        System.out.println("        - Mnemonics of 6378687: ");
        methods.printMnemonics(methods.listMnemonics("6378687"));
        System.out.println("========================================================================================\n");
    }
}
