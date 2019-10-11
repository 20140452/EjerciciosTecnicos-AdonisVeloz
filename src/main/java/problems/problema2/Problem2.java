package problems.problema2;

import org.json.simple.JSONObject;

public class Problem2 {
    public void start(){
        Methods2 methods = new Methods2();

        methods.fillList();

        System.out.println("****************************************************************************************");
        System.out.println("                                    PROBLEM 2 - Maps");
        System.out.println("****************************************************************************************\n");

        System.out.println("========================================================================================");
        System.out.println("    * Return coordinates in String:");
        //Return the coordinates of a specific city in String format.
        System.out.println("        - Ciudad:"+ methods.getCities().get(0).getName() + "    Coordenadas:"+
                methods.returnPointsToString(methods.getCities().get(0)));
        System.out.println("========================================================================================\n");

        System.out.println("========================================================================================");
        System.out.println("    * Return JSON string for the map API:");
        for(JSONObject o : methods.returnToMap())
            System.out.println(o);
        System.out.println("========================================================================================\n");
    }
}
