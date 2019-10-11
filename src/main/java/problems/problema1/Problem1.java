package problems.problema1;


public class Problem1 {
    public void start(){
        Methods1 methods = new Methods1();

        methods.fillAddressBook();

        System.out.println("****************************************************************************************");
        System.out.println("                               PROBLEM 1 - Set Callbacks");
        System.out.println("****************************************************************************************\n");

        //a)
        System.out.println("========================================================================================");
        System.out.println("Part a) \n");
        methods.compareEntry("Nuñez","Juan");
        methods.compareEntry("Perez","Juan");
        methods.compareEntry("Herreras","Carlos");
        methods.compareEntry("Luis","Martinez");
        methods.compareEntry("Martinez","Luis");
        System.out.println("========================================================================================\n");

        /*
            If an entry appears more than one, it will continue to search if others coincidences have been found,
             returning TRUE in the end if at least one have been found and FALSE if no entry was found.
         */

        //a) Alternative
        System.out.println("========================================================================================");
        System.out.println("Part a) Alternative\n");
        methods.compareEntryExists("Nuñez","Juan");
        methods.compareEntryExists("Perez","Juan");
        methods.compareEntryExists("Herreras","");
        methods.compareEntryExists("Luis","Martinez");
        methods.compareEntryExists("Martinez","Luis");
        System.out.println("========================================================================================\n");

        /*
            In this alternative method, it will only compare if the entry was found stopping after the first
             coincidence.
        */

        //b)
        System.out.println("========================================================================================");
        System.out.println("Problem b)\n");
        methods.compareString("hello");
        methods.compareString("Noon");
        methods.compareString("WORLD");
        methods.compareString("Book");
        System.out.println("========================================================================================\n");
    }

}
