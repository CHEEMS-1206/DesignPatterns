package com.designPattern.Context;

import com.designPattern.ConcreteStates.PersonalInfoStage;
import com.designPattern.ConcreteStates.QualificationStage;
import com.designPattern.State.RegistrationStage;

// Registration Class (Context)
public class Registration {
    private RegistrationStage stage;

    public Registration() {
        this.stage = new PersonalInfoStage(); // Default to first stage
    }

    public void setStage(RegistrationStage stage) {
        this.stage = stage;
    }

    public void nextStep() {
        stage.next(this);
    }

    public void prevStep() {
        stage.prev(this);
    }

    public void displayStep() {
        stage.display();
    }
}