# REST-API-CLIENT

COMPANY: CODTECH IT SOLUTIONS

NAME: BHUVANESHWARI.K

INTERN ID: CT12LUW

DOMAIN: JAVA PROGRAMMING

DURATION: 8 WEEKS

MENTOR: NEELA SANTOSH

## DESCRIPTION OF TASK: The rest api client task has been successfully runned in the eclipse software platform.

## Explanation:

## Import necessary libraries:

java.io.BufferedReader and java.io.InputStreamReader for reading the HTTP response.

java.net.HttpURLConnection and java.net.URL for making the HTTP request.

org.json.JSONObject and org.json.JSONArray for parsing the JSON response.

## Define constants:

API_KEY: Your OpenWeatherMap API key.

BASE_URL: The base URL for the OpenWeatherMap API.

## Main method:

Define the city for which you want to fetch weather data.

Create the complete URL string by appending the city name and API key to the base URL.

Create a URL object and open a connection to it using HttpURLConnection.

Set the request method to GET.

Get the response code and check if it is HTTP_OK (status code 200).

If the response is successful, read the response using BufferedReader and store it in a StringBuffer.

Parse the JSON response using JSONObject.

Call the displayWeatherData method to display the weather data.

## Display weather data:

Extract the city name, temperature, humidity, and weather description from the JSON response.

Convert the temperature from Kelvin to Celsius.

Print the weather data in a structured format.

## Running the Program in Eclipse:

Create a new Java project in Eclipse.

Create a new Java class file named WeatherClient.

Copy and paste the above code into the WeatherClient class.

Make sure to add the org.json library to your project's build path.

Replace "YOUR_API_KEY" with your actual OpenWeatherMap API key.

Run the WeatherClient class as a Java application.

You should see the weather data for the specified city displayed in the console.

## Output:

Weather data for London:

Temperature: 10.85°C

Humidity: 81%

Description: broken clouds

Hence this task  demonstrates a simple way to consume a public REST API, handle HTTP requests, and parse JSON responses in Java. 
