package main;

import Monster.Demon;
import Monster.Goblin;
import Monster.Slime;
import Objects.ExitDoor;
import Objects.TeleportMerah;
import Objects.TeleportUngu;


public class ObjectsSetter {
    GamePanel gamePanel;
    public int xTeleMerah, xTeleUngu;
    public int yTeleMerah, yTeleUngu;

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

    public void setTeleport(){
        int mapNum = 0;
        gamePanel.teleportMerah[mapNum] = new TeleportMerah();
        gamePanel.teleportMerah[mapNum].targetWorldX = 46 * gamePanel.florSize;
        gamePanel.teleportMerah[mapNum].targetWorldY = 10 * gamePanel.florSize;

        gamePanel.teleportUngu[mapNum] = new TeleportUngu();
        gamePanel.teleportUngu[mapNum].targetWorldX = 11 * gamePanel.florSize;
        gamePanel.teleportUngu[mapNum].targetWorldY = 45 * gamePanel.florSize;

        mapNum = 1;
        gamePanel.teleportMerah[mapNum] = new TeleportMerah();
        gamePanel.teleportMerah[mapNum].targetWorldX = 19 * gamePanel.florSize;
        gamePanel.teleportMerah[mapNum].targetWorldY = 46 * gamePanel.florSize;

        gamePanel.teleportUngu[mapNum] = new TeleportUngu();
        gamePanel.teleportUngu[mapNum].targetWorldX = 93 * gamePanel.florSize;
        gamePanel.teleportUngu[mapNum].targetWorldY = 25 * gamePanel.florSize;

        mapNum = 2;
        gamePanel.teleportMerah[mapNum] = new TeleportMerah();
        gamePanel.teleportMerah[mapNum].targetWorldX = 12 * gamePanel.florSize;
        gamePanel.teleportMerah[mapNum].targetWorldY = 37 * gamePanel.florSize;

        gamePanel.teleportUngu[mapNum] = new TeleportUngu();
        gamePanel.teleportUngu[mapNum].targetWorldX = 47 * gamePanel.florSize;
        gamePanel.teleportUngu[mapNum].targetWorldY = 13 * gamePanel.florSize;
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
        gamePanel.monster[mapNum][2].worldX = 51*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 44*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 32*gamePanel.florSize;

        gamePanel.monster[mapNum][4] = new Demon(gamePanel);
        gamePanel.monster[mapNum][4].worldX = 28*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 14*gamePanel.florSize;

        gamePanel.monster[mapNum][5] = new Demon(gamePanel);
        gamePanel.monster[mapNum][5].worldX = 50*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 53*gamePanel.florSize;

        gamePanel.monster[mapNum][6] = new Demon(gamePanel);
        gamePanel.monster[mapNum][6].worldX = 49*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 12*gamePanel.florSize;

        gamePanel.monster[mapNum][7] = new Slime(gamePanel);
        gamePanel.monster[mapNum][7].worldX = 50*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][8] = new Slime(gamePanel);
        gamePanel.monster[mapNum][8].worldX = 51*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 45*gamePanel.florSize;

        gamePanel.monster[mapNum][9] = new Slime(gamePanel);
        gamePanel.monster[mapNum][9].worldX = 50*gamePanel.florSize;
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
        gamePanel.monster[mapNum][0] = new Slime(gamePanel);
        gamePanel.monster[mapNum][0].worldX = 81*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][1] = new Slime(gamePanel);
        gamePanel.monster[mapNum][1].worldX = 81*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 15*gamePanel.florSize;

        gamePanel.monster[mapNum][2] = new Slime(gamePanel);
        gamePanel.monster[mapNum][2].worldX = 83*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][3] = new Slime(gamePanel);
        gamePanel.monster[mapNum][3].worldX = 79*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][4] = new Demon(gamePanel);
        gamePanel.monster[mapNum][4].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 43*gamePanel.florSize;

        gamePanel.monster[mapNum][5] = new Demon(gamePanel);
        gamePanel.monster[mapNum][5].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][6] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][6].worldX = 19*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][7] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][7].worldX = 16*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 63*gamePanel.florSize;

        gamePanel.monster[mapNum][8] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][8].worldX = 22*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 63*gamePanel.florSize;

        gamePanel.monster[mapNum][9] = new Demon(gamePanel);
        gamePanel.monster[mapNum][9].worldX = 43*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 73*gamePanel.florSize;

        gamePanel.monster[mapNum][10] = new Demon(gamePanel);
        gamePanel.monster[mapNum][10].worldX = 43*gamePanel.florSize;
        gamePanel.monster[mapNum][10].worldY = 72*gamePanel.florSize;

        gamePanel.monster[mapNum][11] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][11].worldX = 91*gamePanel.florSize;
        gamePanel.monster[mapNum][11].worldY = 43*gamePanel.florSize;

        gamePanel.monster[mapNum][12] = new Goblin(gamePanel);
        gamePanel.monster[mapNum][12].worldX = 93*gamePanel.florSize;
        gamePanel.monster[mapNum][12].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][13] = new Demon(gamePanel);
        gamePanel.monster[mapNum][13].worldX = 65*gamePanel.florSize;
        gamePanel.monster[mapNum][13].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][14] = new Demon(gamePanel);
        gamePanel.monster[mapNum][14].worldX = 65*gamePanel.florSize;
        gamePanel.monster[mapNum][14].worldY = 42*gamePanel.florSize;

        gamePanel.monster[mapNum][15] = new Slime(gamePanel);
        gamePanel.monster[mapNum][15].worldX = 46*gamePanel.florSize;
        gamePanel.monster[mapNum][15].worldY = 28*gamePanel.florSize;

        gamePanel.monster[mapNum][16] = new Slime(gamePanel);
        gamePanel.monster[mapNum][16].worldX = 48*gamePanel.florSize;
        gamePanel.monster[mapNum][16].worldY = 28*gamePanel.florSize;

        gamePanel.monster[mapNum][17] = new Slime(gamePanel);
        gamePanel.monster[mapNum][17].worldX = 46*gamePanel.florSize;
        gamePanel.monster[mapNum][17].worldY = 29*gamePanel.florSize;

        gamePanel.monster[mapNum][18] = new Slime(gamePanel);
        gamePanel.monster[mapNum][18].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][18].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][19] = new Slime(gamePanel);
        gamePanel.monster[mapNum][19].worldX = 40*gamePanel.florSize;
        gamePanel.monster[mapNum][19].worldY = 42*gamePanel.florSize;
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

        mapNum++;
        gamePanel.monster[mapNum][0].worldX = 81*gamePanel.florSize;
        gamePanel.monster[mapNum][0].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][1].worldX = 81*gamePanel.florSize;
        gamePanel.monster[mapNum][1].worldY = 15*gamePanel.florSize;

        gamePanel.monster[mapNum][2].worldX = 83*gamePanel.florSize;
        gamePanel.monster[mapNum][2].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][3].worldX = 79*gamePanel.florSize;
        gamePanel.monster[mapNum][3].worldY = 13*gamePanel.florSize;

        gamePanel.monster[mapNum][4].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][4].worldY = 43*gamePanel.florSize;

        gamePanel.monster[mapNum][5].worldX = 86*gamePanel.florSize;
        gamePanel.monster[mapNum][5].worldY = 44*gamePanel.florSize;

        gamePanel.monster[mapNum][6].worldX = 19*gamePanel.florSize;
        gamePanel.monster[mapNum][6].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][7].worldX = 16*gamePanel.florSize;
        gamePanel.monster[mapNum][7].worldY = 63*gamePanel.florSize;

        gamePanel.monster[mapNum][8].worldX = 22*gamePanel.florSize;
        gamePanel.monster[mapNum][8].worldY = 63*gamePanel.florSize;

        gamePanel.monster[mapNum][9].worldX = 43*gamePanel.florSize;
        gamePanel.monster[mapNum][9].worldY = 73*gamePanel.florSize;

        gamePanel.monster[mapNum][10].worldX = 43*gamePanel.florSize;
        gamePanel.monster[mapNum][10].worldY = 72*gamePanel.florSize;

        gamePanel.monster[mapNum][11].worldX = 91*gamePanel.florSize;
        gamePanel.monster[mapNum][11].worldY = 43*gamePanel.florSize;

        gamePanel.monster[mapNum][12].worldX = 93*gamePanel.florSize;
        gamePanel.monster[mapNum][12].worldY = 46*gamePanel.florSize;

        gamePanel.monster[mapNum][13].worldX = 65*gamePanel.florSize;
        gamePanel.monster[mapNum][13].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][14].worldX = 65*gamePanel.florSize;
        gamePanel.monster[mapNum][14].worldY = 42*gamePanel.florSize;

        gamePanel.monster[mapNum][15].worldX = 46*gamePanel.florSize;
        gamePanel.monster[mapNum][15].worldY = 28*gamePanel.florSize;

        gamePanel.monster[mapNum][16].worldX = 48*gamePanel.florSize;
        gamePanel.monster[mapNum][16].worldY = 28*gamePanel.florSize;

        gamePanel.monster[mapNum][17].worldX = 46*gamePanel.florSize;
        gamePanel.monster[mapNum][17].worldY = 29*gamePanel.florSize;

        gamePanel.monster[mapNum][18].worldX = 38*gamePanel.florSize;
        gamePanel.monster[mapNum][18].worldY = 41*gamePanel.florSize;

        gamePanel.monster[mapNum][19].worldX = 40*gamePanel.florSize;
        gamePanel.monster[mapNum][19].worldY = 42*gamePanel.florSize;

    }
}
