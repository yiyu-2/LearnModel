package org.example.gamedesign.ComandModel;

public interface Command {
    void execute(User user);
    void undo(User user);
}
