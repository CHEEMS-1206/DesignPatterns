package com.designPattern.ConcreteStates;

import com.designPattern.Context.Registration;
import com.designPattern.State.RegistrationStage;

// Completed Stage
class CompletedStage implements RegistrationStage {
    public void next(Registration registration) {
        System.out.println("Registration is already completed.");
    }

    public void prev(Registration registration) {
        registration.setStage(new QualificationStage());
    }

    public void display() {
        System.out.println("Stage: Completed - Registration Complete! Thank you.");
    }
}
