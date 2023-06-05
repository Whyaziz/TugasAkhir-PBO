package main;

import Monster.Demon;
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
        gamePanel.exitDoor[mapNum].targetWorldX = 18 * gamePanel.florSize;
        gamePanel.exitDoor[mapNum].targetWorldY = 71 * gamePanel.florSize;

        mapNum = 2;
        gamePanel.exitDoor[mapNum] = new ExitDoor();
        gamePanel.exitDoor[mapNum].targetWorldX = 96 * gamePanel.florSize;
        gamePanel.exitDoor[mapNum].targetWorldY = 31 * gamePanel.florSize;
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

        gamePanel.monster[mapNum][4] = new Demon(gamePanel);
        gamePanel.monster[mapNum][4].worldX = 28*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 14*gamePanel.florSize;

        gamePanel.monster[mapNum][5] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][5].worldX = 50*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 54*gamePanel.florSize;

        gamePanel.monster[mapNum][6] = new Demon(gamePanel);
        gamePanel.monster[mapNum][6].worldX = 49*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 12*gamePanel.florSize;

        gamePanel.monster[mapNum][7] = new Slime(gamePanel);
        gamePanel.monster[mapNum][7].worldX = 53*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][8] = new Slime(gamePanel);
        gamePanel.monster[mapNum][8].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 45*gamePanel.florSize;

        gamePanel.monster[mapNum][9] = new Slime(gamePanel);
        gamePanel.monster[mapNum][9].worldX = 53*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 45*gamePanel.florSize;

        mapNum++;
        gamePanel.monster[mapNum][0] = new Demon(gamePanel);
        gamePanel.monster[mapNum][0].worldX = 29*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 33*gamePanel.florSize;

        gamePanel.monster[mapNum][1] = new Slime(gamePanel);
        gamePanel.monster[mapNum][1].worldX = 33*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 53*gamePanel.florSize;

        gamePanel.monster[mapNum][2] = new Slime(gamePanel);
        gamePanel.monster[mapNum][2].worldX = 32*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 53*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 60*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 40*gamePanel.florSize;

        gamePanel.monster[mapNum][4] = new Slime(gamePanel);
        gamePanel.monster[mapNum][4].worldX = 60*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 19*gamePanel.florSize;

        gamePanel.monster[mapNum][5] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][5].worldX = 76*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 83*gamePanel.florSize;

        gamePanel.monster[mapNum][6] = new Demon(gamePanel);
        gamePanel.monster[mapNum][6].worldX = 37*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 65*gamePanel.florSize;

        gamePanel.monster[mapNum][7] = new Slime(gamePanel);
        gamePanel.monster[mapNum][7].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][8] = new Slime(gamePanel);
        gamePanel.monster[mapNum][8].worldX = 88*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][9] = new Slime(gamePanel);
        gamePanel.monster[mapNum][9].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 48*gamePanel.florSize;

        gamePanel.monster[mapNum][10] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][10].worldX = 18*gamePanel.florSize;
        gamePanel.monster[mapNum][10].worldY = 65*gamePanel.florSize;

        mapNum ++;


    }

    public void setDefault(){
        int mapNum = 0;
        gamePanel.monster[mapNum][0].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 7*gamePanel.florSize;

        gamePanel.monster[mapNum][1].worldX = 25*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 39*gamePanel.florSize;

        gamePanel.monster[mapNum][2].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][3].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 29*gamePanel.florSize;

        gamePanel.monster[mapNum][4].worldX = 28*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 14*gamePanel.florSize;

        gamePanel.monster[mapNum][5].worldX = 50*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 54*gamePanel.florSize;

        gamePanel.monster[mapNum][6].worldX = 49*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 12*gamePanel.florSize;

        gamePanel.monster[mapNum][7].worldX = 53*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][8].worldX = 52*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 45*gamePanel.florSize;

        gamePanel.monster[mapNum][9].worldX = 53*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 45*gamePanel.florSize;

        mapNum++;
        gamePanel.monster[mapNum][0].worldX = 29*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 33*gamePanel.florSize;

        gamePanel.monster[mapNum][1].worldX = 33*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 53*gamePanel.florSize;

        gamePanel.monster[mapNum][2].worldX = 32*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 53*gamePanel.florSize;

        gamePanel.monster[mapNum][3].worldX = 60*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 40*gamePanel.florSize;

        gamePanel.monster[mapNum][4].worldX = 60*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 19*gamePanel.florSize;

        gamePanel.monster[mapNum][5].worldX = 76*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 83*gamePanel.florSize;

        gamePanel.monster[mapNum][6].worldX = 37*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 65*gamePanel.florSize;

        gamePanel.monster[mapNum][7].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][8].worldX = 88*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][9].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 48*gamePanel.florSize;

        gamePanel.monster[mapNum][10].worldX = 18*gamePanel.florSize;
        gamePanel.monster[mapNum][10].worldY = 65*gamePanel.florSize;

    }
}
