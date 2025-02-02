import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherClient {

    // Function to fetch weather data
    public static String getWeatherData(String city) throws Exception {
        String apiKey = "YOUR_API_KEY"; // Replace with your API key
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            return response.toString();
        } else {
            throw new Exception("GET request not worked");
        }
    }

    // Main function
    public static void main(String[] args) {
        try {
            String city = "London"; // Example city
            String jsonStr = getWeatherData(city);
            
            // Parse JSON response
            JSONObject jsonObj = new JSONObject(jsonStr);
            String weatherDescription = jsonObj.getJSONArray("weather").getJSONObject(0).getString("description");
            double temperature = jsonObj.getJSONObject("main").getDouble("temp") - 273.15; // Convert Kelvin to Celsius
            
            // Display the data in a structured format
            System.out.println("Weather in " + city + ":");
            System.out.println("Description: " + weatherDescription);
            System.out.println("Temperature: " + String.format("%.2f", temperature) + " °C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
