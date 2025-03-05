package com.designPattern.caretaker;

import com.designPattern.memento.Memento;
import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private List<Memento> history = new ArrayList<>();
    private int currentIndex = -1;

    public void saveState(Memento memento) {
        if (currentIndex < history.size() - 1) {
            history = history.subList(0, currentIndex + 1);
        }
        history.add(memento);
        currentIndex++;
    }

    public Memento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        }
        return null;
    }

    public Memento redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        }
        return null;
    }

    public List<Memento> getReplayHistory() {
        return history;
    }
}

