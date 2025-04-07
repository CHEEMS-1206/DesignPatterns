package com.designPattern.ConcreteStates;

import com.designPattern.Context.Registration;
import com.designPattern.State.RegistrationStage;

// Address Stage
public class AddressStage implements RegistrationStage {
    public void next(Registration registration) {
        registration.setStage(new QualificationStage());
    }

    public void prev(Registration registration) {
        registration.setStage(new PersonalInfoStage());
    }

    public void display() {
        System.out.println("Stage: Address - Enter your Address details.");
    }
}
