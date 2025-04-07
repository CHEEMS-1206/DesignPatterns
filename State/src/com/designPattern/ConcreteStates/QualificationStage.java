package com.designPattern.ConcreteStates;

import com.designPattern.Context.Registration;
import com.designPattern.State.RegistrationStage;

// Qualification Stage
public class QualificationStage implements RegistrationStage {
    public void next(Registration registration) {
        registration.setStage(new CompletedStage());
    }

    public void prev(Registration registration) {
        registration.setStage(new AddressStage());
    }

    public void display() {
        System.out.println("Stage: Qualification - Enter your Qualification details.");
    }
}
