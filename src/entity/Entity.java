package entity;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity {
    public int worldX, worldY;
    public int speed;

    int spriteCounter = 0;
    int spriteNum = 1;
    public GamePanel gamePanel;

    public BufferedImage
            up1, up2, up3, up4, up5, up6,
            left1, left2, left3, left4, left5, left6,
            down1, down2, down3, down4, down5, down6,
            right1, right2, right3, right4, right5, right6;

    public String direction;
    public Rectangle solidArea = new Rectangle(0,0,48,48);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public Boolean isCollisionOn = false;

    public Entity(GamePanel gp) {
        this.gamePanel = gp;
    }

    public void setAction(){

    }

    public void update(){
        spriteCounter ++;
        if (spriteCounter > 10){
            spriteNum += 1;
            if (spriteNum >= 6){
                spriteNum = 1;
            }

            spriteCounter = 0;
        }
        setAction();

        isCollisionOn = false;
        gamePanel.collisionChecker.checkTile(this);
    }

    public void draw(Graphics2D g2){

        BufferedImage image = null;

        int screenX = worldX - gamePanel.player.worldX + gamePanel.player.screenX; //menentukan map indeks x berapa yang harus digambar
        int screenY = worldY - gamePanel.player.worldY + gamePanel.player.screenY; //menentukan map indeks x berapa yang harus digambar

        if (
                worldX + gamePanel.florSize > gamePanel.player.worldX - gamePanel.player.screenX &&
                        worldX - gamePanel.florSize < gamePanel.player.worldX + gamePanel.player.screenX &&
                        worldY + gamePanel.florSize > gamePanel.player.worldY - gamePanel.player.screenY &&
                        worldY - gamePanel.florSize < gamePanel.player.worldY + gamePanel.player.screenY
        ){

            switch (direction) {
                case ("up") -> {
                    if (spriteNum == 1) {
                        image = up1;
                    } else if (spriteNum == 2) {
                        image = up2;
                    } else if (spriteNum == 3) {
                        image = up3;
                    } else if (spriteNum == 4) {
                        image = up4;
                    } else if (spriteNum == 5) {
                        image = up5;
                    } else if (spriteNum == 6) {
                        image = up6;
                    }

                }
                case ("left") -> {
                    if (spriteNum == 1) {
                        image = left1;
                    } else if (spriteNum == 2) {
                        image = left2;
                    } else if (spriteNum == 3) {
                        image = left3;
                    } else if (spriteNum == 4) {
                        image = left4;
                    } else if (spriteNum == 5) {
                        image = left5;
                    } else if (spriteNum == 6) {
                        image = left6;
                    }
                }
                case ("down") -> {
                    if (spriteNum == 1) {
                        image = down1;
                    } else if (spriteNum == 2) {
                        image = down2;
                    } else if (spriteNum == 3) {
                        image = down3;
                    } else if (spriteNum == 4) {
                        image = down4;
                    } else if (spriteNum == 5) {
                        image = down5;
                    } else if (spriteNum == 6) {
                        image = down6;
                    }
                }
                case ("right") -> {
                    if (spriteNum == 1) {
                        image = right1;
                    } else if (spriteNum == 2) {
                        image = right2;
                    } else if (spriteNum == 3) {
                        image = right3;
                    } else if (spriteNum == 4) {
                        image = right4;
                    } else if (spriteNum == 5) {
                        image = right5;
                    } else if (spriteNum == 6) {
                        image = right6;
                    }
                }
            }

            if (!isCollisionOn && gamePanel.gameState==gamePanel.playingState){
                switch (direction){
                    case "up" -> worldY -= speed;
                    case "left" -> worldX -= speed;
                    case "down" -> worldY += speed;
                    case "right" -> worldX += speed;
                }
            }

            g2.drawImage(image, screenX, screenY, gamePanel.florSize*2, gamePanel.florSize*2, null);
        }
    }
}
