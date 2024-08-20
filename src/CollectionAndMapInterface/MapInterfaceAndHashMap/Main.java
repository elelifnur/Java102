package CollectionAndMapInterface.MapInterfaceAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> country = new HashMap<>();
        country.put("TR", "Türkiye");
        //country.put("TR", "TürkiyeYeni");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        //country.remove("EN");
       // System.out.println(country);
        country.replace("GR", "Alamanya");

        for(String coutnryKey : country.keySet()){
            System.out.println(coutnryKey);
        }

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }
    }
}
