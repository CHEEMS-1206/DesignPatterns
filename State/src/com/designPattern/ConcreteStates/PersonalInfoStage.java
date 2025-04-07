package com.designPattern.ConcreteStates;

import com.designPattern.Context.Registration;
import com.designPattern.State.RegistrationStage;

// Personal Information Stage
public class PersonalInfoStage implements RegistrationStage {
    public void next(Registration registration) {
        registration.setStage(new AddressStage());
    }

    public void prev(Registration registration) {
        System.out.println("Already at the first step.");
    }

    public void display() {
        System.out.println("Stage: Personal Information - Enter your Name, Email, and Contact.");
    }
}
