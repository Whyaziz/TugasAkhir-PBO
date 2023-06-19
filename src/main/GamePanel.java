package main;

import Objects.ExitDoor;
import Tile.TileManager;
import entity.Entity;
import entity.Player;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    final int originalFlorSize = 16;
    final int scale = 3;
    public final int screenCol = 16;
    public final int screenRow = 12;
    public final int florSize = originalFlorSize*scale;
    public final int screenWidth = florSize * screenCol; //768
    public final int screenHeight = florSize * screenRow; //576


    public Thread gameThread;


    //Map
    public final int worldCol = 150;
    public final int worldRow = 150;
    public int currentMap = 0;
    public final int maxMap = 3;

    //FPS
    final int fps = 60;

    //Objects
    public Ui ui = new Ui(this);
    KeyListener move = new KeyListener(this);
    public Player player = new Player(this, move);
    TileManager tileManager = new TileManager(this);
    public CollisionChecker collisionChecker = new CollisionChecker(this);
    public ExitDoor[] exitDoor = new ExitDoor[10];
    public Entity[][] monster = new Entity[maxMap][20];
    public ObjectsSetter objectsSetter = new ObjectsSetter(this);

    //GameState
    public int gameState;
    public final int menuState = 0;
    public final int playState = 1;
    public final int playingState = 2;
    public final int pauseState = 3;
    public final int loseState = 99;
    public final int winState = 100;


    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(move);
        this.setFocusable(true);
    }

    public void setUpGame(){
        objectsSetter.setExit();
        objectsSetter.setMonster();

        gameState = menuState;
    }

    public void startGame(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double paintInterval = 1_000_000_000/fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int paintcount = 0;

        while (gameThread != null){

            currentTime = System.nanoTime();
            delta += (currentTime-lastTime)/paintInterval; //membagi waktu yang berlalu dengan 0,016 detik;
            timer += (currentTime-lastTime);
            lastTime = currentTime;

            if(delta >= 1){ //delta akan 1 ketika waktu yang telah berjalan lebih atau sama dengan 0,016 detik

                update(); //update data terbaru
                repaint(); //menampilkan data berdasarkan data terbaru

                delta --; //mereset delta
                paintcount ++; //menghitung setiap perulangan
            }

            if (timer >= 1000000000){ //akan menghitung berapa kali perulangan terjadi selama 1 detik
                System.out.println("FPS : "+paintcount);
                paintcount = 0; //mereset hitungan perulangan
                timer = 0; //mereset timer
            }

        }
    }

    public void update(){

        if (gameState == playingState){
            player.update();
            for (int i=0; i < monster[1].length; i++) {
                if (monster[currentMap][i] != null) {
                    monster[currentMap][i].update();
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        if (gameState == menuState){
            ui.drawMenuScreen(g2);
        }
        if (gameState == playState){
            ui.drawChooseMap(g2);
        }
        if (gameState == playingState || gameState == loseState || gameState == winState || gameState == pauseState){
            tileManager.drawImage(g2);
            exitDoor[currentMap].draw(g2, this);
            for (int i=0; i < monster[1].length; i++) {
                if (monster[currentMap][i] != null) {
                    monster[currentMap][i].draw(g2);
                }
            }
            player.draw(g2);
            if (player.hitMonster()){
                gameState = loseState;
            }
            if (gameState == loseState){
                ui.drawGameOver(g2);
            }
            if (player.gameFinished()){
                gameState = winState;
            }
            if (gameState == winState){
                ui.drawWin(g2);
            }
            if (gameState == pauseState){
                ui.drawPause(g2);
            }
            g2.dispose();
        }

        if (gameState == winState || gameState == loseState){
            if (move.pressEnter){
                gameState = menuState;
                ui.drawMenuScreen(g2);
                player.setDefaultValues();
                objectsSetter.setDefault();
            }
        }

    }

}
