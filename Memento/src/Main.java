
import com.designPattern.memento.Memento;
import com.designPattern.caretaker.GameHistory;
import com.designPattern.originator.Game2048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game2048 game = new Game2048();
        GameHistory history = new GameHistory();

        history.saveState(game.saveState());

        while (true) {
            System.out.println("Current Board:");
            game.printBoard();
            System.out.println("[L] Move Left  [U] Undo  [R] Redo  [P] Replay  [Q] Quit");
            System.out.print("Choose an option: ");
            char choice = scanner.next().charAt(0);

            switch (Character.toUpperCase(choice)) {
                case 'L':
                    game.moveLeft();
                    history.saveState(game.saveState());
                    break;
                case 'U':
                    Memento prevState = history.undo();
                    if (prevState != null) {
                        game.restoreState(prevState);
                        System.out.println("Undo successful!");
                    } else {
                        System.out.println("No more undo steps!");
                    }
                    break;
                case 'R':
                    Memento nextState = history.redo();
                    if (nextState != null) {
                        game.restoreState(nextState);
                        System.out.println("Redo successful!");
                    } else {
                        System.out.println("No more redo steps!");
                    }
                    break;
                case 'P':
                    System.out.println("\nReplaying moves...");
                    for (Memento memento : history.getReplayHistory()) {
                        game.restoreState(memento);
                        game.printBoard();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    break;
                case 'Q':
                    System.out.println("Exiting game.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
