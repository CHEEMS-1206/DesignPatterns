package com.designPattern.originator;

import com.designPattern.memento.Memento;
import java.util.Random;

public class Game2048 {
    private int[][] board = new int[4][4];
    private Random random = new Random();

    public Game2048() {
        addRandomTile();
        addRandomTile();
    }

    public void moveLeft() {
        for (int i = 0; i < 4; i++) {
            int[] row = board[i];
            int[] newRow = new int[4];
            int index = 0;

            for (int j = 0; j < 4; j++) {
                if (row[j] != 0) {
                    if (index > 0 && newRow[index - 1] == row[j]) {
                        newRow[index - 1] *= 2;
                    } else {
                        newRow[index++] = row[j];
                    }
                }
            }
            board[i] = newRow;
        }
        addRandomTile();
    }

    private void addRandomTile() {
        int x, y;
        do {
            x = random.nextInt(4);
            y = random.nextInt(4);
        } while (board[x][y] != 0);
        board[x][y] = random.nextBoolean() ? 2 : 4;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 0 ? "." : cell) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Memento saveState() {
        return new Memento(board);
    }

    public void restoreState(Memento memento) {
        this.board = memento.getState();
    }
}
