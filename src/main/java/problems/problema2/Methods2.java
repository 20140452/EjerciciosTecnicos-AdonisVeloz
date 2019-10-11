package problems.problema2;

import org.json.simple.JSONObject;
import problems.problema2.entitities.City;
import problems.problema2.entitities.Point;

import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    List<City> cities = new ArrayList<>();

    Methods2() {
    }

    List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    void fillList(){
        cities.add(new City("Santiago",new Point(20,16)));
        cities.add(new City("La Vega",new Point(16,34)));
        cities.add(new City("Santo Domingo",new Point(50,47)));
        cities.add(new City("Puerto Plata",new Point(50,26)));
        cities.add(new City("Punta Cana",new Point(78,80)));
    }
    String returnPointsToString(City city){
        return city.getCordinates().toString();
    }

    List<JSONObject> returnToMap(){
        List<JSONObject> jsonList = new ArrayList<>();
        JSONObject aux;
        for (City city : cities){
            aux = new JSONObject();
            aux.put("nombre",city.getName());
            aux.put("x",city.getCordinates().getXString());
            aux.put("y",city.getCordinates().getYString());
            jsonList.add(aux);
        }
        System.out.println("Complete JSON list:");
        System.out.println(jsonList+"\n");
        return jsonList;
    }
}
