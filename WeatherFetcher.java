import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherFetcher {

    static final String API_KEY = "b326d542b3446763c2bcf9e5b997e392";
    static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = "Mumbai";
        fetchWeatherData(city);
    }

    public static void fetchWeatherData(String city) {
        try {
            String urlString = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            parseAndDisplayWeather(response.toString());

        } catch (Exception e) {
            System.out.println("Error fetching weather data: " + e.getMessage());
        }
    }

    public static void parseAndDisplayWeather(String response) {
        JSONObject json = new JSONObject(response);
        JSONObject main = json.getJSONObject("main");
        JSONObject wind = json.getJSONObject("wind");
        String cityName = json.getString("name");
        String weatherDescription = json.getJSONArray("weather").getJSONObject(0).getString("description");

        System.out.println("City: " + cityName);
        System.out.println("Temperature: " + main.getDouble("temp") + " °C");
        System.out.println("Humidity: " + main.getInt("humidity") + "%");
        System.out.println("Weather: " + weatherDescription);
        System.out.println("Wind Speed: " + wind.getDouble("speed") + " m/s");
    }
}
