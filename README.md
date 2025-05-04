# REST-API-CLIENT

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: VANSHITA RATHOD

*INTERN ID*: CT06DA295

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTOSH

# **Java Weather API Project**

In this project, I developed a simple Java application that consumes a public REST API to fetch live weather data and display it in a structured format. This kind of application is useful in many real-world scenarios, like weather apps, dashboards, and travel services where users need up-to-date weather information. I used core Java features, an HTTP client library, and a weather API like OpenWeatherMap to build and test this project.

The main goal of the project was to take a city name as input and display weather details like temperature, humidity, wind speed, and weather conditions. The application connects to the weather API using HTTP requests, parses the JSON response, and neatly formats the output to show the user-friendly data. This process helped me understand how REST APIs work and how we can interact with them in Java.

To build this application, I used a basic setup with Notepad as my code editor and the command prompt to compile and run the Java code. This helped me practice coding without depending on IDEs like Eclipse or IntelliJ. I used Java 11 and included an external library called `org.json` to parse JSON data, which is the format used by the weather API to return responses.

The structure of the program includes a class with a `main()` method that takes the city name as input. Then, using `HttpURLConnection`, the program sends a GET request to the API endpoint with the city as a parameter. Once the response is received, it is converted into a string, parsed into a JSON object, and the required fields such as temperature and description are extracted and printed. This format helps users easily understand the current weather conditions.

This project taught me how to handle network connections in Java, work with APIs, and use external libraries to parse data formats like JSON. I also learned how to handle exceptions, manage HTTP response codes, and ensure that the application doesn't crash due to connection errors or invalid inputs.

Such applications are useful in many industries. For example, a logistics company can use this kind of tool to monitor weather conditions in delivery areas. Similarly, travel companies can integrate this into their platforms to inform users about weather forecasts. Even simple desktop or mobile weather widgets use the same concept.

Overall, this Java project gave me practical experience in connecting Java applications with online APIs. I also understood how to work with live data, handle external responses, and present the output in a readable way. The project used only basic tools—Notepad and the Java compiler—but still provided the feel of a real-world software module. It can be further improved by adding graphical interfaces or allowing more detailed input like country codes or date-based forecasts.#
