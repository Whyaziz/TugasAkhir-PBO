package Objects;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObjects {
    public BufferedImage image;
    String name;
    public Boolean collision = false;
    public  int targetWorldX;
    public int targetWorldY;
    public Rectangle solidArea = new Rectangle(0,0,48,48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    public void draw(Graphics2D g2, GamePanel gamePanel){

        int screenX = targetWorldX - gamePanel.player.worldX + gamePanel.player.screenX; //menentukan map indeks x berapa yang harus digambar
        int screenY = targetWorldY - gamePanel.player.worldY + gamePanel.player.screenY; //menentukan map indeks x berapa yang harus digambar

        if (
                targetWorldX + gamePanel.florSize > gamePanel.player.worldX - gamePanel.player.screenX &&
                        targetWorldX - gamePanel.florSize < gamePanel.player.worldX + gamePanel.player.screenX &&
                        targetWorldY + gamePanel.florSize > gamePanel.player.worldY - gamePanel.player.screenY &&
                        targetWorldY - gamePanel.florSize < gamePanel.player.worldY + gamePanel.player.screenY
        ){
            g2.drawImage(image, screenX, screenY, gamePanel.florSize, gamePanel.florSize, null);
        }
    }

}
