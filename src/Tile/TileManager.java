package Tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class TileManager {
    GamePanel gamePanel;
    public Tile[] tiles;
    public int[][] mapTileNum;

    public TileManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        this.tiles = new Tile[36];
        this.mapTileNum = new int[gamePanel.worldCol][gamePanel.worldRow];

        getTileImage();
        loadMap("/Map/Map_3.0.txt");
    }

    public void loadMap(String mapPath){
        try {
            InputStream is = getClass().getResourceAsStream(mapPath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int colMap = 0;
            int rowMap = 0;

            while (colMap < gamePanel.worldCol && rowMap < gamePanel.worldRow){
                String line = br.readLine();

                while (colMap < gamePanel.worldCol){
                    String[] number = line.split(" ");

                    int num = Integer.parseInt(number[colMap]);
                    mapTileNum[colMap][rowMap] = num;
                    colMap++;
                }
                if (colMap == gamePanel.worldCol){
                    colMap = 0;
                    rowMap++;
                }
            }
            br.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void getTileImage(){
        try {
            tiles[0] = new Tile();
            tiles[0].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/000.png")));

            tiles[1] = new Tile();
            tiles[1].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/001.png")));

            tiles[2] = new Tile();
            tiles[2].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/002.png")));

            tiles[3] = new Tile();
            tiles[3].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/003.png")));

            tiles[4] = new Tile();
            tiles[4].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/004.png")));

            tiles[5] = new Tile();
            tiles[5].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/005.png")));

            tiles[6] = new Tile();
            tiles[6].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/006.png")));

            tiles[7] = new Tile();
            tiles[7].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/007.png")));

            tiles[8] = new Tile();
            tiles[8].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/008.png")));

            tiles[9] = new Tile();
            tiles[9].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/009.png")));

            tiles[10] = new Tile();
            tiles[10].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/010.png")));

            tiles[11] = new Tile();
            tiles[11].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/011.png")));

            tiles[12] = new Tile();
            tiles[12].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/012.png")));

            tiles[13] = new Tile();
            tiles[13].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/013.png")));

            tiles[14] = new Tile();
            tiles[14].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/014.png")));

            tiles[15] = new Tile();
            tiles[15].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/015.png")));

            tiles[16] = new Tile();
            tiles[16].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/016.png")));
            tiles[16].collision = true;

            tiles[17] = new Tile();
            tiles[17].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/017.png")));

            tiles[18] = new Tile();
            tiles[18].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/018.png")));
            tiles[18].collision = true;

            tiles[19] = new Tile();
            tiles[19].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/019.png")));
            tiles[19].collision = true;

            tiles[20] = new Tile();
            tiles[20].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/020.png")));
            tiles[20].collision = true;

            tiles[21] = new Tile();
            tiles[21].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/021.png")));
            tiles[21].collision = true;

            tiles[22] = new Tile();
            tiles[22].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/022.png")));
            tiles[22].collision = true;

            tiles[23] = new Tile();
            tiles[23].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/023.png")));
            tiles[23].collision = true;

            tiles[24] = new Tile();
            tiles[24].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/024.png")));
            tiles[24].collision = true;

            tiles[25] = new Tile();
            tiles[25].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/025.png")));
            tiles[25].collision = true;

            tiles[26] = new Tile();
            tiles[26].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/026.png")));
            tiles[26].collision = true;

            tiles[27] = new Tile();
            tiles[27].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/027.png")));
            tiles[27].collision = true;

            tiles[28] = new Tile();
            tiles[28].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/028.png")));
            tiles[28].collision = true;

            tiles[29] = new Tile();
            tiles[29].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/029.png")));
            tiles[29].collision = true;

            tiles[30] = new Tile();
            tiles[30].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/030.png")));
            tiles[30].collision = true;

            tiles[31] = new Tile();
            tiles[31].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/031.png")));
            tiles[31].collision = true;

            tiles[32] = new Tile();
            tiles[32].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/032.png")));

            tiles[33] = new Tile();
            tiles[33].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/033.png")));
            tiles[33].collision = true;

            tiles[34] = new Tile();
            tiles[34].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/034.png")));
            tiles[34].collision = true;

            tiles[35] = new Tile();
            tiles[35].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Tiles/035.png")));

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public void drawImage(Graphics2D g2){

        int col = 0;
        int row = 0;

        while (col < gamePanel.worldCol && row < gamePanel.worldRow){

            int tileNum = mapTileNum[col][row];

            int worldX = col* gamePanel.florSize;
            int worldY = row* gamePanel.florSize;
            int screenX = worldX - gamePanel.player.worldX + gamePanel.player.screenX; //menentukan map indeks x berapa yang harus digambar
            int screenY = worldY - gamePanel.player.worldY + gamePanel.player.screenY; //menentukan map indeks x berapa yang harus digambar

            if (
                worldX + gamePanel.florSize > gamePanel.player.worldX - gamePanel.player.screenX &&
                worldX - gamePanel.florSize < gamePanel.player.worldX + gamePanel.player.screenX &&
                worldY + gamePanel.florSize > gamePanel.player.worldY - gamePanel.player.screenY &&
                worldY - gamePanel.florSize < gamePanel.player.worldY + gamePanel.player.screenY
            ){
                g2.drawImage(tiles[tileNum].image, screenX, screenY, gamePanel.florSize, gamePanel.florSize, null);
            }
            col ++;

            if (col == gamePanel.worldCol){
                col = 0;
                row++;
            }
        }
    }
}
