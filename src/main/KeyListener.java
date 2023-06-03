package main;

import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

    GamePanel gamePanel;

    public boolean pressUp;
    public boolean pressLeft;
    public boolean pressDown;
    public boolean pressRight;
    public boolean pressEnter;

    public KeyListener(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode(); //ascii codes

        //Menu
        if (gamePanel.gameState == gamePanel.menuState){

            //Enter Listener
            if (gamePanel.ui.menuNum == 1){
                if (keyCode == KeyEvent.VK_ENTER){
                    gamePanel.gameState = gamePanel.playState;
                    gamePanel.ui.menuNum = 0;
                }
            }
            if (gamePanel.ui.menuNum == 2){
                if (keyCode == KeyEvent.VK_ENTER){
                    System.exit(0);
                }
            }

            //move key
            if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP){
                gamePanel.ui.menuNum--;
                if (gamePanel.ui.menuNum < 1){
                    gamePanel.ui.menuNum = 2;
                }
            }
            if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN){
                gamePanel.ui.menuNum++;
                if (gamePanel.ui.menuNum > 2){
                    gamePanel.ui.menuNum = 1;
                }
            }
        }


        //map choose
        if (gamePanel.gameState == gamePanel.playState) {

            //Move key
            if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
                gamePanel.ui.mapNum--;
                if (gamePanel.ui.mapNum < 1) {
                    gamePanel.ui.mapNum = 3;
                }
            }
            if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
                gamePanel.ui.mapNum++;
                if (gamePanel.ui.mapNum > 3) {
                    gamePanel.ui.mapNum = 1;
                }
            }

            //Enter Listener
            if (gamePanel.ui.mapNum == 1) {
                if (keyCode == KeyEvent.VK_ENTER) {
                    gamePanel.gameState = gamePanel.playingState;
                    gamePanel.currentMap = 0;
                    gamePanel.ui.mapNum = 0;
                }
            }
            if (gamePanel.ui.mapNum == 2) {
                if (keyCode == KeyEvent.VK_ENTER) {
                    gamePanel.gameState = gamePanel.playingState;
                    gamePanel.currentMap = 1;
                    gamePanel.ui.mapNum = 0;
                }
            }
            if (gamePanel.ui.mapNum == 3) {
                if (keyCode == KeyEvent.VK_ENTER) {
                    gamePanel.gameState = gamePanel.playingState;
                    gamePanel.currentMap = 2;
                    gamePanel.ui.mapNum = 0;
                }
            }
        }


        //Movement
        if (gamePanel.gameState == gamePanel.playingState){
            if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP){
                pressUp = true;
            }
            if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT){
                pressLeft = true;
            }
            if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN){
                pressDown = true;
            }
            if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT){
                pressRight = true;
            }
        }
        if (keyCode == KeyEvent.VK_ENTER){
            pressEnter = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode(); //ascii code

        if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP){
            pressUp = false;
        }
        if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT){
            pressLeft = false;
        }
        if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN){
            pressDown = false;
        }
        if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT){
            pressRight = false;
        }
        if (keyCode == KeyEvent.VK_ENTER){
            pressEnter = false;
        }
    }
}
