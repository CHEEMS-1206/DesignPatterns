import com.designPattern.concreteObserver.PhoneDisplay;
import com.designPattern.concreteObserver.WebAppDisplay;
import com.designPattern.concreteSubject.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phone1 = new PhoneDisplay("Alice");
        PhoneDisplay phone2 = new PhoneDisplay("Bob");
        WebAppDisplay webApp = new WebAppDisplay("Global Weather");

        // Register observers
        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);
        weatherStation.addObserver(webApp);

        // Update temperature
        System.out.println("\n🔹 Temperature changing to 25°C...");
        weatherStation.setTemperature(25);

        // Update again
        System.out.println("\n🔹 Temperature changing to 30°C...");
        weatherStation.setTemperature(30);

        // Remove an observer and update again
        weatherStation.removeObserver(phone1);
        System.out.println("\n🔹 Temperature changing to 35°C...");
        weatherStation.setTemperature(35);
    }
}
