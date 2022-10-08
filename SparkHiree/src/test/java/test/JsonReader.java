package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class JsonReader {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			Gson gson = new Gson();

			Object obj = parser.parse(new FileReader(
					"C:\\Users\\mS\\Documents\\Mona_QA_Programs_Eclipse\\SparkHiree\\JsonFile\\apertureLabsClocks(2)(1)(2).json"));
			JSONObject jsonObject = (JSONObject) obj;

			List<Employee> employees = getEmployeeList(gson, (JSONArray) jsonObject.get("employees"));
			List<Clock> clocks = getClockList(gson, (JSONArray) jsonObject.get("clocks"));

			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Employee> getEmployeeList(Gson gson, JSONArray employees) {

		List<Employee> objects = new ArrayList<Employee>();

		Iterator iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee object = gson.fromJson(((JSONObject) iterator.next()).toString(), Employee.class);
			objects.add(object);
		}

		return objects;
	}

	public static List<Clock> getClockList(Gson gson, JSONArray clocks) {

		List<Clock> objects = new ArrayList<Clock>();
		Iterator iterator = clocks.iterator();
		while (iterator.hasNext()) {
			Clock object = gson.fromJson(((JSONObject) iterator.next()).toString(), Clock.class);
			objects.add(object);
		}

		return objects;
	}

}