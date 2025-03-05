import com.designPattern.component.Light;
import com.designPattern.component.SmartDoor;
import com.designPattern.component.Thermostat;
import com.designPattern.concreteMediator.HomeAutomationHub;
import com.designPattern.mediator.SmartHomeMediator;

public class Main {
    public static void main(String[] args) {
        SmartHomeMediator homeHub = new HomeAutomationHub();

        Light livingRoomLight = new Light(homeHub, "Living Room Light");
        Thermostat thermostat = new Thermostat(homeHub, "Home Thermostat");
        SmartDoor frontDoor = new SmartDoor(homeHub, "Front Door");

        // Simulating device interactions
        livingRoomLight.sendCommand("Turn On Lights");
        thermostat.sendCommand("Increase Temperature");
        frontDoor.sendCommand("Lock Door");
    }
}
