package com.designPattern.State;
import com.designPattern.Context.Registration;

// State Interface
public interface RegistrationStage {
    void next(Registration registration);
    void prev(Registration registration);
    void display();
}
