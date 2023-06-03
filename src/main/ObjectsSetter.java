package main;

import Monster.Goblin;
import Monster.Slime;
import Objects.ExitDoor;


public class ObjectsSetter {
    GamePanel gamePanel;

    public ObjectsSetter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setExit(){
        int mapNum = 0;
        gamePanel.exitDoor[mapNum] = new ExitDoor();
        gamePanel.exitDoor[mapNum].targetWorldX = 56 * gamePanel.florSize;
        gamePanel.exitDoor[mapNum].targetWorldY = 54 * gamePanel.florSize;

        mapNum = 1;
        gamePanel.exitDoor[mapNum] = new ExitDoor();
        gamePanel.exitDoor[mapNum].targetWorldX = 56 * gamePanel.florSize;
        gamePanel.exitDoor[mapNum].targetWorldY = 54 * gamePanel.florSize;

        mapNum = 2;
        gamePanel.exitDoor[mapNum] = new ExitDoor();
        gamePanel.exitDoor[mapNum].targetWorldX = 56 * gamePanel.florSize;
        gamePanel.exitDoor[mapNum].targetWorldY = 54 * gamePanel.florSize;
    }

    public void setMonster(){

        int mapNum = 0;
        gamePanel.monster[mapNum][0] = new Slime(gamePanel);
        gamePanel.monster[mapNum][0].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 7*gamePanel.florSize;

        gamePanel.monster[mapNum][1] = new Slime(gamePanel);
        gamePanel.monster[mapNum][1].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 39*gamePanel.florSize;

        gamePanel.monster[mapNum][2] = new Slime(gamePanel);
        gamePanel.monster[mapNum][2].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 29*gamePanel.florSize;

        mapNum = 1;
        gamePanel.monster[mapNum][0] = new Slime(gamePanel);
        gamePanel.monster[mapNum][0].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 7*gamePanel.florSize;

        gamePanel.monster[mapNum][1] = new Slime(gamePanel);
        gamePanel.monster[mapNum][1].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 39*gamePanel.florSize;

        gamePanel.monster[mapNum][2] = new Slime(gamePanel);
        gamePanel.monster[mapNum][2].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 29*gamePanel.florSize;

        mapNum = 2;
        gamePanel.monster[mapNum][0] = new Slime(gamePanel);
        gamePanel.monster[mapNum][0].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 7*gamePanel.florSize;

        gamePanel.monster[mapNum][1] = new Slime(gamePanel);
        gamePanel.monster[mapNum][1].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 39*gamePanel.florSize;

        gamePanel.monster[mapNum][2] = new Slime(gamePanel);
        gamePanel.monster[mapNum][2].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 29*gamePanel.florSize;
    }
}
