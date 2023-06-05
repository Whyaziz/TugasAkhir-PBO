package main;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ui {
    GamePanel gamePanel;
    Font retro;
    int xCenter = 48*8;
    int yCenter = 48*6;
    public int menuNum = 0;
    public int mapNum = 0;
    public int pauseNum = 0;

    public Ui(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        getFont();
    }

    public void getFont(){
        try {
            retro = Font.createFont(Font.TRUETYPE_FONT, new File("res/Font/retro.ttf")).deriveFont(100f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(retro);
        } catch (IOException | FontFormatException e) {
            System.err.println("Failed to load font: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void drawMenuScreen(Graphics2D g2){
        String text = "THE MAZE RUNNER";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text,xCenter/4,yCenter/2);

        String text2 = "Play";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text2,xCenter/2+xCenter/3,yCenter+yCenter/3);
        if (menuNum == 1){
            g2.drawString(">",xCenter/2+xCenter/4,yCenter+yCenter/3);
        }

        String text3 = "Exit";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text3,xCenter/2+xCenter/3,yCenter+(yCenter/3)*2);
        if (menuNum == 2){
            g2.drawString(">",xCenter/2+xCenter/4,yCenter+(yCenter/3)*2);
        }

    }

    public void drawChooseMap(Graphics2D g2){
        String choose1 = "MAP 1";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(choose1,xCenter/2+xCenter/4,yCenter-yCenter/3);
        if (mapNum == 1){
            g2.drawString(">",xCenter/2+xCenter/6,yCenter-yCenter/3);
        }

        String choose2 = "MAP 2";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(choose2,xCenter/2+xCenter/4,yCenter);
        if (mapNum == 2){
            g2.drawString(">",xCenter/2+xCenter/6,yCenter);
        }

        String choose3 = "MAP 3";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(choose3,xCenter/2+xCenter/4,yCenter+yCenter/3);
        if (mapNum == 3){
            g2.drawString(">",xCenter/2+xCenter/6,yCenter+yCenter/3);
        }

    }

    public void drawGameOver(Graphics2D g2) {

        g2.setColor(new Color(0,0,0,150));
        g2.fillRect(0,0, gamePanel.screenWidth, gamePanel.screenHeight);

        String text1 = "GAME";
        g2.setFont(retro.deriveFont(150f));
        g2.setColor(Color.RED);
        g2.drawString(text1, xCenter/2 + xCenter/4, yCenter - yCenter/4);

        String text2 = "!!!OVER!!!";
        g2.setFont(retro);
        g2.setColor(Color.white);
        g2.drawString(text2, xCenter / 2 + xCenter / 4, yCenter + yCenter / 2);
    }

    public void drawWin(Graphics2D g2){
        g2.setColor(new Color(0,0,0,150));
        g2.fillRect(0,0, gamePanel.screenWidth, gamePanel.screenHeight);

        String text1 = "CONGRATULATION";
        g2.setFont(retro.deriveFont(120f));
        g2.setColor(Color.yellow);
        g2.drawString(text1, xCenter/ 4, yCenter - yCenter / 3);

        String text2 = "You Found The Way";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text2, xCenter/ 4, yCenter + yCenter / 3);
    }

    public void drawPause(Graphics2D g2){
        g2.setColor(new Color(0,0,0,150));
        g2.fillRect(0,0, gamePanel.screenWidth, gamePanel.screenHeight);

        String text = "THE MAZE RUNNER";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text,xCenter/4,yCenter/2);

        String text2 = "Main Menu";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text2,xCenter/2+xCenter/8,yCenter+yCenter/5);
        if (pauseNum == 1){
            g2.drawString(">",xCenter/2+xCenter/15,yCenter+yCenter/5);
        }
        String text3 = "Resume";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text3,xCenter/2+xCenter/8,yCenter+(yCenter/5)*2);
        if (pauseNum == 2){
            g2.drawString(">",xCenter/2+xCenter/15,yCenter+(yCenter/5)*2);
        }
        String text4 = "Quit";
        g2.setFont(retro);
        g2.setColor(Color.WHITE);
        g2.drawString(text4,xCenter/2+xCenter/8,yCenter+(yCenter/5)*3);
        if (pauseNum == 3){
            g2.drawString(">",xCenter/2+xCenter/15,yCenter+(yCenter/5)*3);
        }
    }
}
