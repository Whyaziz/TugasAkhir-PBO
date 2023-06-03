package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        GamePanel gamePanel = new GamePanel();

        window.setTitle("The Maze Runner");
        window.setResizable(false);
        window.add(gamePanel);

        window.pack(); //membuat frame dapat menampung pixel yang dimasukkan pada class GamePanel secara pas

        gamePanel.setUpGame();
        gamePanel.startGame();
        
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}