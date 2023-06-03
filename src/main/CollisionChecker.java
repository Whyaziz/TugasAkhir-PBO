package main;

import entity.Entity;
import entity.Player;

public class CollisionChecker {

    GamePanel gamePanel;

    public CollisionChecker(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void checkTile(Entity entity){

        int leftX = entity.worldX + entity.solidArea.x;
        int rightX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int topY = entity.worldY + entity.solidArea.y;
        int bottomY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        int leftCol = leftX/gamePanel.florSize;
        int rightCol = rightX/gamePanel.florSize;
        int topRow = topY/gamePanel.florSize;
        int bottomRow = bottomY/gamePanel.florSize;

        int tileNum1, tileNum2;

        switch (entity.direction) {
            case "up":
                topRow = (topY - entity.speed)/gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[leftCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[rightCol][topRow];

                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
                break;
            case "down":
                bottomRow = (bottomY + entity.speed)/gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[leftCol][bottomRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[rightCol][bottomRow];

                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
                break;
            case "left":
                leftCol = (leftX - entity.speed)/gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[leftCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[leftCol][bottomRow];

                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
                break;
            case "right":
                rightCol = (rightX + entity.speed)/gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[rightCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[rightCol][bottomRow];

                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
                break;
        }
    }

    public boolean checkExit(Entity entity, Boolean player){
        boolean touched = false;

        entity.solidArea.x = entity.solidArea.x + entity.worldX;
        entity.solidArea.y = entity.solidArea.y + entity.worldY;

        gamePanel.exitDoor.solidArea.x = gamePanel.exitDoor.solidArea.x +gamePanel.exitDoor.targetWorldX;
        gamePanel.exitDoor.solidArea.y = gamePanel.exitDoor.solidArea.y +gamePanel.exitDoor.targetWorldY;

        switch (entity.direction) {
            case "up" -> {
                entity.solidArea.y -= entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor.solidArea)) {
                    touched = true;
                }
            }
            case "down" -> {
                entity.solidArea.y += entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor.solidArea)) {
                    touched = true;
                }
            }
            case "left" -> {
                entity.solidArea.x -= entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor.solidArea)) {
                    touched = true;
                }
            }
            case "right" -> {
                entity.solidArea.x += entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor.solidArea)) {
                    touched = true;
                }
            }

        }

        entity.solidArea.x = entity.solidAreaDefaultX;
        entity.solidArea.y = entity.solidAreaDefaultY;
        gamePanel.exitDoor.solidArea.x = gamePanel.exitDoor.solidAreaDefaultX;
        gamePanel.exitDoor.solidArea.y = gamePanel.exitDoor.solidAreaDefaultY;

        return touched;
    }

    public boolean checkEntity(Entity entity, Entity[] target){
        boolean touched = false;

        for (int i = 0; i < target.length; i++){
            if (target[i]!=null){
                entity.solidArea.x = entity.solidArea.x + entity.worldX;
                entity.solidArea.y = entity.solidArea.y + entity.worldY;

                target[i].solidArea.x = target[i].solidArea.x +target[i].worldX;
                target[i].solidArea.y = target[i].solidArea.y +target[i].worldY;

                switch (entity.direction) {
                    case ("up") -> {
                        entity.solidArea.y -= entity.speed;
                        if (entity.solidArea.intersects(target[i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }

                    }
                    case ("left") -> {
                        entity.solidArea.x -= entity.speed;
                        if (entity.solidArea.intersects(target[i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                    case ("down") -> {
                        entity.solidArea.y += entity.speed;
                        if (entity.solidArea.intersects(target[i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                    case ("right") -> {
                        entity.solidArea.x += entity.speed;
                        if (entity.solidArea.intersects(target[i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                }
                entity.solidArea.x = entity.solidAreaDefaultX;
                entity.solidArea.y = entity.solidAreaDefaultY;
                target[i].solidArea.x = target[i].solidAreaDefaultX;
                target[i].solidArea.y = target[i].solidAreaDefaultY;
            }
        }
        return touched;
    }

}
