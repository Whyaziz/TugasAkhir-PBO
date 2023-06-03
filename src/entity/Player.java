package entity;

import main.GamePanel;
import main.KeyListener;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity{

    KeyListener keyListener;
    public final int screenX;
    public final int screenY;

    public BufferedImage idleU1, idleU2, idleU3, idleU4, idleU5, idleU6,
            idleL1, idleL2, idleL3, idleL4, idleL5, idleL6,
            idleD1, idleD2, idleD3, idleD4, idleD5, idleD6,
            idleR1, idleR2, idleR3, idleR4, idleR5, idleR6;


    public Player(GamePanel gamePanel, KeyListener keyListener) {
        super(gamePanel);
        this.keyListener = keyListener;

        screenX = gamePanel.screenWidth/2 - 16;
        screenY = gamePanel.screenHeight/2 - 24;

        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        solidArea.width = 16;
        solidArea.height = 16;

        setDefaultValues();
        getEntityImage();
    }

    public void setDefaultValues(){
        worldX = 10*gamePanel.florSize;
        worldY = 8*gamePanel.florSize;
        speed = 3;
        direction = "down";
    }

    public void update(){

        if(keyListener.pressRight){
            direction = "right";
        }
        else if(keyListener.pressLeft){
            direction = "left";
        }
        else if(keyListener.pressUp){
            direction = "up";
        }
        else if(keyListener.pressDown){
            direction = "down";
        }

        //check flor
        isCollisionOn = false;
        gamePanel.collisionChecker.checkTile(this);

        //check obj



        if (!isCollisionOn){
            if (keyListener.pressUp|| keyListener.pressLeft|| keyListener.pressDown|| keyListener.pressRight){
                switch (direction){
                    case "up" -> worldY -= speed;
                    case "left" -> worldX -= speed;
                    case "down" -> worldY += speed;
                    case "right" -> worldX += speed;
                }
            }
        }

        spriteCounter ++;
        if (spriteCounter > 10){
            spriteNum += 1;
            if (spriteNum >= 6){
                spriteNum = 1;
            }

            spriteCounter = 0;
        }
    }

    public void draw(Graphics2D g2){

        BufferedImage image = null;

        if (keyListener.pressUp|| keyListener.pressLeft|| keyListener.pressDown|| keyListener.pressRight){

            switch (direction) {
                case ("up") -> {
                    if (spriteNum == 1) {
                        image = up1;
                    }
                    else if (spriteNum == 2) {
                        image = up2;
                    }
                    else if (spriteNum == 3) {
                        image = up3;
                    }
                    else if (spriteNum == 4) {
                        image = up4;
                    }
                    else if (spriteNum == 5) {
                        image = up5;
                    }
                    else if (spriteNum == 6) {
                        image = up6;
                    }

                }
                case ("left") -> {
                    if (spriteNum == 1) {
                        image = left1;
                    }
                    else if (spriteNum == 2) {
                        image = left2;
                    }
                    else if (spriteNum == 3) {
                        image = left3;
                    }
                    else if (spriteNum == 4) {
                        image = left4;
                    }
                    else if (spriteNum == 5) {
                        image = left5;
                    }
                    else if (spriteNum == 6) {
                        image = left6;
                    }
                }
                case ("down") -> {
                    if (spriteNum == 1) {
                        image = down1;
                    }
                    else if (spriteNum == 2) {
                        image = down2;
                    }
                    else if (spriteNum == 3) {
                        image = down3;
                    }
                    else if (spriteNum == 4) {
                        image = down4;
                    }
                    else if (spriteNum == 5) {
                        image = down5;
                    }
                    else if (spriteNum == 6) {
                        image = down6;
                    }
                }
                case ("right") -> {
                    if (spriteNum == 1) {
                        image = right1;
                    }
                    else if (spriteNum == 2) {
                        image = right2;
                    }
                    else if (spriteNum == 3) {
                        image = right3;
                    }
                    else if (spriteNum == 4) {
                        image = right4;
                    }
                    else if (spriteNum == 5) {
                        image = right5;
                    }
                    else if (spriteNum == 6) {
                        image = right6;
                    }
                }
            }

        }
        else {
            switch (direction) {
                case ("up") -> {
                    if (spriteNum == 1) {
                        image = idleU1;
                    }
                    else if (spriteNum == 2) {
                        image = idleU2;
                    }
                    else if (spriteNum == 3) {
                        image = idleU3;
                    }
                    else if (spriteNum == 4) {
                        image = idleU4;
                    }
                    else if (spriteNum == 5) {
                        image = idleU5;
                    }
                    else if (spriteNum == 6) {
                        image = idleU6;
                    }

                }
                case ("left") -> {
                    if (spriteNum == 1) {
                        image = idleL1;
                    }
                    else if (spriteNum == 2) {
                        image = idleL2;
                    }
                    else if (spriteNum == 3) {
                        image = idleL3;
                    }
                    else if (spriteNum == 4) {
                        image = idleL4;
                    }
                    else if (spriteNum == 5) {
                        image = idleL5;
                    }
                    else if (spriteNum == 6) {
                        image = idleL6;
                    }
                }
                case ("down") -> {
                    if (spriteNum == 1) {
                        image = idleD1;
                    }
                    else if (spriteNum == 2) {
                        image = idleD2;
                    }
                    else if (spriteNum == 3) {
                        image = idleD3;
                    }
                    else if (spriteNum == 4) {
                        image = idleD4;
                    }
                    else if (spriteNum == 5) {
                        image = idleD5;
                    }
                    else if (spriteNum == 6) {
                        image = idleD6;
                    }
                }
                case ("right") -> {
                    if (spriteNum == 1) {
                        image = idleR1;
                    }
                    else if (spriteNum == 2) {
                        image = idleR2;
                    }
                    else if (spriteNum == 3) {
                        image = idleR3;
                    }
                    else if (spriteNum == 4) {
                        image = idleR4;
                    }
                    else if (spriteNum == 5) {
                        image = idleR5;
                    }
                    else if (spriteNum == 6) {
                        image = idleR6;
                    }
                }
            }
        }

        g2.drawImage(image, screenX, screenY, gamePanel.florSize, gamePanel.florSize, null);
    }

    public void getEntityImage(){
        try {

            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop1.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop2.png")));
            up3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop3.png")));
            up4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop4.png")));
            up5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop5.png")));
            up6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveTop6.png")));

            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown1.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown2.png")));
            down3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown3.png")));
            down4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown4.png")));
            down5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown5.png")));
            down6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveDown6.png")));

            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft1.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft2.png")));
            left3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft3.png")));
            left4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft4.png")));
            left5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft5.png")));
            left6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveLeft6.png")));

            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight1.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight2.png")));
            right3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight3.png")));
            right4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight4.png")));
            right5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight5.png")));
            right6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_moveRight6.png")));

            idleD1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown1.png")));
            idleD2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown2.png")));
            idleD3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown3.png")));
            idleD4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown4.png")));
            idleD5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown5.png")));
            idleD6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleDown6.png")));

            idleL1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft1.png")));
            idleL2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft2.png")));
            idleL3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft3.png")));
            idleL4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft4.png")));
            idleL5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft5.png")));
            idleL6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleLeft6.png")));

            idleU1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop1.png")));
            idleU2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop2.png")));
            idleU3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop3.png")));
            idleU4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop4.png")));
            idleU5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop5.png")));
            idleU6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleTop6.png")));

            idleR1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight1.png")));
            idleR2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight2.png")));
            idleR3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight3.png")));
            idleR4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight4.png")));
            idleR5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight5.png")));
            idleR6 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Player/char_idleRight6.png")));

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean hitMonster(){
        boolean hit = gamePanel.collisionChecker.checkEntity(this, gamePanel.monster);
        return hit;
    }

    public boolean gameFinished(){
        boolean win = gamePanel.collisionChecker.checkExit(this, true);
        return win;
    }
}
