package com.designPattern.memento;

public class Memento {
    private final int[][] board;

    public Memento(int[][] board) {
        this.board = copyBoard(board);
    }

    public int[][] getState() {
        return copyBoard(board);
    }

    private int[][] copyBoard(int[][] original) {
        int[][] copy = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, 4);
        }
        return copy;
    }
}

