package main;

import Monster.Goblin;
import Monster.Slime;
import Objects.ExitDoor;


public class ObjectsSetter {
    GamePanel gamePanel;

    public ObjectsSetter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setObj(){
        gamePanel.exitDoor = new ExitDoor();
        gamePanel.exitDoor.targetWorldX = 56 * gamePanel.florSize;
        gamePanel.exitDoor.targetWorldY = 54 * gamePanel.florSize;

    }

    public void setMonster(){
        gamePanel.monster[0] = new Slime(gamePanel);
        gamePanel.monster[0].worldX = 25*gamePanel.florSize;
        gamePanel.monster[0].worldY = 7*gamePanel.florSize;

        gamePanel.monster[1] = new Slime(gamePanel);
        gamePanel.monster[1].worldX = 25*gamePanel.florSize;
        gamePanel.monster[1].worldY = 39*gamePanel.florSize;

        gamePanel.monster[2] = new Slime(gamePanel);
        gamePanel.monster[2].worldX = 52*gamePanel.florSize;
        gamePanel.monster[2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[3] = new Goblin(gamePanel);
        gamePanel.monster[3].worldX = 38*gamePanel.florSize;
        gamePanel.monster[3].worldY = 29*gamePanel.florSize;
    }
}
