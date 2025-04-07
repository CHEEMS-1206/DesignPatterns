import com.designPattern.Context.Registration;

// Demo
public class Main {
    public static void main(String[] args) {
        Registration registration = new Registration();

        registration.displayStep(); // Stage: Personal Information
        registration.nextStep();

        registration.displayStep(); // Stage: Address
        registration.nextStep();

        registration.displayStep(); // Stage: Qualification
        registration.nextStep();

        registration.displayStep(); // Stage: Completed
        registration.prevStep();

        registration.displayStep(); // Stage: Qualification
    }
}
