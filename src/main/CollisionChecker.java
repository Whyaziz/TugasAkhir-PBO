package main;

import entity.Entity;

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
            case "up" -> {
                topRow = (topY - entity.speed) / gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][leftCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][rightCol][topRow];
                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
            }
            case "down" -> {
                bottomRow = (bottomY + entity.speed) / gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][leftCol][bottomRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][rightCol][bottomRow];
                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
            }
            case "left" -> {
                leftCol = (leftX - entity.speed) / gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][leftCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][leftCol][bottomRow];
                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
            }
            case "right" -> {
                rightCol = (rightX + entity.speed) / gamePanel.florSize;
                tileNum1 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][rightCol][topRow];
                tileNum2 = gamePanel.tileManager.mapTileNum[gamePanel.currentMap][rightCol][bottomRow];
                if (gamePanel.tileManager.tiles[tileNum1].collision || gamePanel.tileManager.tiles[tileNum2].collision) {
                    entity.isCollisionOn = true;
                }
            }
        }
    }

    public boolean checkExit(Entity entity, Boolean player){
        boolean touched = false;

        entity.solidArea.x = entity.solidArea.x + entity.worldX;
        entity.solidArea.y = entity.solidArea.y + entity.worldY;

        gamePanel.exitDoor[gamePanel.currentMap].solidArea.x = gamePanel.exitDoor[gamePanel.currentMap].solidArea.x +gamePanel.exitDoor[gamePanel.currentMap].targetWorldX;
        gamePanel.exitDoor[gamePanel.currentMap].solidArea.y = gamePanel.exitDoor[gamePanel.currentMap].solidArea.y +gamePanel.exitDoor[gamePanel.currentMap].targetWorldY;

        switch (entity.direction) {
            case "up" -> {
                entity.solidArea.y -= entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor[gamePanel.currentMap].solidArea)) {
                    touched = true;
                }
            }
            case "down" -> {
                entity.solidArea.y += entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor[gamePanel.currentMap].solidArea)) {
                    touched = true;
                }
            }
            case "left" -> {
                entity.solidArea.x -= entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor[gamePanel.currentMap].solidArea)) {
                    touched = true;
                }
            }
            case "right" -> {
                entity.solidArea.x += entity.speed;
                if (entity.solidArea.intersects(gamePanel.exitDoor[gamePanel.currentMap].solidArea)) {
                    touched = true;
                }
            }

        }

        entity.solidArea.x = entity.solidAreaDefaultX;
        entity.solidArea.y = entity.solidAreaDefaultY;
        gamePanel.exitDoor[gamePanel.currentMap].solidArea.x = gamePanel.exitDoor[gamePanel.currentMap].solidAreaDefaultX;
        gamePanel.exitDoor[gamePanel.currentMap].solidArea.y = gamePanel.exitDoor[gamePanel.currentMap].solidAreaDefaultY;

        return touched;
    }

    public boolean checkEntity(Entity entity, Entity[][] target){
        boolean touched = false;

        for (int i = 0; i < target[1].length; i++){
            if (target[gamePanel.currentMap][i]!=null){
                entity.solidArea.x = entity.solidArea.x + entity.worldX;
                entity.solidArea.y = entity.solidArea.y + entity.worldY;

                target[gamePanel.currentMap][i].solidArea.x = target[gamePanel.currentMap][i].solidArea.x +target[gamePanel.currentMap][i].worldX;
                target[gamePanel.currentMap][i].solidArea.y = target[gamePanel.currentMap][i].solidArea.y +target[gamePanel.currentMap][i].worldY;

                switch (entity.direction) {
                    case ("up") -> {
                        entity.solidArea.y -= entity.speed;
                        if (entity.solidArea.intersects(target[gamePanel.currentMap][i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }

                    }
                    case ("left") -> {
                        entity.solidArea.x -= entity.speed;
                        if (entity.solidArea.intersects(target[gamePanel.currentMap][i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                    case ("down") -> {
                        entity.solidArea.y += entity.speed;
                        if (entity.solidArea.intersects(target[gamePanel.currentMap][i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                    case ("right") -> {
                        entity.solidArea.x += entity.speed;
                        if (entity.solidArea.intersects(target[gamePanel.currentMap][i].solidArea)){
                            entity.isCollisionOn = true;
                            touched = true;
                        }
                    }
                }
                entity.solidArea.x = entity.solidAreaDefaultX;
                entity.solidArea.y = entity.solidAreaDefaultY;
                target[gamePanel.currentMap][i].solidArea.x = target[gamePanel.currentMap][i].solidAreaDefaultX;
                target[gamePanel.currentMap][i].solidArea.y = target[gamePanel.currentMap][i].solidAreaDefaultY;
            }
        }
        return touched;
    }

}
