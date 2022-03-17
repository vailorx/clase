package tema6;

import java.util.HashMap;

public class hashmap {
public static void main(String[] arg) {
	HashMap<String, String> capitalCities = new HashMap<String, String>();
	// add keys and values (Country, city) -> los archivos json utilizan lo mismo, (keys = variable)
	capitalCities.put("England", "London");
	capitalCities.put("Germany", "Berlin");
	capitalCities.put("Norway", "Oslo");
	capitalCities.put("USA", "Washington DC");
	System.out.println(capitalCities);
	System.out.println(capitalCities.get("England"));
	capitalCities.remove("England");
	System.out.println(capitalCities);
}
}
